package com.tutorial.JpaAndHibernate.course.jbdc;

import com.tutorial.JpaAndHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJbdcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY = """
                INSERT INTO course(id, name, author)
                VALUES(?, ?, ?);
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }

    private static final String DELETE_QUERY = """
                DELETE FROM course WHERE id=?
            """;

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    private static final String SELECT_QUERY = """
                SELECT * FROM course WHERE id=?
            """;


    public Course findById(long id) {
        // ResultSet -> Bean => Row Mapper => Object
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);
    }
}
