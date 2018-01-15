package lx.springboot.demo.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	@Pointcut("@annotation(lx.springboot.demo.ch1.aop.Action)")
	public void annotationPointCut(){}
	
	@Before("execution(* lx.springboot.demo.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoit){
		MethodSignature signature = (MethodSignature)joinPoit.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则拦截,method:" + method.getName());
	}
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoit){
		MethodSignature signature = (MethodSignature)joinPoit.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		
		System.out.println("注解拦截," + action.name());
	}
}
