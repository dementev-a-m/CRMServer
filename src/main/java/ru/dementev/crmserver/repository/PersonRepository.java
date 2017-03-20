package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
