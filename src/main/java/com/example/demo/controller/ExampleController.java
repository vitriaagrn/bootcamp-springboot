package com.example.demo.controller;

import com.example.demo.entity.Example;
import com.example.demo.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @Autowired
    ExampleRepository repo;

    @GetMapping("/list")
    public Iterable<Example> list() {
        return repo.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Example> save(@RequestBody Example data) {
        data = this.repo.save(data);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Example> findById(@PathVariable("id") String id) {
        Optional<Example> optional = this.repo.findById(id);
        return optional.map(ResponseEntity::ok).orElseGet(() ->
                ResponseEntity.noContent().build());
    }
}
