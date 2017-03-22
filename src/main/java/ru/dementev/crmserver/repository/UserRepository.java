package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}
