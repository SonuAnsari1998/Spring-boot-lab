package com.ni.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Email {
	@Value("${email.dev.sender}")
	private String to;

	private String subject;
	private String body;

	public Email(String subject, String body) {
		this.subject = subject;
		this.body = body;
	}

}
