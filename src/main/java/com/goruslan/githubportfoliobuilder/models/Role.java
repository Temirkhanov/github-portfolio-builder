package com.goruslan.githubportfoliobuilder.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Role {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;

//    public Role(String name) {
//        this.name = name;
//    }

    @ManyToMany( mappedBy = "roles")
    private Collection<User> users;
}
