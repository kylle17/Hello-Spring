package hello.hellospring.order.Domain;

import hello.hellospring.member.Domain.Member;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Orders {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    @JoinColumn
    @ManyToOne
    private Member member;
    @Column(name="order_date")
    private LocalDate orderDate;
    private String stat;

}
