package hello.hellospring.team.Service;

import hello.hellospring.team.Domain.Team;
import hello.hellospring.team.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    public Long save(Team team) {
        validationCheck(team);
        teamRepository.save(team);
        return team.getId();
    }

    private void validationCheck(Team team) {
        teamRepository.findByName(team.getName())
                .ifPresent( m -> {
                    throw new IllegalStateException(" 이미 존재하는 팀입니다. ");
                });
    }

    public Optional<Team> findTeam(Team team) {
        return teamRepository.findById(team.getId());
    }



}
