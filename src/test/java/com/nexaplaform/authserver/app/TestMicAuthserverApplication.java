package com.nexaplaform.authserver.app;

import org.springframework.boot.SpringApplication;

public class TestMicAuthserverApplication {

	public static void main(String[] args) {
		SpringApplication.from(MicAuthserverApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
