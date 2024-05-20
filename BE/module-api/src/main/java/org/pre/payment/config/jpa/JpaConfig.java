package org.pre.payment.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.pre.payment")
@EnableJpaRepositories(basePackages = "org.pre.payment")
public class JpaConfig {
}
