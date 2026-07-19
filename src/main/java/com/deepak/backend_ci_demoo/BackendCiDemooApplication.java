package com.deepak.backend_ci_demoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendCiDemooApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCiDemooApplication.class, args);
	}


    //there are some topics like workflow ka folder in ci.yaml ,
    // build acitons konse hote hai, docker compose, rgolder images / whtelisted/ github ke
    // self hosted runners/ required checks , like this so make me learn everything sequentially//

    //THEN We’ll Deep Dive Into
    //GitHub Actions Internals
    //workflow syntax
    //reusable workflows
    //composite actions
    //caching
    //artifacts
    //secrets
    //environments
    //approvals
    //matrices
    //THEN Enterprise Topics
    //self-hosted runners
    //golden images
    //whitelisting
    //required checks
    //protected branches
    //flaky handling
    //parallel runners
}
