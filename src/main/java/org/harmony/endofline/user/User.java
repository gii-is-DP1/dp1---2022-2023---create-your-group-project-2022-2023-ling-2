package org.harmony.endofline.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    String username;
    String password;
    String email;
    Boolean isAdmin;
    String image;
}
