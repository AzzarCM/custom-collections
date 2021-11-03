package com.cmundo.methods;

import com.cmundo.dao.MapMethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap<K,T> implements MapMethods<K,T> {

    LinkedHashMap<K,T> linkedHashMap = new LinkedHashMap<>();

    @Override
    public void addOrUpdate(K key, T item) {
        linkedHashMap.put(key,item);
    }

    @Override
    public void remove(K key, T item) {
        linkedHashMap.remove(key,item);
    }

    @Override
    public void iterate() {
        for(Map.Entry<K,T> mapElement : linkedHashMap.entrySet()){
            K key = mapElement.getKey();
            T item = mapElement.getValue();
            System.out.println("Key #"+key+ " Details:");
            System.out.println(item.toString());
        }
    }
}
