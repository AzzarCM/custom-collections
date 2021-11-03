package com.cmundo.methods;

import com.cmundo.dao.MethodDAO;
import java.util.TreeSet;

public class MyTreeSet<E> implements MethodDAO<E>{

    TreeSet<E> set = new TreeSet<E>();

    @Override
    public void add(E item) {
        set.add(item);
    }

    @Override
    public void remove(E item) {
        set.remove(item);
    }

    @Override
    public void update(int key, E item) {
        throw new IllegalArgumentException("Tree set cannot be updated");
    }

    @Override
    public void iterate() {
        for(E item : set){
            System.out.println(item.toString());
        }
    }

    public void remove() {
        set.pollFirst();
    }

}
