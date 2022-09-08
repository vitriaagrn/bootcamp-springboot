package com.example.demo.repository;

import com.example.demo.entity.Example;
import org.springframework.data.repository.CrudRepository;

public interface ExampleRepository extends CrudRepository<Example, String> {
}
