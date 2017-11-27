package com.lming.chcservice.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.lming.chcservice.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class GsonUtil {

    /**
     * 将对象转成json格式
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        return gson.toJson(object);

    }

    public static <T> T json2Entity(String jsonData, Class<?> clazz) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        // gsonBuilder.setDateFormat("yyyy-MM-dd");
        Gson gson = gsonBuilder.create();
        return (T) gson.fromJson(jsonData, clazz);
    }


    // 将Json数组解析成相应的映射对象列表
    public static <T> List<T> json2List(String jsonData,
                                        Class<T> type) {
        Gson gson = new Gson();
        List<T> result = gson.fromJson(jsonData, new TypeToken<List<T>>() {
        }.getType());
        return result;
    }



        public static void main (String[]args){
        List<UserInfo> userInfoList = new ArrayList<UserInfo>();
        UserInfo userInfo = new UserInfo();

        userInfo.setId(1);
        UserInfo userInfo2 = new UserInfo();

        userInfo2.setId(2);
        userInfoList.add(userInfo);
        userInfoList.add(userInfo2);
        String str = toJson(userInfoList);
        System.out.println(str);
        List<UserInfo> userInfoList1 = json2List(str, UserInfo.class);
        System.out.println(userInfoList1);

    }

    }
