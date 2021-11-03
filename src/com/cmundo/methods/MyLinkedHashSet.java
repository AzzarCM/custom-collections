package com.cmundo.methods;

import com.cmundo.dao.MethodDAO;

import java.util.LinkedHashSet;

public class MyLinkedHashSet<E> implements MethodDAO<E> {

    LinkedHashSet<E> lhs = new LinkedHashSet<E>();

    @Override
    public void add(E item) {
        lhs.add(item);
    }

    @Override
    public void remove(E item) {
        lhs.remove(item);
    }

    @Override
    public void update(int key, E item) {
        throw new IllegalArgumentException("linked HashSet cannot be updated");
    }

    @Override
    public void iterate() {
        for(E item : lhs){
            System.out.println(item.toString());
        }
    }

}
