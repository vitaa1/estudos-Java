package maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("v");
        fila.add("a");
        fila.add("b");
        fila.add("c");

        while(!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
