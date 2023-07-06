package by.sadovnick.intgration.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@AllArgsConstructor
public class DbPoolConfiguration {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public IntegrationFlow poolingFlow() {
        return null;
    }
}
