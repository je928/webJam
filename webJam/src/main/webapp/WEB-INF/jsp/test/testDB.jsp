<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/taglibs.jsp" %>

	<div>*** DB 조회 TEST ***</div>
	<div>id : ${id}</div>

	sql
test 테이블 생성

CREATE TABLE test ( 
	no varchar(200) NOT NULL,
	id varchar(200) NOT NULL,
	name varchar(200) NOT NULL
);

insert into test values ('1', 'aa', '에이에이');
insert into test values ('2', 'bb', '비비');
insert into test values ('3', 'cc', '씨씨');