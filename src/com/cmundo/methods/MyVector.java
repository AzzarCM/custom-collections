package com.cmundo.methods;

import com.cmundo.dao.MethodDAO;

import java.util.Vector;

public class MyVector<E> implements MethodDAO<E> {

    Vector<E> vector = new Vector<>();

    @Override
    public void add(E item) {
        vector.add(item);
    }

    @Override
    public void remove(E item) {
        vector.remove(item);
    }

    @Override
    public void update(int key, E item) {
        vector.set(key,item);
    }

    @Override
    public void iterate() {
        for (E e: vector) {
            System.out.println(e.toString());
        }
    }
}
