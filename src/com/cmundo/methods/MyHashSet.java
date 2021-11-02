package com.cmundo.methods;

import com.cmundo.dao.MethodDAO;

import java.util.HashSet;

public class MyHashSet<E> implements MethodDAO<E> {

    HashSet<E> h = new HashSet<E>();

    @Override
    public void add(E item) {
        h.add(item);
    }

    @Override
    public void remove(E itemToRemove) {
        h.remove(itemToRemove);
    }

    @Override
    public void update(int key, E item) {
        System.out.println("A HASHSET CANNOT BE UPDATED :(");
    }

    @Override
    public void iterate() {
        for(E item : h){
            System.out.println(item.toString());
        }
    }

}
