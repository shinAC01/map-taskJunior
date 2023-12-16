package com.juniortasks.demo.repos;

import com.juniortasks.demo.entity.Point;
import org.springframework.data.repository.CrudRepository;

public interface IPointRepo extends CrudRepository<Point, Long> {
}
