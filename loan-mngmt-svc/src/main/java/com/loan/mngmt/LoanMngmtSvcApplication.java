package com.loan.mngmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan (basePackages = "com.loan.mngmt")
@EntityScan ("com.loan.mngmt.entity")
public class LoanMngmtSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanMngmtSvcApplication.class, args);
	}

}
