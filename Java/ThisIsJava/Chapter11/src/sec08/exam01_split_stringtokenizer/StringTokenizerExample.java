package sec08.exam01_split_stringtokenizer;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		//[1]
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text,"/");
		
		//가져올 Token이 몇개인지 출력
		int countTokens = st.countTokens();
		System.out.println("카운트 토큰 : "+countTokens);
		
		for(int i = 0; i<countTokens; i++){
			//다음 Token을 하나씩 호출
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//nextToken으로 모든 객체를 얻었다면 해당 객체를 다시 사용할 수 없다.
		
		//[2] - 1번보다 일반적인 예제
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
