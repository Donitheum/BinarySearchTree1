package com.donitheum.binarySearchTree.treeClasses;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Donitheum on 21/02/2018.
 */
public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root = null;

    public void add(T value){
        Node<T> newNode = new  Node<T>(value);
        Node<T> current = root;
        if(root==null){
            root = newNode;
            return;
        }
        while(true){
            if(newNode.compareTo(current)>0) {
                if(current.getRight()!=null)
                    current = current.getRight();
                else {
                    current.setRight(newNode);
                    break;
                }
            }
            else{
                if(current.getLeft()!= null)
                    current = current.getLeft();
                else{
                    current.setLeft(newNode);
                    break;
                }
            }

        }
    }


    public List<T> getSortedList() {
        List<T> list = new LinkedList<T>();
        if(root==null){
            return list;
        }
        traverse(root,list);
        return list;
    }

    private void traverse(Node<T> node,List<T> list) {
        if(node.getLeft()!=null)
            traverse(node.getLeft(),list);
        list.add(node.getValue());

        if(node.getRight()!=null)
            traverse(node.getRight(),list);
    }

}
