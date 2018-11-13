package com.learnspring.controller;

import com.learnspring.beans.SentenceDTO;
import com.learnspring.beans.SentimentDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RestController
public class MyAppController {

	@Value("${sa.api.url}")
	private String saLoginUrl;

	@PostMapping("/sentiment")
	public SentimentDTO sentimentAnalysis(@RequestBody SentenceDTO sentenceDto) {
		RestTemplate restTemplate = new RestTemplate();

		return restTemplate.postForEntity(saLoginUrl + "/analyse/sentiment",
				sentenceDto, SentimentDTO.class).getBody();
	}

	@GetMapping("/testHealth")
	public void testHealth() {
		System.out.println("<==== reached controller ====>");
	}

}
