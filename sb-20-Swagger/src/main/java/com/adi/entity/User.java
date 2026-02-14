package com.adi.entity;

import java.security.PrivateKey;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message = "Name can not be Empty")
	private String name;
	@NotBlank(message = "Name can not be Email")
	private String email;
	@Size(min = 3,max = 8,message = "Password must be within 3 and 8 characters")
	private String password;
	@NotBlank(message = "Address can not be Empty")
	private String address;
	@Min(value = 18,message = "Age must be above 18")
	@Max(value = 50,message = "Age must be below 50")
	private Integer age;
	
	
}
