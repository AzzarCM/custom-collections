package com.cmundo;

import com.cmundo.domain.Person;
import com.cmundo.methods.*;

public class Main {

    public static void main(String[] args) {
        //Creating data objects
        Person cristian = new Person(1, "Cristian", "Mundo", 22);
        Person rudi = new Person(2, "Rudi", "Vallecios", 22);
        Person alejandra = new Person(3, "Alejandra", "Lainez", 23);
        Person karen = new Person(4, "Karen", "Efigenio", 18);

        //Initializing custom collections
        MyHashSet<Person> hashSet = new MyHashSet<>();
        MyLinkedHashSet<Person> linkedHashSet = new MyLinkedHashSet<>();
        MyTreeSet<Person> treeSet = new MyTreeSet<>();
        MyArrayList<Person> arrayList = new MyArrayList<>();
        MyVector<Person> vector = new MyVector<>();
        MyLinkedList<Person> linkedList = new MyLinkedList<>();
        MyPriorityQueue<Person> priorityQueue = new MyPriorityQueue<>();
        MyHashTable<Integer, Person> hashTable = new MyHashTable<>();
        MyHashMap<Integer,Person> hashMap = new MyHashMap<>();
        MyLinkedHashMap<Integer, Person> linkedHashMap = new MyLinkedHashMap<>();
        MyTreeMap<Integer,Person> treeMap = new MyTreeMap<>();

        /* Running cases ... */
        System.out.println("**************************************");
        System.out.println("*********       HASH SET      ********");
        System.out.println("**************************************");
        hashSet.add(cristian);
        hashSet.add(rudi);
        hashSet.add(alejandra);
        hashSet.add(karen);
        System.out.println("******* ITERATING HASHSET *******");
        hashSet.iterate();
        System.out.println("******* HASHSET AFTER REMOVING 'RUDI' *******");
        hashSet.remove(rudi);
        hashSet.iterate();
        System.out.println();

        System.out.println("**************************************");
        System.out.println("*********    LINKED HASHSET   ********");
        System.out.println("**************************************");
        linkedHashSet.add(cristian);
        linkedHashSet.add(rudi);
        linkedHashSet.add(alejandra);
        linkedHashSet.add(karen);
        System.out.println("******* ITERATING LINKED HASHSET *******");
        linkedHashSet.iterate();
        linkedHashSet.remove(alejandra);
        System.out.println("******* LINKED HASHSET AFTER REMOVING 'ALEJANDRA' *******");
        linkedHashSet.iterate();
        System.out.println();


        System.out.println("**************************************");
        System.out.println("*********      TREE SET       ********");
        System.out.println("**************************************");
        treeSet.add(cristian);
        treeSet.add(rudi);
        treeSet.add(karen);
        treeSet.add(alejandra);
        System.out.println("******* ITERATING TREE SET *******");
        treeSet.iterate();
        treeSet.remove();
        treeSet.remove(karen);
        System.out.println("******* TREE SET AFTER REMOVING FIRST ELEMENT 'CRISTIAN' and object 'KAREN' *******");
        treeSet.iterate();
        System.out.println();


        System.out.println("**************************************");
        System.out.println("*********     ARRAY LIST      ********");
        System.out.println("**************************************");
        arrayList.add(rudi);
        arrayList.add(cristian);
        arrayList.add(alejandra);
        arrayList.add(karen);
        System.out.println("******* ITERATING TREE SET *******");
        arrayList.iterate();
        arrayList.remove(rudi);
        System.out.println("******* ARRAY LIST AFTER REMOVING 'RUDI' *******");
        arrayList.iterate();
        arrayList.update(0, new Person(10, "Carlos", "Mira", 40));
        System.out.println("******* ARRAY LIST AFTER UPDATING POSITION 0 *******");
        arrayList.iterate();
        System.out.println();

        System.out.println("**************************************");
        System.out.println("*********      VECTOR         ********");
        System.out.println("**************************************");
        vector.add(cristian);
        vector.add(alejandra);
        vector.add(karen);
        vector.add(rudi);
        System.out.println("******* ITERATING VECTOR *******");
        vector.iterate();
        vector.remove(karen);
        System.out.println("******* VECTOR AFTER REMOVING KAREN *******");
        vector.iterate();
        vector.update(1, new Person(34, "Danniela", "Renderos", 24));
        System.out.println("******** VECTOR AFTER UPDATING POSITION 1 ********");
        vector.iterate();
        System.out.println();


        System.out.println("**************************************");
        System.out.println("********      LINKED LIST     ********");
        System.out.println("**************************************");
        linkedList.add(karen);
        linkedList.add(alejandra);
        linkedList.add(cristian);
        linkedList.add(rudi);
        System.out.println("***** ITERATING LINKED LIST ******");
        linkedList.iterate();
        linkedList.remove(cristian);
        System.out.println("***** LINKED LIST AFTER REMOVING 'CRISTIAN' ");
        linkedList.iterate();
        linkedList.update(0, new Person(100, "Vanessa", "Perez", 30));
        System.out.println("***** LINKED LIST AFTER UPDATING POSITION 0 ");
        linkedList.iterate();
        System.out.println();


        System.out.println("**************************************");
        System.out.println("********    PRIORITY QUEUE    ********");
        System.out.println("**************************************");
        priorityQueue.add(cristian);
        priorityQueue.add(rudi);
        priorityQueue.add(alejandra);
        priorityQueue.add(karen);
        System.out.println("***** ITERATING OVER PRIORITY QUEUE  ");
        priorityQueue.iterate();
        priorityQueue.remove(karen);
        System.out.println("***** PRIORITY QUEUE AFTER REMOVING 'KAREN' ");
        priorityQueue.iterate();
        System.out.println();


        System.out.println("**************************************");
        System.out.println("********      HASH TABLE      ********");
        System.out.println("**************************************");
        hashTable.addOrUpdate(100, cristian);
        hashTable.addOrUpdate(200,rudi);
        hashTable.addOrUpdate(300, alejandra);
        hashTable.addOrUpdate(400,karen);
        System.out.println("***** ITERATING THE HASH TABLE *******");
        hashTable.iterate();
        hashTable.addOrUpdate(200, new Person(21, "David", "Vallecios", 21));
        System.out.println("**** UPDATING HASH TABLE 'KEY 200' ");
        hashTable.iterate();
        hashTable.remove(100, cristian);
        System.out.println("*** REMOVING 'CRISTIAN' FROM TABLE ");
        hashTable.iterate();
        System.out.println();

        System.out.println("**************************************");
        System.out.println("********       HASH MAP       ********");
        System.out.println("**************************************");
        hashMap.addOrUpdate(100, cristian);
        hashMap.addOrUpdate(200, rudi);
        hashMap.addOrUpdate(300, alejandra);
        hashMap.addOrUpdate(400, karen);
        System.out.println("*** ITERATING HAS MAP ****");
        hashMap.iterate();
        hashMap.remove(200, rudi);
        hashMap.addOrUpdate(300, new Person(3, "Danniela", "Renderos", 25));
        System.out.println("*** HASH MAP AFTER REMOVING 'RUDI' AND UPDATING KEY #300");
        hashMap.iterate();
        System.out.println();


        System.out.println("**************************************");
        System.out.println("******     LINKED HASH MAP      ******");
        System.out.println("**************************************");
        linkedHashMap.addOrUpdate(100, cristian);
        linkedHashMap.addOrUpdate(200, rudi);
        linkedHashMap.addOrUpdate(300, alejandra);
        linkedHashMap.addOrUpdate(400, karen);
        System.out.println("*** ITERATING LINKED HASH MAP ***");
        linkedHashMap.iterate();
        linkedHashMap.remove(100, cristian);
        linkedHashMap.addOrUpdate(400, new Person(4, "Vanessa", "Perez", 22));
        System.out.println("*** LINKED HASHMAP AFTER REMOVING 'CRISTIAN' AND UPDATING KEY #400");
        linkedHashMap.iterate();
        System.out.println();

        System.out.println("**************************************");
        System.out.println("********       TREE MAP       ********");
        System.out.println("**************************************");
        treeMap.addOrUpdate(100, cristian);
        treeMap.addOrUpdate(200, rudi);
        treeMap.addOrUpdate(300, alejandra);
        treeMap.addOrUpdate(400, karen);
        System.out.println("*** ITERATING TREE MAP ***");
        treeMap.iterate();
        treeMap.remove(200, rudi);
        treeMap.addOrUpdate(100, new Person(1, "Alexander", "Orellana", 23));
        System.out.println("*** TREE MAP AFTER REMOVING 'RUDI' AND UPDATING KEY #100");
        treeMap.iterate();
        System.out.println();





    }
}
