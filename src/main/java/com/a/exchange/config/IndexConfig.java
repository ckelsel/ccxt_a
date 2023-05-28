package com.a.exchange.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author panda-team@jiasibode.com
 */
@Configuration
@ConfigurationProperties(prefix = "index")
@Data
public class IndexConfig {
    private List<String> hs300;
}
