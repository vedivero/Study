package org.zerock.persistence;

import javax.inject.Inject;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository	//DAO를 Spring에 인식시키기 위해서 사용하는 애노테이션, 스프링에서 해당 패키지를 스캔하지 않으로 빈으로 등록되지 않는다.	
public class MemberDAOImpl implements MemberDAO {

	//MemberDAO인터페이스를 구현하는 클래스는 앞에서 설정한 SqlSessionTemplate을 주입받아 사용
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.memberMapper";
	
	public String getTime() {
		
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);		
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		
		return sqlSession.selectOne(namespace+".selectMember",userid);
	}

	@Override
	public MemberVO readWIthPw(String userid, String userpw) throws Exception {
		
		Map<String , Object> paramMap = new HashMap<String,Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace+".readWithPw", paramMap);
	}
	
	
	
}
