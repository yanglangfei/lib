package com.yf.web.ai.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableScheduling
public class DrawCashTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public  void  run(){
      log.info("执行定时任务:["+this.getClass().getName()+"]");
    }

}
