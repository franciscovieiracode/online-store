package com.onlinestore.onlineStore.controllers;

import com.onlinestore.onlineStore.models.Item;
import com.onlinestore.onlineStore.models.ItemReview;
import com.onlinestore.onlineStore.models.dto.ItemReviewsGetDTO;
import com.onlinestore.onlineStore.services.ItemServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemServiceImp itemServiceImp;

    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        return new ResponseEntity<>(itemServiceImp.addItem(item), HttpStatus.CREATED);
    }

    @GetMapping("/get-all-items")
    public ResponseEntity <List<Item>> getAllItems(){
        return new ResponseEntity<>(itemServiceImp.getAllItems(), HttpStatus.OK);
    }

    @GetMapping("/get-item-with-reviews/{id}")
    public ResponseEntity <List<ItemReviewsGetDTO>> getItemWithReviews(@PathVariable Long id){
        return new ResponseEntity<>(itemServiceImp.getItemWithReviews(id), HttpStatus.OK);
    }

}
