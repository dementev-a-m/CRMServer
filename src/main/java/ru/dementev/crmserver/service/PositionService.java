package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.Position;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public interface PositionService {
    List<Position> getAll();
    List<Position> getByOrganizationId();
    Position getById(long id);
    Position save(Position position);
    String delete(long id);
}
