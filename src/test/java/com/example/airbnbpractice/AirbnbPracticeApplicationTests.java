package com.example.airbnbpractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AirbnbPracticeApplicationTests {
	
	
	static {
		System.setProperty("com.amazonaws.sdk.disableEc2Metadata", "true");
	}

	@Test
	void contextLoads() {
	}

}
