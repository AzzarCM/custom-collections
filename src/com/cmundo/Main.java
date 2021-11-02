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
        System.out.println("******* TREE SET AFTER REMOVING FIRST ELEMENT *******");
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

        System.out.println("**************************************");
        System.out.println("********       HASH MAP       ********");
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("******     LINKED HASH MAP      ******");
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("********       TREE MAP       ********");
        System.out.println("**************************************");





    }
}
