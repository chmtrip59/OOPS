package in.CollectionAndGenerics.Challenges;

import java.util.*;

public class myPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Golu",'B'));
        queue.offer(new Student("Ram",'A')); queue.offer(new Student("Shyam",'D')); queue.offer(new Student("Mohan",'B')); queue.offer(new Student("Raghav",'C'));

        System.out.printf("Queue is: %s\n",queue);
        System.out.printf("Got %s:\n",queue.poll());
        System.out.printf("Got %s:\n",queue.poll());
        System.out.printf("Got %s:\n",queue.poll());
        System.out.printf("Got %s:\n",queue.poll());
        System.out.printf("Got %s:\n",queue.poll());

    }



    //Student class for priority queue
    private static class Student{

        private final String name;

        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}
