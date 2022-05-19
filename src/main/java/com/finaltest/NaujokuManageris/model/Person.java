package com.finaltest.NaujokuManageris.model;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Person {
	
		
		private static AtomicInteger id = new AtomicInteger();
		
		public static String createId() {
			return String.valueOf(id.getAndIncrement());
		}
		
		private final String myId;
		@NotBlank
		private final String name;
		@NotBlank
		private final String surename;
		@NotBlank
		private final String dob;
		@NotBlank
		private final String phone;
		@NotBlank
		//@Column(unique=true)
		@Email
		private final String email;

		
		public Person (
					  @JsonProperty("name") String name,
					  @JsonProperty("surename") String surename,
					  @JsonProperty("dob") String date,
					  @JsonProperty("phone") String phone,
					  @JsonProperty("email") String email) {
			this.myId = createId();
			this.name = name;
			this.surename = surename;
			this.dob = date;
			this.phone = phone;
			this.email = email;
			
		}

		public String getName() {
			return name;
		}


		public String getSurename() {
			return surename;
		}


		public String getDob() {
			return dob;
		}


		public String getPhone() {
			return phone;
		}


		public String getEmail() {
			return email;
		}
		

		public String getMyId() {
			return myId;
		}

}
