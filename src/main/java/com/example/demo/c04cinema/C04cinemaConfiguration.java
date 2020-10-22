package com.example.demo.c04cinema;

import com.example.demo.c04cinema.generated.GeneratedC04cinemaConfiguration;
import com.speedment.enterprise.plugins.json.JsonBundle;
import com.speedment.runtime.join.JoinBundle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The spring configuration file
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
@Configuration
public class C04cinemaConfiguration extends GeneratedC04cinemaConfiguration {
    private @Value("${c04.host}") String host;
    private @Value("${c04.port}") int port;
    private @Value("${c04.schema}") String schema;
    private @Value("${c04.username}") String username;
    private @Value("${c04.password}") String password;

    @Bean
    public C04cinemaApplication getApplication() {
        return new C04cinemaApplicationBuilder().withBundle(JsonBundle.class).withBundle(JoinBundle.class)
                .withIpAddress(host)
                .withPort(port)
                .withUsername(username)
                .withPassword(password)
                .withSchema(schema).build();

    }
}
