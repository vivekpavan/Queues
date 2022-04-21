package com.Queues;

import java.util.Arrays;

//THE IMPLEMENTATION IS NOT RIGHT BECAUSE THE FRONT AND REAR POINTERS MUST BE TAKEN AS INDEX
//BUT HERE:
//THE REAR IS TAKEN AS THE VALUE OF THE LAST INDEX
//AND FRONT IS NOT USED ONLY.
//**** BUT STILL IT WORKS TO SOME EXTENT******
//HERE THE ERROR IS ONCE WE DEQUEUE WE CAN NEVER ENQUEUE , AS WE CHANGE THE SIZE OF THE ARRAY-
//DURING DEQUEUE, WHILE COPYING IT TO A NEW ARRAY.

public class ArrayQueue {
    private int[] array = new int[5];
    private int rear = array[0];
    private int index = 0;
    public ArrayQueue(){
        array = new int[5];
    }
    public void Enqueue(int item){
        if(IsFull()){
            throw new IllegalArgumentException("Queue is full");
        }
        array[index] = item;
        rear = array[index++];
    }
    public void DeQueue(){
        if(IsEmpty()){
            throw new IllegalArgumentException("Queue is Empty");
        }

        var array1 = Arrays.copyOfRange(array,1, index);
        array = array1;
        index--;
    }
    public void peek(){
        if(IsEmpty()){
            throw new IllegalArgumentException();
        }
        System.out.println(array[0]);
    }
    public boolean IsEmpty(){
         return  (index == 0);
    }
    public boolean IsFull(){
        return index ==5;
    }
    public void print(){
       for(var i = 0; i < index; i++)
           System.out.println(array[i]);
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
