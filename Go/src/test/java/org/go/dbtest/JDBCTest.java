package org.go.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
	// Driver 로드 정보
	String driver = "com.mysql.jdbc.Driver";
	// url 정보
	String url="jdbc:mysql://localhost:3306/exam?serverTimezone=Asia/Seoul";
	// user ID 정보
	String user="root";
	// password 정보
	String pw="1234";
	
	// JDBC 연결 테스트 하기 위한 메소드
	@Test
	public void testConnection() throws ClassNotFoundException{
		Class.forName(driver);
		try(Connection con = DriverManager.getConnection(url,user,pw)){
			System.out.println("DB 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
