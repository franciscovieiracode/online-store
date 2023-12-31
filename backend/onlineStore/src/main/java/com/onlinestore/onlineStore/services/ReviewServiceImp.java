package com.onlinestore.onlineStore.services;

import com.onlinestore.onlineStore.exceptions.ItemNotFoundException;
import com.onlinestore.onlineStore.models.Item;
import com.onlinestore.onlineStore.models.ItemReview;
import com.onlinestore.onlineStore.models.dto.ItemReviewAddDTO;
import com.onlinestore.onlineStore.repos.ItemRepo;
import com.onlinestore.onlineStore.repos.ReviewRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ReviewServiceImp implements ReviewService{

    private final ReviewRepo reviewRepo;
    private final ItemRepo itemRepo;

    @Override
    public ItemReview addReview(ItemReviewAddDTO itemReviewAddDTO) {

        //Get Item
        Optional<Item> opt = itemRepo.findById((long) itemReviewAddDTO.getId());

        if (opt.isPresent()){
            //Build Review to add
            ItemReview itemReview1 = new ItemReview();

            itemReview1.setDescription(itemReviewAddDTO.getItemReview().getDescription());
            itemReview1.setDate(itemReviewAddDTO.getItemReview().getDate());
            itemReview1.setReview(opt.get());

            log.info("Adding review for item with ID " + opt.get().getId());

            return reviewRepo.save(itemReview1);

        }
        else {
            log.info("Item with ID "+ 4+ " does not exist");
            throw new ItemNotFoundException("Item with ID "+ 4 + " does not exist");
        }


    }


}
