package com.goruslan.githubportfoliobuilder.dbloader;

import com.goruslan.githubportfoliobuilder.models.Project;
import com.goruslan.githubportfoliobuilder.models.Role;
import com.goruslan.githubportfoliobuilder.models.User;
import com.goruslan.githubportfoliobuilder.repositories.ProjectRepository;
import com.goruslan.githubportfoliobuilder.repositories.RoleRepository;
import com.goruslan.githubportfoliobuilder.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class population implements CommandLineRunner {

    private ProjectRepository projectRepository;
    private UserRepository userRepository;
    private RoleRepository roleRepository;


    private Map<String, User> users = new HashMap<>();


    public population(ProjectRepository projectRepository, UserRepository userRepository, RoleRepository roleRepository) {
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {

        // add users and roles
        addUserAndRoles();
        Map<String,String> projects = new HashMap<>();
        projects.put("Project 2rwg", "User Mouse");
        projects.put("Project 3df32g", "John Doe");
        projects.put("Project 23rr3wg", "User Mouse");
        projects.put("Project 224tr32g", "John Doe");
        projects.put("Project 2wgrwgrwg", "User Mouse");
        projects.put("Project 2r3g", "John Doe");
        projects.put("Project 2weftrwg", "User Mouse");
        projects.put("Project 2315gg", "John Doe");
        projects.put("Project 2rwegwwg", "User Mouse");
        projects.put("Project 43242g", "John Doe");



        projects.forEach((k,v) -> {
            Project project = new Project(k, v);
            projectRepository.save(project);

        });

        long postCount = projectRepository.count();
        System.out.println("Number of projects in the database: " + postCount );
    }


    private void addUserAndRoles() {

        Role userRole = new Role("ROLE_USER");
        roleRepository.save(userRole);
        Role adminRole = new Role("ROLE_ADMIN");
        roleRepository.save(adminRole);

        User user = new User("John Doe");
        user.addRole(userRole);
        user.setBio("eughbfueqyihg32 hf  32g 4e2wge4rg rdege4r wgtfe2rw4g4re2wg ewgtedw ghe4rgb 4reg w3e4r.");
        user.setAvatar("https://avatars0.githubusercontent.com/u/18630847?s=460&v=4");
        userRepository.save(user);
        users.put("JohnDoe", user);

        User user1 = new User("User Mouse");
        user1.addRole(userRole);
        user1.setBio("eughbfueqyihg32 hf  32g 4e2wge4rg rdege4r wgtfe2rw4g4re2wg ewgtedw ghe4rgb 4reg w3e4r.");
        user1.setAvatar("https://avatars0.githubusercontent.com/u/18630847?s=460&v=4");
        userRepository.save(user1);
        users.put("UserMouse", user1);

    }
}
