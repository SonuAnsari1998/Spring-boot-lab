package com.nit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.security.auth.Subject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "student")
public class Student {
	private int id;
	private String name;
	private String course;
	private String hobbies[];
	private List<String> subjects;
	private Set<String> certifications;
	private Map<String,Integer> marks; //Key → Subject Value → Marks
	private Address address;
}
