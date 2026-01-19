package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(1L, "jujutsu kaisen", 19.50, 2));
        mangas.add(new Manga(6L, "Naruto", 2.50, 3));
        mangas.add(new Manga(3L, "Dragon ball z", 37.50, 8));
        mangas.add(new Manga(5L, "Demon Slayer", 3.50, 4));
        mangas.add(new Manga(10L, "Aemon Slayer", 09.50, 9));

        while(!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
