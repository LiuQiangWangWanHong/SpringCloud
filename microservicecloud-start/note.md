1  搭建eureka 注册中心（单机）
     1.1    POM 
          <!--eureka-server服务端 -->
          		<dependency>
          			<groupId>org.springframework.cloud</groupId>
          			<artifactId>spring-cloud-starter-eureka-server</artifactId>
          		</dependency>
     1.2    yml  
           server: 
             port: 7001
            
           eureka: 
             instance:
               hostname: localhost #eureka服务端的实例名称
             client: 
               register-with-eureka: false     #false表示不向注册中心注册自己。
               fetch-registry: false     #false表示自己端就是注册中心，我的职责就是维护服务实例，并不需要去检索服务
               service-url: 
                 defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/       #设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址（单机）。
     1.3   启动类加上注解  
           @EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
     1.4  启动启动类    成功后访问  http://localhost:7001

2    构建服务端
     2.1  POM
         <dependency>
         			<groupId>org.springframework.cloud</groupId>
         			<artifactId>spring-cloud-starter-eureka</artifactId>
         		</dependency>
         		<dependency>
         			<groupId>org.springframework.cloud</groupId>
         			<artifactId>spring-cloud-starter-config</artifactId>
         		</dependency>
     2.2 yml  
           eureka:
             client: #客户端注册进eureka服务列表内
               service-url: 
                 defaultZone: http://localhost:7001/eureka
             instance:
               instance-id: microservicecloud-dept8001
               prefer-ip-address: true     #访问路径可以显示IP地址  
               
     2.3  启动类加上注解
            @EnableEurekaClient //本服务启动后会自动注册进eureka服务中
            @EnableDiscoveryClient //服务发现          
     
     2.4  启动成功后访问 http://localhost:7001 查看服务是否注册成功
     
3  构建消费端 
     3.1   POM
          <dependency>
          			<groupId>org.springframework.cloud</groupId>
          			<artifactId>spring-cloud-starter-eureka-server</artifactId>
          		</dependency>
          		
     3.2 YML
          eureka:
            client:
              register-with-eureka: false
              service-url: 
                defaultZone: http://localhost:7001/eureka/
                
     3.3 启动类添加注解  
           @EnableFeignClients    
           @EnableEurekaClient
      3.4 启动后访问    http://localhost/consumer/dept/get/1  获取数据
      
      
   