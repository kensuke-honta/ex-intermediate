package com.example.exintermediate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.exintermediate.model.Hotel;

@Repository
public class HotelRepository {
  @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Hotel> HOTEL_ROW_MAPPER = new BeanPropertyRowMapper<>(Hotel.class);

    /**
     *全件ホテル情報
     * @return ホテル情報
     */
    public List<Hotel> findHotel() {
        StringBuilder query = new StringBuilder().append("select area_name,hotel_name,address,nearest_station,price,parking from hotels");
        List<Hotel> hotelList = template.query(query.toString(), HOTEL_ROW_MAPPER);
        return hotelList;
    }

    /**
     * 検索金額内のホテル情報
     * @return 価格以下のホテル情報.
     */
    public List<Hotel> findHotelSearchLowPrice(Integer price) {
      String query = "SELECT area_name, hotel_name, address, nearest_station, price, parking FROM hotels WHERE price <= :price";
      SqlParameterSource param = new MapSqlParameterSource().addValue("price", price);
      List<Hotel> hotelList = template.query(query, param, HOTEL_ROW_MAPPER);
      return hotelList;
  }
  

  
}
