package com.learnspring.beans;

public class SentenceDTO {

	private String sentence;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		return sentence;
	}
}
