package com.onlinestore.onlineStore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    public Item(String itemName, int price, String description) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
    }

    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "item_sequence",
            strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "itemName", nullable = false)
    private String itemName;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ItemReview> itemReviewList;

}
