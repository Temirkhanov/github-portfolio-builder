package com.goruslan.githubportfoliobuilder.repositories;

import com.goruslan.githubportfoliobuilder.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllByCreatedBy(String username);

}
