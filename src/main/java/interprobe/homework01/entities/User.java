package interprobe.homework01.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Getter
@Setter
@Entity
@Table(name = "customer")
public class User {

    @Id
    @GeneratedValue(generator = "user")
    @SequenceGenerator(name = "user", sequenceName = "USER_ID_SEQ")
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "surname", length = 50, nullable = false)
    private String surname;

    @Email
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "phoneNumber", length = 15, nullable = false)
    private String phoneNumber;
}
