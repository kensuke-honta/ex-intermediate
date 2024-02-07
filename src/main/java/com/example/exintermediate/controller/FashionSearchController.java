package com.example.exintermediate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/fassion")
public class FashionSearchController {

  @GetMapping("/index")
  public String fassionSearchIndex(Model model) {
    return "fassion-search";
  }

}
