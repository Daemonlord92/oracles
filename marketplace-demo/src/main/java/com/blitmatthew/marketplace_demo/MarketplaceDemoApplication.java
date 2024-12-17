package com.blitmatthew.marketplace_demo;

import com.blitmatthew.marketplace_demo.entity.Toy;
import com.blitmatthew.marketplace_demo.repository.ToyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketplaceDemoApplication implements CommandLineRunner {

	@Autowired
	private ToyRepository toyRepository;

	private Logger logger = LoggerFactory.getLogger(MarketplaceDemoApplication.class);

	//Spring MVC
	// MVC Stands for Model, View, Controller
	// Architectural Design Pattern
	// Front and Back ends are one Application
	// If anything is broken within the program the whole program is BROKEN
	// We have one codebase to manage
	// Usually deployed to one server
	// Use case mainly internal App or small businesses
	// Model
	// The Model is Data handler
	// Used to create a transferable object between the HTML template and SpringBoot Application
	// View
	// HTML Templates,and uses the main programming language to modify the front to what the data provided
	// Controller
	// Holds the different endpoints so we can connect to the application, in the Regular controller
	// it will spit out HTML, CSS and JavaScript to the browser to be viewed and interacted with
	public static void main(String[] args) {
		SpringApplication.run(MarketplaceDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(toyRepository.findByName("DoomSlayer").toString());

		Toy toy = new Toy("Blue", 5.0, "A Blue and White Panda Bear for all of your cuddling needs", "Panda");
		toyRepository.save(toy);
	}
}
