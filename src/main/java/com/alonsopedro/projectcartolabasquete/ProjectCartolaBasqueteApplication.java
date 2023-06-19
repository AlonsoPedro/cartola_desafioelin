package com.alonsopedro.projectcartolabasquete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.alonsopedro.projectcartolabasquete")
@EntityScan(basePackages = "com.alonsopedro.projectcartolabasquete.models")
public class ProjectCartolaBasqueteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCartolaBasqueteApplication.class, args);
	}

}
