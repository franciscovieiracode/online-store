package com.onlinestore.onlineStore.controllers;

import com.onlinestore.onlineStore.models.ItemReview;
import com.onlinestore.onlineStore.models.dto.ItemReviewAddDTO;
import com.onlinestore.onlineStore.services.ReviewServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewServiceImp reviewServiceImp;

    @PostMapping("/add")
    public ResponseEntity<ItemReview> addItemReview(@RequestBody ItemReviewAddDTO itemReviewAddDTO){
        return new ResponseEntity<>(reviewServiceImp.addReview(itemReviewAddDTO), HttpStatus.CREATED);
    }
}
