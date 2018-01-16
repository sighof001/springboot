package lx.springboot.demo.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
	private String beanName;
	private ResourceLoader resourceLoader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name; 
	}
	
	public void outputResult(){
		try {
			System.out.println("bean 称为：" + beanName);
			Resource reource = resourceLoader.getResource("classpath:lx/springboot/demo/ch3/aware/test.txt");
			
			System.out.println("resourceLoader 加载的文件内容为：" + IOUtils.toString(reource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
