package com.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "contact")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	@Id
	private String id;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String pictures;
	@Column(length = 10000)
	private String description;
	private boolean favourite;
	private String websiteLink;
	private String linkedlndLink;
	@ManyToOne
	private User user;
}
