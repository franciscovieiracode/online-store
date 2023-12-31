package com.onlinestore.onlineStore.repos;

import com.onlinestore.onlineStore.models.Item;
import com.onlinestore.onlineStore.models.dto.ItemReviewsGetDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Long> {

    @Query("SELECT new com.onlinestore.onlineStore.models.dto.ItemReviewsGetDTO(i, r) " +
            "FROM Items i LEFT JOIN i.itemReviewList r WHERE i.id = :itemId")
    List<ItemReviewsGetDTO> getItemWithReviews(@Param("itemId") Long itemId);


}
