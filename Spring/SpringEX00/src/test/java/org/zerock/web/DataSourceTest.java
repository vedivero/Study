package org.zerock.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

public class DataSourceTest {

	//Spring-test module의 도움을 받으면 Spring을 WAS상에서 동작 시키지 않고도 제대로 동작하는지를 확인
	
	@Inject
	private DataSource ds;
	
	public void testConction()throws Exception{
		
		try(Connection con = ds.getConnection()) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
