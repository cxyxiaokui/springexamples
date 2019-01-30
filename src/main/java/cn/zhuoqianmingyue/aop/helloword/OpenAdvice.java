package cn.zhuoqianmingyue.aop.helloword;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenAdvice {
	private static final Logger log = LoggerFactory.getLogger(OpenAdvice.class);
	public void open() {
		  log.info("开门.....");
	}
}
