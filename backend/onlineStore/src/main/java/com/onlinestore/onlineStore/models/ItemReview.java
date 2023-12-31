package com.onlinestore.onlineStore.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity(name = "ItemReviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemReview {


    @Id
    @SequenceGenerator(
            name = "review_sequence",
            sequenceName = "review_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "review_sequence",
            strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item review;
}
