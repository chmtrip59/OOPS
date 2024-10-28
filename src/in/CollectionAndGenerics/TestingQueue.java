package in.CollectionAndGenerics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;

public class TestingQueue {

    public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();

            queue.add(1);
            queue.offer(2);



//        for (Integer i : queue) {
//            System.out.println(i);
//        }
        Utility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());

        Utility.print(queue);

        System.out.println(queue.poll());

        Utility.print(queue);

//        System.out.println(queue.remove());//Throws exception

        System.out.println(queue.poll());// It returns null instead of exception
    }


}
