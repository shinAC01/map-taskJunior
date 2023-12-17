package com.juniortasks.demo.controllers;


import com.juniortasks.demo.entity.Point;
import com.juniortasks.demo.services.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PointRESTController {

    @Autowired
    private IPointService service;

    @GetMapping("/recursos")
    public List<Point> index() {
        return service.findAll();
    }
}
