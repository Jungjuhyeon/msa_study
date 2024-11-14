package com.msa.rental.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
public class Item {
    private Integer no;
    private String title;
    public static Item Sample(){
        return new Item(10,"노인과바다");
    }
}
