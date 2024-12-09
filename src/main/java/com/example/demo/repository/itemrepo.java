package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Item;

public interface itemrepo extends JpaRepository<Item, Long> {



}
