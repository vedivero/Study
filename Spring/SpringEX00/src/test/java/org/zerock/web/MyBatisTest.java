package org.zerock.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

	//Connection test of MyBatis

@RunWith(SpringJUnit4ClassRunner.class) //JUnit 프레임워크의 테스트 실행 방법을 확장할 때 사용하는 애노테이션
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}) //자동으로 만들어줄 애플리케이션 컨텍스트의 설정파일위치를 지정
public class MyBatisTest {

	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		
		System.out.println(sqlFactory);
	
	}
	
	@Test
	public void testSession()throws Exception{
		
		try(SqlSession session = sqlFactory.openSession()) {
			
			System.out.println(session);
		
		} catch (Exception e) {
		
			e.printStackTrace();
		
		}
	}
	
	
	//*Test를 하는 습관은 나중에 유지보수를 진행하거나 개별적인 코드들을 하나로 통합하는 과정에서 진가가 드러난다.
}