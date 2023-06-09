package ru.otus.spring.repostory;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.otus.spring.domain.Person;

import java.util.List;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findAll();
    List<Person> findByName(String name);
}
