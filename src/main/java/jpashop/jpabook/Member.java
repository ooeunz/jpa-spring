package jpashop.jpabook;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    public Member() {}

    public Member(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    @Id @GeneratedValue
    private  Long id;
    private  String username;
}
