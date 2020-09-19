package io.raghu.api;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDetails {

	private Date timeStamp;
	private String message;
	private String details;
	
}
