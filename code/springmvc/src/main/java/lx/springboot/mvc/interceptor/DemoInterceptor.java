package lx.springboot.mvc.interceptor;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DemoInterceptor extends HandlerInterceptorAdapter{
	private String reqId;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		String reqId = UUID.randomUUID().toString();
		this.reqId = reqId;
		System.out.println("DemoInterceptor pre,reqId:" + reqId + ",startTime:" + startTime);
		request.setAttribute("startTime" + reqId, startTime);
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		long startTime = (Long)request.getAttribute("startTime" + this.reqId);
		request.removeAttribute("startTime" + this.reqId);
		long endTime = System.currentTimeMillis();
		long costTime = endTime - startTime;
		System.out.println("DemoInterceptor post,reqId:" + this.reqId + ",costTime:" + costTime);
	}
}
