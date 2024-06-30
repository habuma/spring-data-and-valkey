package com.example.springvalkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class SpringValkeyApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringValkeyApplication.class, args);
  }

}
