package com.matrix.javaoop;

import com.matrix.javaoop.logic.BubbleSort;

import java.util.Arrays;

/**
 * author         : Jason Lee
 * date           : 2023-06-13
 * description    :
 */public class Main {
    public static void main(String[] args) {

        BubbleSort<String> sort = new BubbleSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
