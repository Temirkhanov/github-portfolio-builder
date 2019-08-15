package com.goruslan.githubportfoliobuilder.repositories;

import com.goruslan.githubportfoliobuilder.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
