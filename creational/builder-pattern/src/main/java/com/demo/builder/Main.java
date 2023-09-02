package com.demo.builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       /* Product product=new Product(
               2000,
                "Fresh Fruit",
                30,
                LocalDate.now(),
                2000
        );*/
        //System.out.println(product);

        Product product=new ProductBuilder()
                .create()
                .addQuantity(23)
                .addPrice(13000)
                .addPrice(10000)
                .addPrice(12000)
                .addDescription("Fresh Meet")
                .addName("Fish")
                .addUpdatedDate(LocalDate.now())
                .build();
    }
}
