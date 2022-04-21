package com.Queues;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        var queue = new ArrayQueue();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
//        queue.DeQueue();
        queue.DeQueue();
        queue.Enqueue(20);
//        queue.peek();
//        queue.print();
        System.out.println(queue);
    }
    public static void reverse(Queue<Integer> queue){
       var stack  =  new Stack<Integer>();

       while(!queue.isEmpty()) {
           var a = queue.remove();
           stack.push(a);
       }
       while(!stack.isEmpty()){
           var a = stack.pop();
           queue.add(a);
       }
        System.out.println(queue);
    }
}
