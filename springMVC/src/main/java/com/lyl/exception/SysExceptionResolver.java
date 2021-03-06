package com.lyl.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 处理异常业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param handler 当前handler对象
     * @param ex 接受的抛过来的异常
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception ex) {
        SysException e=null;
        if(ex instanceof SysException){
            e=(SysException)ex;
        }else {
            e=new SysException("系统正在维护");
        }
        //创建ModelAndView对象
        ModelAndView mv=new ModelAndView();
        mv.addObject("errorMsg",e.getMsg());
        mv.setViewName("error");
        return mv;
    }
}
