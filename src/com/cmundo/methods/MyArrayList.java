package com.cmundo.methods;

import com.cmundo.dao.MethodDAO;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<E> implements MethodDAO<E> {

    List<E> arr = new ArrayList<>();

    @Override
    public void add(E item) {
        arr.add(item);
    }

    @Override
    public void remove(E item) {
        arr.remove(item);
    }

    @Override
    public void update(int key, E item) {
        arr.set(key, item);
    }

    @Override
    public void iterate() {
        for(E item : arr){
            System.out.println(item.toString());
        }
    }
}
