package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    ArrayDeque<Integer> arrayDeque= new ArrayDeque<>();
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
    arrayDeque.add(firstQueue.remove());
    arrayDeque.add(firstQueue.remove());
    arrayDeque.add(secondQueue.remove());
    arrayDeque.add(secondQueue.remove());
    while (!firstQueue.isEmpty() || !secondQueue.isEmpty()){
        OnePlayerCard(firstQueue);
        OnePlayerCard(secondQueue);
    }
    return arrayDeque;
    }

    private void OnePlayerCard(Queue<Integer> queque){
    queque.add(arrayDeque.removeLast());
    arrayDeque.add(queque.remove());
    if(!queque.isEmpty()){
        return;
    }
    arrayDeque.add(queque.remove());
    }

}
