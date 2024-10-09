package com.ecommerce;

import com.ecommerce.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Project Start - main method
@SpringBootApplication  //SpringBootConfigration, EnableAutoConfigration,ComponentScan
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);

		User user=new User();


		//IOC- inversion of control
		//to manage the DI
		// to manage bean life cycle
		// java object -bean
		//1) Method factory -old - xml configration
		//2) Applicaton Context - spring and SpringBoot


	}

	//SpringBootConfigration, EnableAutoConfigration,ComponentScan
	//ComponentScan -  scan bean from main package to subpackages.
	//EnableAutoConfigration -
	//SpringBootConfigration -

}
