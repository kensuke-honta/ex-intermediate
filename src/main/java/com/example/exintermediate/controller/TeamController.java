package com.example.exintermediate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
  @GetMapping("/team")
    public String teamIndex() {
        return "team-index";
    }
  
}
