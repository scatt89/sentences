package com.ts;

import com.ts.advices.AdviceSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication()
@Import({AdviceSettings.class})
public class SentencesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentencesApplication.class, args);
	}
}
