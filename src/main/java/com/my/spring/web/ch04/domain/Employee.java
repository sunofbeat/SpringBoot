package com.my.spring.web.ch04.domain;

import java.time.LocalDate;

import lombok.Getter;

@Getter //mybatis로 OR매핑하기때문에 getter만 생성
public class Employee {
	private int employeeId;
	private String lastName;
	private LocalDate hireDate;
}
