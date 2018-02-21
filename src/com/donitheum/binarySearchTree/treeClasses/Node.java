package com.donitheum.binarySearchTree.treeClasses;

/**
 * Created by Donitheum on 21/02/2018.
 */
public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T value;
    private Node<T> left;
    private Node<T> right;
    public Node(){

    }

    public Node(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){

    }

    @Override
    public int compareTo(Node<T> o) {
        return value.compareTo(o.getValue());
    }

    public Node<T> getRight(){
        return right;
    }

    public Node<T> getLeft(){
        return left;
    }

    public void setRight(Node<T> node){
        right = node;
    }

    public void setLeft(Node<T> node){
        left = node;
    }
}
