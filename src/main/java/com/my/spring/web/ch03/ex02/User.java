package com.my.spring.web.ch03.ex02;

import lombok.Data;

@Data
public class User {
	private String userName;
	private int age;
	private String faceFilename; //첨부파일을 텍스트로 접근할땐 String
}
