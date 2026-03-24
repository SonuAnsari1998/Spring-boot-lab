
package com.nit.sbeans;

import org.springframework.stereotype.Component;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LogMessage {
	private int id;
	private String message;
	private String level;
}
