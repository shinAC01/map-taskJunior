package com.juniortasks.demo.services;

import com.juniortasks.demo.entity.Point;

import java.util.List;

public interface IPointService {
    public List<Point> findAll();

    public Point save(Point point);

    public void delete(Long id);

    public Point findById(Long id);
}
