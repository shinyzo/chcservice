package com.lming.chcservice.form;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.PropertyUtilsBean;

/**
 * Form表单数据转换成map对象
 *
 * @Author shinyZo
 * @date 2017-11-23
 * @description
 */
@Slf4j
public class Form2MapConvert {

    /**
     * 将对象转成map
     * 会将该对象以及该对象的所有父类属性都进行查找并转换成map
     * 如果该对象的值为null则不会插入到map中
     * @param obj
     * @return
     */
    public static Map<String, Object> convert(Object obj) {
        Map<String, Object> paramsMap = new HashMap<String, Object>(0);
        if (obj == null) return paramsMap;
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean
                    .getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!"class".equals(name)) {
                    Object val = propertyUtilsBean.getNestedProperty(obj, name);
                    if (val != null) {
                        paramsMap.put(name, val);
                        log.info("{}=>{}", name, val);
                    }
                }
            }
        } catch (Exception e) {
            log.error("Form 转 map 异常");
            e.printStackTrace();
        }
        return paramsMap;
    }

    /**
     * 通过反射机制获取当前类的属性和值
     * 获取该类的上一个父类的属性和值得（仅仅是上面一个父类的属性和值）
     * @param obj
     * @return
     */
    public static Map<String, Object> convert2Map(Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 得到类对象
        Class userCla = (Class) obj.getClass();
        Class superClazz = userCla.getSuperclass();
        /* 得到类中的所有属性集合 */
        Field[] fs = userCla.getDeclaredFields();
        getFieldAndValue(fs, obj, map);
        getFieldAndValue(superClazz.getDeclaredFields(), obj, map);
        log.info("单个对象的所有键值==反射==" + map.toString());
        return map;
    }

    public static void  getFieldAndValue(Field[] fs, Object obj, Map<String, Object> map) {
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); // 设置些属性是可以访问的
            Object val = new Object();
            try {
                val = f.get(obj);
                // 得到此属性的值
                map.put(f.getName(), val);// 设置键值
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DoctorQueryForm doctorQueryForm = new DoctorQueryForm(1, 2);
        convert(doctorQueryForm);
        convert2Map(doctorQueryForm);
    }
}