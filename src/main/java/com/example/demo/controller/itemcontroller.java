package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.repository.itemrepo;

@RestController
@RequestMapping("/items")
public class itemcontroller {
	@Autowired
	private itemrepo repo;
	
	@GetMapping
	public List<Item> getAllItems() {
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Item> getItemById(@PathVariable Long id) {
		return repo.findById(id);
	}
	
	
	@PostMapping
	public Item additem(@RequestBody Item item) {
		return repo.save(item);
	}
	@DeleteMapping("/{id}")
	public void deleteitem(@PathVariable Long id) {
		repo.deleteById(id);
	}
}
