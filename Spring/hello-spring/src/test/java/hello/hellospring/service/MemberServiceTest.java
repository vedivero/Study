package hello.hellospring.service;

import hello.hellospring.domain.Member;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    //테스트는 과감히 한글로 해도 된다.(영어권 사람들과 일하는게 아니면 한글로 적기도 한다.)

    MemberService memberService;
    //1.회원가입을 하려면 우선 서비스가 있어야 한다.
    //동작하기 전에 넣어주기
    //Clear
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

            //given - 무언가 주어졌다

            //when - 그걸 실행했을 때

            //then - 결과가 나와야 한다.

    @Test
    void join() {

        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());

        //위 테스트 코드는 너무 단순, 정상 동작도 중요하지만 예외 동작도 무척 중요하다.
        //위 코드는 반쪽짜리 테스트
        //join메서드는 저장되는 것도 중요하지만
        //중복 회원 검증 시 예외가 발생하는 것도 염두해둬야 한다.
    }

    @Test
    public void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        /*
        try {
            memberService.join(member2);//동일한 값이 들어갔으므로 예외 발생, try-catch로도 잡을 수 있다.
            fail();
        } catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }*/

        //then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}