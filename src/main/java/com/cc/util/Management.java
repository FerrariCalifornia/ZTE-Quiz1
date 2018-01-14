package com.cc.util;

import com.cc.bean.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Management {



    public Map<String, Double> getDiscountMap() {
        Map<String, Double> discountMap = new HashMap<String, Double>();
        discountMap.put("newBook", 1.2);
        discountMap.put("regularBook", 1.0);
        discountMap.put("unsalableBook", 0.6);
        return discountMap;
    }

    public Double getTotalPrice(List<Book> books) {
        Map<String, Double> discountMap = getDiscountMap();
        Double total=0.0;
        for (Book b:books
             ) {
            total += b.getPirce() * discountMap.get(b.getType());
        }
        return total;
    }
}
