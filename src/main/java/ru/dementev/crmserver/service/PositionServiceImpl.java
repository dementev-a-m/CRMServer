package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.Position;
import ru.dementev.crmserver.repository.PositionRepository;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository repository;

    public List<Position> getAll() {
        return repository.findAll();
    }

    public List<Position> getByOrganizationId() {
        return null;
    }

    public Position getById(long id) {
        return repository.findOne(id);
    }

    public Position save(Position position) {
        return repository.saveAndFlush(position);
    }

    public String delete(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
