package com.example.demo.job;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.Demo2Application;
import com.example.demo.utils.DateUtil;
import com.example.demo.utils.HttpClientUtils;

@Component
public class DemoJob {
	private Logger logger = LoggerFactory.getLogger(DemoJob.class);
		
	@Scheduled(cron="0/10 * * * * ?")
	public void demo1() {
		try {
			
			Map<String, String> map = new HashMap<String, String>();
			String time = DateUtil.getYyyyMMddHHmmss();
			map.put("time",time);
			logger.info("发送time:" + time);
			String r = HttpClientUtils.post(Demo2Application.DEMO_URL, map);
			logger.info("time:" + time + ",结果:" + r);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
	}
}
