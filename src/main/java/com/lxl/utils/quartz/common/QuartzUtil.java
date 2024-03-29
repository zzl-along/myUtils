package com.lxl.utils.quartz.common;

/**
 * @desc   Quartz设置项目全局的定时任务
 * @auther lixinlong
 * @create 2018/5/18
 */
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/***
 *
 * Quartz设置项目全局的定时任务
 *
 * @Component注解的意义        泛指组件，当组件不好归类的时候，可以使用这个注解进行标注。公共的方法可以用上这个注解
 *
 *
 * @author lixinlong
 *
 */
//@Component
public class QuartzUtil {

    @Scheduled(cron = "0 0/1 * * * ?") // 每分钟执行一次
    public void work() throws Exception {
        System.out.println("执行调度任务："+new Date());
    }


    @Scheduled(fixedRate = 5000)//每5秒执行一次
    public void play() throws Exception {
        System.out.println("执行Quartz定时器任务："+new Date());
    }



    @Scheduled(cron = "0/2 * * * * ?") //每2秒执行一次
    public void doSomething() throws Exception {
        System.out.println("每2秒执行一个的定时任务："+new Date());
    }




    @Scheduled(cron = "0 0 0/1 * * ? ") // 每一小时执行一次
    public void goWork() throws Exception {
        System.out.println("每一小时执行一次的定时任务："+new Date());
    }




}