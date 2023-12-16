package com.juniortasks.demo.services;

import com.juniortasks.demo.entity.Point;
import com.juniortasks.demo.repos.IPointRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PointService implements IPointService{

    @Autowired
    private IPointRepo repos;

    @Override
    @Transactional(readOnly = true)
    public List<Point> findAll() {
        return (List<Point>) repos.findAll();
    }

    @Override
    @Transactional
    public Point save(Point point) {
        return repos.save(point);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repos.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Point findById(Long id) {
        return repos.findById(id).orElse(null);
    }
}
