package com.cmundo.methods;

import com.cmundo.dao.MapMethods;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap<K,T> implements MapMethods<K,T> {

    TreeMap<K,T> treeMap = new TreeMap<>();

    @Override
    public void addOrUpdate(K key, T item) {
        treeMap.put(key,item);
    }

    @Override
    public void remove(K key, T item) {
        treeMap.remove(key,item);
    }

    @Override
    public void iterate() {
        for (Map.Entry<K,T> mapEntry : treeMap.entrySet()){
            K key = mapEntry.getKey();
            T item = mapEntry.getValue();
            System.out.println("Key #"+key+ " Details:");
            System.out.println(item.toString());
        }
    }
}
