package com.larryfotso.campusconnect;

import org.springframework.boot.SpringApplication;

public class TestCampusconnectApplication {

	public static void main(String[] args) {
		SpringApplication.from(CampusconnectApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
