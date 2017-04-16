package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
