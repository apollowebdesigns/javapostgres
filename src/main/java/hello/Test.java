package hello;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class Test implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    protected Test() {
    }

    public String getUsername() {
        return username;
    }

    public Test(String username) {
        this.username = username;
    }

//    @Override
//    public String toString() {
//        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, testprop);
//    }
}