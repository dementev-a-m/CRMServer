package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.Organization;
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
