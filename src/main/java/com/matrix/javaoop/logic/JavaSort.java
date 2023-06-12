package com.matrix.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-13
 * description    :
 */
public class JavaSort <T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }

}
