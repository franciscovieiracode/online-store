package com.onlinestore.onlineStore.repos;

import com.onlinestore.onlineStore.models.Item;
import com.onlinestore.onlineStore.models.ItemReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<ItemReview, Long>{

}
