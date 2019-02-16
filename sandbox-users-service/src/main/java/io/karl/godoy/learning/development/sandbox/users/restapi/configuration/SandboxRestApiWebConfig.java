package io.karl.godoy.learning.development.sandbox.users.restapi.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class SandboxRestApiWebConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "sandbox-db")
    public DataSource dataSource() {
       return DataSourceBuilder.create().build();
    }
}
