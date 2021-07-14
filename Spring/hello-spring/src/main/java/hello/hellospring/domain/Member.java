package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //이제부터는 JPA가 관리하는 entity가 되는 것
public class Member{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    //시스템이 부여하는 값
    private String name;    //고객이 회원가입 시 기재하는 이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
