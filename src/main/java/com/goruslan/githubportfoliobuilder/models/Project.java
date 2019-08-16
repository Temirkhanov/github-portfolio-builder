package com.goruslan.githubportfoliobuilder.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Auditable;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Project{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    private String language;

    private String description;

    @NonNull
    private String createdBy;


    @ManyToOne
    private User user;

}
