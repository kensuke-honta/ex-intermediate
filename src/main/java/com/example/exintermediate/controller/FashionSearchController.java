package com.example.exintermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.exintermediate.form.FashionSearchForm;
import com.example.exintermediate.model.FashionSearch;
import com.example.exintermediate.model.Hotel;
import com.example.exintermediate.service.FashionSearchService;

// @Controller

// @RequestMapping("/fassion")
// public class FashionSearchController {

//   @GetMapping("/index")
//   public String fassionSearchIndex(Model model) {
//     return "fassion-search";
//   }

//   @PostMapping("/search")
//      public String search(FashionSearchForm form, Model model) {
//       List<FashionSearch> fashionSearchList = FashionSearchService.findSearch(form.getColor(), form.getGender());
//       model.addAttribute("findSearch", fashionSearchList);
//       return "fashion-search";
//   }

//  }

@Controller
@RequestMapping("/fashion")
public class FashionSearchController {

  private final FashionSearchService fashionSearchService;

  @Autowired
  public FashionSearchController(FashionSearchService fashionSearchService) {
    this.fashionSearchService = fashionSearchService;
  }

  @GetMapping("/index")
  public String fashionSearchIndex(Model model) {
    // モデルに必要な情報を追加するコードを記述する
    return "fassion-search";
  }

  @PostMapping("/search")
  public String search(FashionSearchForm form, Model model) {
    List<FashionSearch> fashionSearchList = fashionSearchService.findSearch(form.getColor(), form.getGender());
    System.out.println(fashionSearchList);
    model.addAttribute("fashionSearchList", fashionSearchList);
    return "fassion-search";
  }
}
