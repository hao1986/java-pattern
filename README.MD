## 属性配置

- `@Value`
- `@Component`
- `@ConfigurationProperties`
- 多环境配置

## Controller的使用

- `@Controller` 处理http请求
- `@RestController` Spring4之后新加的注解,原来返回json 需要@ResponseBody配合@Controller
- `@RequestMapping` 配置url 映射

- @PathVariable 获取url 中数据
- @RequestParam 获取请求参数的值
- @GetMapping 组合注解

## spring mvc spring-data-jpa mysql操作

```
spring:
  profiles:
    active: dev
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://127.0.0.1:3306/dbgirl
    username: root
    password: 123456
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```