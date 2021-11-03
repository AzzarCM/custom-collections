package com.cmundo.methods;

import com.cmundo.dao.MapMethods;
import com.cmundo.dao.MethodDAO;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap<K,T> implements MapMethods<K,T> {

    HashMap<K,T> map = new HashMap<K, T>();

    @Override
    public void iterate() {
        for(Map.Entry<K,T> entry: map.entrySet()){
            K key = entry.getKey();
            T item = entry.getValue();
            System.out.println("Key #"+key+ " Details:");
            System.out.println(item.toString());
        }
    }

    @Override
    public void addOrUpdate(K key, T item) {
        map.put(key,item);
    }

    @Override
    public void remove(K key, T item) {
        map.remove(key,item);
    }
}
