package com.cmundo.dao;

public interface MapMethods<K,T> {
    void addOrUpdate (K key, T item);
    void remove(K key, T item);
    void iterate();
}
