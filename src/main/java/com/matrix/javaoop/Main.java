package com.matrix.javaoop;

import com.matrix.javaoop.logic.JavaSort;
import com.matrix.javaoop.logic.Sort;

import java.util.Arrays;

/**
 * author         : Jason Lee
 * date           : 2023-06-13
 * description    :
 */public class Main {
    public static void main(String[] args) {

        Sort<String> sort = new JavaSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
