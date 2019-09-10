package com.demo.controller;

import com.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testBoot")
public class TestBootController {
    public User getUser(){
        User user = new User();
        user.setName("lyw");
        return user;
    }

    public static void main(String[] args) {
        /**
         * 获取时间的年月日
         */
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        System.out.printf("year = %d,month = %d,day = %d ",year,monthValue,dayOfMonth);
        System.out.println();
        System.out.println("=========================================================");

        /**
         * java8判断两个时间是否相等
         */
        LocalDate currentDay = LocalDate.now();
        System.out.println("当前日期为："+currentDay);
        System.out.println("=========================================================");

        /**
         * java8生成特定时间对象
         */
        LocalDate pointDay = LocalDate.of(2019, 9, 10);
        System.out.println("指定日期时间"+pointDay);
        System.out.println("=========================================================");

        /**
         * java8比较时间是否相等
         */
        LocalDate of = LocalDate.of(2019, 9, 10);
        if(of.equals(now)){
            System.out.println("当前日期与特殊指定日期相等");
        }
        System.out.println("=========================================================");

        /**
         * 检查每年的生日或者节日
         */
        LocalDate birthDay = LocalDate.of(2019, 9, 10);
        MonthDay yourBirthDay = MonthDay.of(birthDay.getMonth(), birthDay.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(now);
        if(currentMonthDay.equals(yourBirthDay)){
            System.out.println("生日快乐，你妈没了");
        }else{
            System.out.println("天天想过生，你去死吧");
        }
        System.out.println("=========================================================");

        /**
         * 获取当前时间
         */
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println("=========================================================");

        /**
         * 在现有的时间增加几个小时
         */
        LocalTime currentTime = LocalTime.now();
        System.out.println("当前时间"+currentTime);
        LocalTime plusTime = currentTime.plusHours(2);
        System.out.println("增加时间"+plusTime);
        System.out.println("=========================================================");

        /**
         * 计算一周之后的时间
         */
        LocalDate currentDate = LocalDate.now();
        LocalDate plusWeekTime = currentDate.plus(1, ChronoUnit.WEEKS);
        LocalDate plusYearTime = currentDate.plus(1, ChronoUnit.YEARS);
        LocalDate declineYearTime = currentDate.minus(1, ChronoUnit.YEARS);
        System.out.println("当前日期"+currentDate);
        System.out.println("增加一周后的日期"+plusWeekTime);
        System.out.println("增加一年后的日期"+plusYearTime);
        System.out.println("减少一年后的日期"+declineYearTime);
        System.out.println("=========================================================");

        /**
         *个Clock 时钟类用于获取当时的时间戳，或当前时区下的日期时间信息
         */
        Clock clock = Clock.systemUTC();
        Clock clock1 = Clock.systemDefaultZone();
        System.out.println(clock);
        System.out.println(clock1);
        System.out.println("=========================================================");

        /**
         * 如何用 Java 判断日期是早于还是晚于另一个日期
         */



    }

}
