package lx.springboot.demo.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerTaskService {
	private static final SimpleDateFormat dateFormater = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("每5秒报时：" + dateFormater.format(new Date()));
	}
	
	@Scheduled(cron = "0 16 17 ? * *")
	public void fixTimeExecution(){
		System.out.println("在指定时间：" + dateFormater.format(new Date()));
	}
	
	
}
