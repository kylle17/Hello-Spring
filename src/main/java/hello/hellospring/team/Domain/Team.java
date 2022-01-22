package hello.hellospring.team.Domain;

import hello.hellospring.member.Domain.Member;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @OneToMany( mappedBy = "team" , fetch = FetchType.LAZY )
    List<Member> members = new ArrayList<Member>();



}
