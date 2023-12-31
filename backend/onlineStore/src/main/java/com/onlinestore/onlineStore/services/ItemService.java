package com.onlinestore.onlineStore.services;

import com.onlinestore.onlineStore.models.Item;
import com.onlinestore.onlineStore.models.dto.ItemReviewsGetDTO;

import java.util.List;

public interface ItemService {

    Item addItem(Item item);

    List<Item> getAllItems();

    List<ItemReviewsGetDTO> getItemWithReviews(Long id);

}
