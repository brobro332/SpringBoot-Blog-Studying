package com.cos.blog.test;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter + @Setter = @Data
@Data
@NoArgsConstructor // @NoArgsConstructor 빈 생성자 // @AllArgsConstructor 전체 생성자
public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
	
	@Builder
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
}
