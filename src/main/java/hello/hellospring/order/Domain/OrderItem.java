package hello.hellospring.order.Domain;

import javax.persistence.*;


@Entity
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @JoinColumn(name="orders_id")
    @ManyToOne
    Orders orders;
    @JoinColumn(name = "item_id")
    @ManyToOne
    Item item;
    @Column(name="order_price")
    int orderPrice;
    int count;

}
