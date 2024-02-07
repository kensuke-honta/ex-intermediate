package com.example.exintermediate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import com.example.exintermediate.model.Team;

@Repository
public class TeamRepository {
  @Autowired
    private NamedParameterJdbcTemplate template;

      /* チームオブジェクトを生成するrowmapper. */
    private static final RowMapper<Team> TEAM_ROW_MAPPER = new BeanPropertyRowMapper<>(Team.class);


       public List<Team> findAll() {
        StringBuilder query = new StringBuilder().append("SELECT id, league_name, team_name, headquarters, inauguration, history FROM teams ORDER BY inauguration");
        List<Team> teamList = template.query(query.toString(), TEAM_ROW_MAPPER);
        return teamList;
    }

    public Team findById(Integer id) {
        StringBuilder query = new StringBuilder().append("SELECT id, league_name, team_name, headquarters, inauguration, history FROM teams WHERE id = :id");
        SqlParameterSource param = new MapSqlParameterSource("id", id);
        Team team = template.queryForObject(query.toString(), param, TEAM_ROW_MAPPER);
        return team;
    }
}
