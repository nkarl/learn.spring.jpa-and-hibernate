package com.tutorial.JpaAndHibernate.course.jbdc;

import com.tutorial.JpaAndHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJbdcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure", "in28minutes"));
        repository.insert(new Course(3, "Learn Spring", "in28minutes"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
