package hello.hellospring;

import hello.hellospring.Domain.Member;
import hello.hellospring.Repository.SpringDataJpaMemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class 통합_테스트 {

    @Autowired
    상황 상황;

    @BeforeEach
    void beforeEach() {
        상황.reset();
    }


    @Test
    void 회원가입(){
        상황.회원_생성();
        Optional<Member> resultMember = 상황.springDataJpaMemberRepository.findById(상황.member.getId());
        assertThat( resultMember.get() ).isEqualTo(상황.member);
    }






}
