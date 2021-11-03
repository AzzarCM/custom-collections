package com.cmundo.methods;

import com.cmundo.dao.MapMethods;
import java.util.Hashtable;
import java.util.Map;

public class MyHashTable<K,T> implements MapMethods<K,T> {

    Hashtable<K,T> hashtable = new Hashtable<>();

    @Override
    public void remove(K key, T item){
        hashtable.remove(key, item);
    }

    @Override
    public void iterate() {
        for(Map.Entry<K,T> entry : hashtable.entrySet()){
            K key = entry.getKey();
            T item = entry.getValue();
            System.out.println("Key #"+key+ " Details:");
            System.out.println(item.toString());
        }
    }

    @Override
    public void addOrUpdate(K key, T item) {
        hashtable.put(key,item);
    }

}
