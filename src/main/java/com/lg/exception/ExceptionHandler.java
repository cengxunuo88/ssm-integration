package com.lg.exception;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Cengxunuo
 * @date 2020/10/13 15:01
 */
public class ExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        //分异步请求和非异步请求处理
        ModelAndView model = new ModelAndView();
        if (!StringUtils.isBlank(request.getHeader("x-requested-with")) && request.getHeader("x-requested-with").equals("XMLHttpRequest")) {

            FastJsonJsonView view = new FastJsonJsonView();
            Map<String, Object> map = new HashMap<>();
            map.put("code", 500);
            map.put("message", "ajax请求，服务器异常！");
            view.setAttributesMap(map);
            model.setView(view);
            return model;
        } else {
            model = new ModelAndView();
            model.addObject("message", "普通请求，服务器异常！");
            model.setViewName("500");
            return model;
        }
    }
}
