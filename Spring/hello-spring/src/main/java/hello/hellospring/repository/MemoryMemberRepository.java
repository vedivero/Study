package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    //sava method를 실행할 경우 어딘가에 저장을 해야 한다.
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        //값이 없을 경우 null이 나온다.
        //return store.get(id);

        //Optional로 감싸서 반환한다.
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {

        //람다를 사용, Loop를 돌리는 것
        //member.getName이, Parameter로 넘어 온 name과 같은지 비교
        //같은 값을 찾으면 Optional로 반환
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); //findAny=하나라도 찾는 것
    }

    @Override
    public List<Member> findAll() {
        //맵으로 되어 있는데 이 메서드는 List를 반환하고 있다.
        //루프돌리기 편해서 실무에서는 List를 많이 사용한다.
        return new ArrayList<>(store.values()); //store의 member가 반환
    }

    public void clearStore() {
        store.clear();
    }
}
