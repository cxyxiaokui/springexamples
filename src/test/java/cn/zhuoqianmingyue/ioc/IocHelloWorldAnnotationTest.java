package cn.zhuoqianmingyue.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations= {"classpath:ioc-helloworld-context.xml"})
public class IocHelloWorldAnnotationTest {
	 @Autowired
	 private  IocHelloWorldXml iocHelloWorldXml;
	 @Autowired
	 private  IocHelloWorldAnnotation iocHelloWorldAnnotation;
	 @Test
	 public void sayXml() {
		 iocHelloWorldXml.say();
	 }
	 
	 @Test
	 public void sayAnnotation() {
		 iocHelloWorldAnnotation.say();
	 }
	
	 
}

