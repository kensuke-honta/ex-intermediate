package com.example.exintermediate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exintermediate.model.FashionSearch;
import com.example.exintermediate.model.Hotel;
import com.example.exintermediate.repository.FashionSearchRepository;
import com.example.exintermediate.repository.HotelRepository;

@Service
public class FashionSearchService {
   @Autowired
  private FashionSearchRepository fashionSearchRepository;
  
   public List<FashionSearch> findSearch(String color , Integer gender) {
			return fashionSearchRepository.findColorAndGender(color, gender);
  }
  
}
