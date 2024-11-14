package com.msa.rental.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class IdName {
    private String id;
    private String name;

    public static IdName sampe(){
        return new IdName("scant","han");
    }

    public static void main(String[] args){
        System.out.println(sampe().toString());
    }
}
