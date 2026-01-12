package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "jujutsu kaisen", 19.50));
        mangas.add(new Manga(6L, "Naruto", 29.50));
        mangas.add(new Manga(3L, "Dragon ball z", 37.50));
        mangas.add(new Manga(5L, "Demon Slayer", 09.50));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("'--------------------------------'");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator());

        System.out.println("'--------------------------------'");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
