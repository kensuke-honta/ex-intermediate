package com.example.exintermediate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.exintermediate.model.FashionSearch;
import com.example.exintermediate.model.Hotel;

@Repository
public class FashionSearchRepository {
   @Autowired
    private NamedParameterJdbcTemplate template;
  
    //
    // private static final RowMapper<FashionSearch> FASHION_SEARCH_ROW_MAPPER = new BeanPropertyRowMapper<>(FashionSearch.class);

    private static final RowMapper<FashionSearch> FASHION_SEARCH_ROW_MAPPER
      = (rs, i) -> {
        FashionSearch fashionSearch = new FashionSearch();
        fashionSearch.setCategory(rs.getString("category"));
        fashionSearch.setGenre(rs.getString("genre"));
        fashionSearch.setGender(rs.getInt("gender"));
        fashionSearch.setColor(rs.getString("color"));
        fashionSearch.setPrice(rs.getInt("price"));
        fashionSearch.setSize(rs.getString("size"));
        return fashionSearch;
       };

    /**
     * 男女検索とカラー検索の二つを合わせた処理
     * @return 男女検索とカラー検索の二つを合わせた処理の結果の情報.
     */
    //複数条件検索
    public List<FashionSearch> findColorAndGender(String color , Integer gender){
      String query = "SELECT category, genre, gender, color, price, size FROM clothes WHERE color = :color AND gender = :gender";
      MapSqlParameterSource params = new MapSqlParameterSource().addValue("color", color).addValue("gender", gender);
      List<FashionSearch> fashionSearchList = template.query(query, params, FASHION_SEARCH_ROW_MAPPER);
      return fashionSearchList;
    }

  //   以下上記の参考
  //   public List<Hotel> findHotelSearchLowPrice(Integer price) {
  //     String query = "SELECT area_name, hotel_name, address, nearest_station, price, parking FROM hotels WHERE price <= :price";
  //     SqlParameterSource param = new MapSqlParameterSource().addValue("price", price);
  //     List<Hotel> hotelList = template.query(query, param, HOTEL_ROW_MAPPER);
  //     return hotelList;
  // }
  
}
