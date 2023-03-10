package org.iclass.vo;

import java.security.Timestamp;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewMember {
	private String id;
	private String name;
	private String password;
	private String email;
	private int age;
	private char gender;
	private String hobbies;
	private Timestamp joindate;
}
