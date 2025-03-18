package com.nexaplaform.authserver.app;

import com.nexaplaform.authserver.app.configuration.TestcontainersConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
public class MicAuthServerApplicationTests {

    @Test
    void contextLoads() {
    }
}
