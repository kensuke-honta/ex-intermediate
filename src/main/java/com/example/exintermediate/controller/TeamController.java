package com.example.exintermediate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.exintermediate.service.TeamService;

@Controller
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/team")
    public String teamIndex(Model model) {
        model.addAttribute("teamList", teamService.showList());
        return "team-index";
    }

    @GetMapping("/team/result")
    public String teamResult(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("team", teamService.showResult(id));
        return "team-result";
    }
}
