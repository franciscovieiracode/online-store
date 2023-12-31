package com.onlinestore.onlineStore.models.dto;

import com.onlinestore.onlineStore.models.Item;
import com.onlinestore.onlineStore.models.ItemReview;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class ItemReviewsGetDTO {

    private Item item;
    private List<ItemReview> reviews;

    public ItemReviewsGetDTO(com.onlinestore.onlineStore.models.Item item, com.onlinestore.onlineStore.models.ItemReview review) {
        this.item = item;
        this.reviews = Arrays.asList(review);
    }

}
