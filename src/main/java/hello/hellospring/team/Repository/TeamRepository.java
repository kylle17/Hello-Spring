package hello.hellospring.team.Repository;

import hello.hellospring.team.Domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TeamRepository extends JpaRepository< Team,String> {

    Optional<Team> findById( long id );

    Optional<Team> findByName(String name);

}
