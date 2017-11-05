package com.lming.chcservice.handle;

import com.lming.chcservice.config.ProjectUrlConfig;
import com.lming.chcservice.enums.ResultEnum;
import com.lming.chcservice.exception.ChcAuthorizeException;
import com.lming.chcservice.exception.ChcProcessException;
import com.lming.chcservice.util.ResultVOUtil;
import com.lming.chcservice.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常捕获处理返回错误页面
 */

@ControllerAdvice
public class ChcExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    /**
     * 用户信息鉴权异常跳转至登录页面
     * @return
     */
//    @ExceptionHandler(value = ChcAuthorizeException.class)
//    public ModelAndView handlerAuthorizeException(){
//
//        return new ModelAndView("redirect:"
//                .concat( projectUrlConfig.getWechatOpenAuthorizeUrl())
//                .concat("?returnUrl=").concat(projectUrlConfig.getSell())
//                .concat("/seller/login")
//        );
//    }

    /**
     *
     * 用户登录鉴权异常捕获，返回给前端返回码，前端进行跳转处理
     * json字符串
     * @return
     */
    @ExceptionHandler(value = ChcAuthorizeException.class)
    @ResponseBody
    public ResultVO handlerAuthorizeException(){

        return ResultVOUtil.error(ResultEnum.TOKEN_TIMEOUT);
    }

    /**
     * 异常捕获 并按统一格式返回给前端
     * @param e
     * @return
     */
    @ExceptionHandler(value = ChcProcessException.class)
    @ResponseBody
    public ResultVO handlerChcException(ChcProcessException e){

        return ResultVOUtil.error(e.getCode(),e.getMessage());

    }



}
