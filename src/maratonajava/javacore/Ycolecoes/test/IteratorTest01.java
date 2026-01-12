package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "jujutsu kaisen", 19.50, 0));
        mangas.add(new Manga(6L, "Naruto", 29.50, 5));
        mangas.add(new Manga(3L, "Dragon ball z", 37.50, 0));
        mangas.add(new Manga(5L, "Demon Slayer", 09.50, 2));

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
