package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactivityApplication implements CommandLineRunner {

//	private static final Logger log = LoggerFactory.getLogger(arg0);


	public static void main(String[] args) {
		SpringApplication.run(ReactivityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Flux<String> names = Flux.just("Vanessa", "Jesse","Curly", "Tony", "Mike")
				.doOnNext(System.out::println);

		names.subscribe();
	}
}
