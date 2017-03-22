package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
