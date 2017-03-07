package com.spring.TimingTask;

import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SpringTimingTask1 {
	@Scheduled(cron="0 */1 * * * ?")   //每隔一分钟产生一个随机数
    public void getRandomString() {
	      String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";//含有字符和数字的字符串
	      Random random = new Random();//随机类初始化
	      StringBuffer sb = new StringBuffer();//StringBuffer类生成，为了拼接字符串
	 
	      for (int i = 0; i < 4; ++i) {
	          int number = random.nextInt(62);// [0,62)
	 
	          sb.append(str.charAt(number));
	      }
	     System.out.println("产生的随机字符串是:"+sb.toString());;
	 }

}
