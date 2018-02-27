[![Build Status](https://travis-ci.org/KNIGHTMASTER/spring-boot-hystrix.svg)](https://travis-ci.org/KNIGHTMASTER/spring-boot-hystrix/)

# spring-boot-hystrix
Spring Boot Example Application and Monitoring With Hystrix Dashboard

Hystrix Works as Circuit Breaker to monitor failures. When these failures reach certain limit, the Circuit Breaker will be open.
To enable Hystrix use `@EnableCircuitBreaker` or `@EnableHystrix`on your services.

Hystrix-Dashboard Used to Monitor Result From Circuit Breaker's Stream into Metrics Form.
To enable Hystrix-Dashboard use `@EnableHystrixDashboard` on your services.

### Service
Service running on port 8081. Hit at least once to feed stream

### Hystrix Stream
URL [http://localhost:8081/hystrix.stream](http://localhost:8081/hystrix.stream) will show stream from Hystrix Command
<img src='https://github.com/KNIGHTMASTER/Resources/blob/master/HYSTRIX/hystrix-stream-1.png'/>

### Dashboard
Server running on port 8080

<img src='https://github.com/KNIGHTMASTER/Resources/blob/master/HYSTRIX/hystrix-dashboard-1.png'/>
<img src='https://github.com/KNIGHTMASTER/Resources/blob/master/HYSTRIX/hystrix-dashboard-2.png'/>
