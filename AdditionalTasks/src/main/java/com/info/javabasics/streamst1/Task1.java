package com.info.javabasics.streamst1;

import java.util.List;
import java.util.stream.Stream;

public class Task1<T> {
    public List<T> paging (int itemsOnPage, int pageNumber, Stream<T> data){

        return data.limit((long) itemsOnPage*pageNumber)
                .skip((long) itemsOnPage*(pageNumber-1))
                .toList();
    }
}
