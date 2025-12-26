package com.zosh.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @ManyToOne
    @JsonIgnore

    private Cart cart;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String size;

    private  int Quantity =1;

    private Integer mrpPrice;

    private Integer sellingPrice;

    private Integer userId;
}
