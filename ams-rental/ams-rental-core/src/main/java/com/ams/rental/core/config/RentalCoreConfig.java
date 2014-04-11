package com.ams.rental.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ams.rental.core.repo.RentalRepos;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = RentalRepos.class)
public class RentalCoreConfig {

}
