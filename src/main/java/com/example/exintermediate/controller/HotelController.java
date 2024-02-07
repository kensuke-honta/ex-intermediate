package com.example.exintermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.exintermediate.model.Hotel;
import com.example.exintermediate.service.HotelService;
import com.example.exintermediate.form.HotelForm;

@Controller
public class HotelController {

  @Autowired
  private HotelService hotelService;

  @GetMapping("/hotelIndex")
  public String hotelIndex(Model model) {
    return "hotel-search";
  }

  @PostMapping("/search")
  public String search(HotelForm form, Model model) {
    List<Hotel> hotelList = hotelService.lowPriceHotel(form.getPrice());
    model.addAttribute("hotelList", hotelList);
    return "hotel-search";
  }

}
