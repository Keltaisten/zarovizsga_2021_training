package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DogTypes {
    JdbcTemplate jdbcTemplate;

    public DogTypes(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getDogsByCountry(String country){
        return jdbcTemplate.query("SELECT name FROM dog_types WHERE country = ?;",
                (rs,rowNum)->rs.getString("name"),country.toUpperCase())
                .stream()
                .map(String::toLowerCase)
                .sorted()
                .toList();
    }
}
