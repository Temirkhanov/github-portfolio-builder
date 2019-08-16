package com.goruslan.githubportfoliobuilder.controllers;

import com.goruslan.githubportfoliobuilder.models.Project;
import com.goruslan.githubportfoliobuilder.service.ProjectService;
import com.goruslan.githubportfoliobuilder.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    private ProjectService projectService;
    private UserService userService;


    public MainController(UserService userService, ProjectService projectService) {
        this.userService = userService;
        this.projectService = projectService;
    }

    @GetMapping("/")
    public String geeks(Model model) {
        model.addAttribute("users", userService.findAll());
        return "geeks";
    }

}
