package com.adi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Student {

	private int id;
	private String name;
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(100);
		s.setName("Aditya");
		System.out.println(s.getName());
		System.out.println(s);
		Student s1 = new Student();
		Student s2 = new Student(101,"Bibhuti");
		System.out.println(s2);
	}
}
