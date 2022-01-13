package hello.hellospring;

import hello.hellospring.Domain.Member;
import hello.hellospring.Repository.SpringDataJpaMemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class 상황 {


    Member member;

    @Autowired
    SpringDataJpaMemberRepository springDataJpaMemberRepository;

    void reset() {
        this.member = new Member();
    }

    public void 회원_생성(){
        this.member.setName("Hello");
        this.member.setAge(35);
        springDataJpaMemberRepository.save(member);
    }

}
