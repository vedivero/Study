package hello.hellospring.repository;

import org.assertj.core.api.Assertions;
import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

//public으로 하지 않아도 됨 - 어디서 가져다 사용할 것이 아니므로
class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    //메서드가 끌날때 마다 afterEach가 호출되어 메모리를 초기화
    //각각의 Test는 의존 관계없이 Test가 이루어져야 한다.
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }


    @Test
    public void save() {
        //Member가 저장이 잘 되는지 Test
        Member member = new Member();
        member.setName("spring");

        //repository에 memeber를 save하는 것
        repository.save(member);

        //내가 입력한 member가 제대로 입력됐는지
        //꺼내기
        Member result = repository.findById(member.getId()).get();

        System.out.println("result  = " + (result == member));

        //검증하기
        //결과 result  = true를 글자로 볼 수 없다. -> Assertions기능 (org.junit.jupiter.api)
        assertThat(member).isEqualTo(result);
        //실무에서는 Build Tool과 엮어서 Build Tool에서 Build할 때,
        //오류 테스트가 통과되지 않으면, 다음 단계로 넘어가지 못하게 막는다.

    }

    @Test
    public void findByName() {   //findByName이 잘 동작하는지 테스트

        //스프링1 회원이 회원 가입
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        //스프링2 회원이 회원 가입
        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);

        //findAll()작성 후 findByName() 에러 이유:
        //          fundALL이 먼저 실행, 모든 테스트 순서는 보장이 안 된다.
        // findAll()에서 생성된 객체Member member1 = new Member();가 호출됨
        //  Test가 끝나면 Data를 Clear해줘야 한다.
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
    }



}
