package com.example.springbootreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springbootreact.model.Beer;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}