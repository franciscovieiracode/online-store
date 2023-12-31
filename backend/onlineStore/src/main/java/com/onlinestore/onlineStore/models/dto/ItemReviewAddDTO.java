package com.onlinestore.onlineStore.models.dto;

import com.onlinestore.onlineStore.models.ItemReview;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * DTO to transfer data to add review to a item
 */
public class ItemReviewAddDTO {

    private int id;
    private ItemReview itemReview;

}
