package com.cmundo.dao;

public interface MethodDAO<E> {
    void add(E item);
    void remove(E item);
    void update(int key, E item);
    void iterate();
}
