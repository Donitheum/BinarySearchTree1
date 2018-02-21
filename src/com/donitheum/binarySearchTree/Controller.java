package com.donitheum.binarySearchTree;

import com.donitheum.binarySearchTree.treeClasses.BinarySearchTree;

import java.util.Iterator;
import java.util.List;

public class Controller {

    public void initialize(){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(10);
        tree.add(4);
        tree.add(15);
        tree.add(7);
        tree.add(2);
        tree.add(-10);
        List<Integer> list = tree.getSortedList();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
