package com.matrix.javaoop.service;

import com.matrix.javaoop.logic.Sort;

import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-13
 * description    :
 */

public class SortService {

    private final Sort<String> sort;


    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }

}