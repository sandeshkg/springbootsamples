package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}

@RestController
@RequestMapping("/client")
class HelloController{


	@Autowired
	private DiscoveryClient discoveryClient ;

	@RequestMapping(method = RequestMethod.GET)
	public String doSomething(){

		List<String> services = discoveryClient.getServices();
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("testresult");

		//serviceInstances.get(0).
		return "Check this out...!!";
	}
}