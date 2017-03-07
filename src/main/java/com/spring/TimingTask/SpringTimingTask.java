package com.spring.TimingTask;

import java.util.Date;
import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SpringTimingTask {
	//@Scheduled(cron="0 53 15 * * ?")   在15点53分时触发，开启定时任务
	@Scheduled(cron="*/5 * * * * ?")    //每隔5秒触发一次
	public void TimingTask(){
		System.out.println("开启定时任务" + new Date());
	}

}
