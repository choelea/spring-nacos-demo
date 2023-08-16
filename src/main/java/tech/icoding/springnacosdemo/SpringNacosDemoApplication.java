package tech.icoding.springnacosdemo;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringNacosDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringNacosDemoApplication.class, args);
	}

}
