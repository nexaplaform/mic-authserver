package com.nexaplaform.authserver.app.configuration;

import com.nexaplaform.authserver.app.MicAuthserverApplication;
import org.springframework.boot.SpringApplication;

public class TestMicAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.from(MicAuthserverApplication::main)
				.with(TestcontainersConfiguration.class).run(args);
	}
}
