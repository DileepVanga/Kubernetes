package com.learnspring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MyAppController {

	@GetMapping("/testHealth")
	public ResponseEntity<String> testHealth() {
		String successMsg = "<==== reached controller ====>";
		System.out.println(successMsg);
		return new ResponseEntity<>(successMsg, HttpStatus.OK);
	}

	@GetMapping(value = "/tvShows", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getTvShowsList() {
		List<String> tvShows = new ArrayList<>();
		tvShows.add("Breaking Bad");
		tvShows.add("Game Of Thrones");
		tvShows.add("Friends");
		tvShows.add("Prison break");
		return new ResponseEntity<>(tvShows, HttpStatus.OK);
	}

}
