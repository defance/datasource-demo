package name.defance.datasource.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SampleConfig {

    @Autowired
    public SampleConfig(DataSource dataSource) {
        System.out.println("DATASOURCE: " + dataSource);
        this.dataSource = dataSource;
    }

    final private DataSource dataSource;
}
