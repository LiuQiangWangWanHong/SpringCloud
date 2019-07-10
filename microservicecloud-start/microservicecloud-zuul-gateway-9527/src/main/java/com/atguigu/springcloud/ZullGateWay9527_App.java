package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Tips:
 *
 * @author Liuq
 * @version 2019年07月09日
 */

@SpringBootApplication
@EnableZuulProxy
public class ZullGateWay9527_App {


        public static void main(String[] args)
        {
            SpringApplication.run(ZullGateWay9527_App.class, args);
        }


}
