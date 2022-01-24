package hello.hellospring.team.Service;

import hello.hellospring.team.Domain.Team;
import hello.hellospring.team.Repository.TeamRepository;
import hello.hellospring.team.Service.TeamService;
import hello.hellospring.상황;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
class TeamServiceTest {

    @Autowired
    상황 상황;
    @Autowired
    TeamService teamService;
    @Autowired
    TeamRepository teamRepository;

    @BeforeEach
    void beforeEach() {
        상황.reset();
    }

    @Test
    public void 팀_저장() {
        // given
        상황.팀_생성();
        Team expactTeam = 상황.getTeam();

        // when
        long id = teamService.save(expactTeam);
        Optional<Team> resultTeam = teamRepository.findById(id);

        // then
        assertThat(resultTeam.get().getId()).isEqualTo(expactTeam.getId());
    }

    @Test
    public void 팀_조회() {
        // given
        상황.여러_팀_등록();
        Team expactTeam = 상황.getTeams().get(2);

        // when
        Optional<Team> resultTeam = teamService.findTeam(expactTeam);

        // then
        assertThat(resultTeam.get().getId()).isEqualTo(expactTeam.getId());

    }

}