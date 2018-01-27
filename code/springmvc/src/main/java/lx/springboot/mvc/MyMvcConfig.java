package lx.springboot.mvc;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import lx.springboot.mvc.interceptor.DemoInterceptor;
import lx.springboot.mvc.interceptor.DemoInterceptor2;
import lx.springboot.mvc.messageconverter.MyMessageConvertor;

@Configuration
@ComponentScan("lx.springboot.mvc")
@EnableWebMvc
public class MyMvcConfig extends WebMvcConfigurerAdapter{
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver r = new InternalResourceViewResolver();
		r.setPrefix("/WEB-INF/classes/views/");
		r.setSuffix(".jsp");
		r.setViewClass(JstlView.class);
		
		return r;
	}
	
	@Bean
	public DemoInterceptor demoInterceptor(){
		return new DemoInterceptor();
	}
	
	@Bean
	public DemoInterceptor2 demoInterceptor2(){
		return new DemoInterceptor2();
	}
	
	@Bean
	public MultipartResolver multipartResolver(){
		CommonsMultipartResolver r = new CommonsMultipartResolver();
		r.setMaxUploadSize(1000000);
		r.setDefaultEncoding("UTF-8");
		return r;
	}
	
	@Bean
	public MyMessageConvertor myMessageConvertor(){
		return new MyMessageConvertor();
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(demoInterceptor());
		registry.addInterceptor(demoInterceptor2());
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index2").setViewName("/index");
		registry.addViewController("/toUpload").setViewName("/upload");
		registry.addViewController("/converter").setViewName("/converter");
		registry.addViewController("/sse").setViewName("/sse");
	}
	
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(myMessageConvertor());
	}
}
