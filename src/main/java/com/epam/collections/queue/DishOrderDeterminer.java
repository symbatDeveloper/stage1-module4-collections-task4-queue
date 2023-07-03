package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue =new ArrayDeque<>();
        List<Integer> num =new ArrayList<>();
        for(int i=1;i<=numberOfDishes; i++)
            queue.add(i);
        while(!queue.isEmpty()){
            for(int j = 0; j < everyDishNumberToEat - 1; j++)
                queue.add(queue.remove());
                num.add(queue.remove());
        }
return num;
    }
}
