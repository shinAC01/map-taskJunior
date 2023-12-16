package com.juniortasks.demo.controllers;


import com.juniortasks.demo.services.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PointRESTController {

    @Autowired
    private IPointService service;
}
