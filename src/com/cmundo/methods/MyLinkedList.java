package com.cmundo.methods;

import com.cmundo.dao.MethodDAO;

import java.util.LinkedList;

public class MyLinkedList<E> implements MethodDAO<E> {

    LinkedList<E> linkedList = new LinkedList<>();

    @Override
    public void add(E item) {
        linkedList.add(item);
    }

    @Override
    public void remove(E item) {
        linkedList.remove(item);
    }

    @Override
    public void update(int key, E item) {
        linkedList.set(key, item);
    }

    @Override
    public void iterate() {
        for(E e : linkedList){
            System.out.println(e.toString());
        }
    }
}
