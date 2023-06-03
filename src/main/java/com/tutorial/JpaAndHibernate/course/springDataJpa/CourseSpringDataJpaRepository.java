package com.tutorial.JpaAndHibernate.course.springDataJpa;

import com.tutorial.JpaAndHibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository  extends JpaRepository<Course, Long> {
    /*
        Spring Data JPA takes care of everything!
        We don't need to talk with the database using the entity manager at all.
     */
}
