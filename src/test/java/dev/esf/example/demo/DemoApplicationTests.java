package dev.esf.example.demo;

import dev.esf.example.demo.controller.HomePageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	HomePageController homePageController;

	@Test
	void contextLoads() {
	}

	@Test
	void hello() {
		assert (homePageController != null);
	}
}
