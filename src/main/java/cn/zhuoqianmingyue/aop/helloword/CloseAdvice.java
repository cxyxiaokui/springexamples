package cn.zhuoqianmingyue.aop.helloword;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CloseAdvice {
	private static final Logger log = LoggerFactory.getLogger(OpenAdvice.class);
	public void close() {
		  log.info("关门.....");
	}
}
