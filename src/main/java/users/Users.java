package hello;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    protected Users() {
    }

    public String getUsername() {
        return username;
    }

    public Users(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, username='%s']", id, username);
    }
}