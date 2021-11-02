package com.cmundo.methods;

import com.cmundo.dao.MethodDAO;

import java.util.PriorityQueue;

public class MyPriorityQueue<E> implements MethodDAO<E> {

    PriorityQueue<E> priorityQueue = new PriorityQueue<>();

    @Override
    public void add(E item) {
        priorityQueue.add(item);
    }

    @Override
    public void remove(E item) {
        priorityQueue.remove(item);
    }

    @Override
    public void update(int key, E item) {
        System.out.println("PRIORITY QUEUE CANNOT DO THAT :( ");
    }

    @Override
    public void iterate() {
        for (E e : priorityQueue){
            System.out.println(e.toString());
        }
    }
}
