package com.example.batch;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {
 @Id
 private Integer id;
 private String firstName;
 private String lastName;
 private String email;
 private String gender;
 private String contactNo;
 private String country;
 private String dob;

}
