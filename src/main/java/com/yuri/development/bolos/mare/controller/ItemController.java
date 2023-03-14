package com.yuri.development.bolos.mare.controller;

import com.yuri.development.bolos.mare.ItemDTO;
import com.yuri.development.bolos.mare.model.Item;
import com.yuri.development.bolos.mare.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody ItemDTO itemDTO){

        return itemService.create(itemDTO);
    }

    @PutMapping
    public ResponseEntity<?>update(@RequestBody Item item){
        return itemService.update();
    }

    @GetMapping
    public ResponseEntity<?>findAll(){
        return itemService.findAll();
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        itemService.delete(id);
    }

    }