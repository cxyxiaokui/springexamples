package cn.zhuoqianmingyue.ioc.di.initialization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationFactory {
	@Bean("annotationFactoryBean")
	public AnnotationFactoryBean getBean() {
		return new AnnotationFactoryBean();
	}
}
