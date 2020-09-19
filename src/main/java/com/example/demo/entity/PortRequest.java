package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PortRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reqSeq;
	@NotEmpty(message = "Port Id  can not be null or Empty")
	private String portId;
	@NotEmpty(message = "DonorId  can not be null or Empty")
	private String donorId;
	@NotEmpty(message = "RecipientId  can not be null or Empty")
	private String recipientId;
	

}
