package com.onlinestore.onlineStore.services;

import com.onlinestore.onlineStore.models.Item;
import com.onlinestore.onlineStore.models.ItemReview;
import com.onlinestore.onlineStore.models.dto.ItemReviewsGetDTO;
import com.onlinestore.onlineStore.repos.ItemRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ItemServiceImp implements ItemService{

    private final ItemRepo itemRepo;
    @Override
    public Item addItem(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    @Override
    public List<ItemReviewsGetDTO> getItemWithReviews(Long id) {
        return itemRepo.getItemWithReviews(id);
    }

}
