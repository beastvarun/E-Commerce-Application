package com.myproject.exception;

import java.time.LocalDateTime;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDetails {
	public ErrorDetails(LocalDateTime now, String message2, String description) {
		// TODO Auto-generated constructor stub
	}
	private LocalDateTime timestamp;
	private String message;
	private String details;
}
