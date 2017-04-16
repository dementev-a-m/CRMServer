package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position,Long> {
}
