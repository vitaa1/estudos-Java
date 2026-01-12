package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "jujutsu kaisen", 19.50));
        mangas.add(new Manga(6L, "Naruto", 29.50));
        mangas.add(new Manga(3L, "Dragon ball z", 37.50));
        mangas.add(new Manga(5L, "Demon Slayer", 09.50));

        //Collections.sort(mangas);

        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(5L, "Demon Slayer", 09.50);
        System.out.println(Collections.binarySearch(mangas,mangaSearch, mangaByIdComparator));

    }
}
