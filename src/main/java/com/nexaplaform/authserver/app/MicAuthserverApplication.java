package com.nexaplaform.authserver.app;

import com.nexaplaform.core.utils.DateUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class MicAuthserverApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MicAuthserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		System.out.println(DateUtil.DATE_FORMAT);
	}
}
