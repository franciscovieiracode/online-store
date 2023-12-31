package com.onlinestore.onlineStore.services;

import com.onlinestore.onlineStore.models.ItemReview;
import com.onlinestore.onlineStore.models.dto.ItemReviewAddDTO;

public interface ReviewService {

    ItemReview addReview(ItemReviewAddDTO itemReviewAddDTO);
}
