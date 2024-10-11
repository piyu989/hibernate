package com.user.entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="user")
@Table(name = "users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
	@Id
	private String userId;
//	@Column(name="user_name")
	private String name;
	private String email;
	private String about;
	private String password;
	private String phoneNumber;
	
	//information
	private boolean enabled=true;
	private boolean emailVerified=false;
	private boolean phoneVerified=false;
	
//	@OneToMany(mappedBy = "user")
	@OneToMany
	private List<Contact>contacts=new ArrayList<>();
}
