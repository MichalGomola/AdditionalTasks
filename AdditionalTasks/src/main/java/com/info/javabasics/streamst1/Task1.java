package com.info.javabasics.streamst1;

import java.util.List;
import java.util.stream.Stream;

public class Task1 {
    public static <T> List<T> paging (int itemsOnPage, int pageNumber, Stream<T> data){

        return data
                .skip((long) itemsOnPage*(pageNumber-1))
                .limit(itemsOnPage)
                .toList();
    }
}
