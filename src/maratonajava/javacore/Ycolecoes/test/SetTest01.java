package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "jujutsu kaisen", 19.50, 0));
        mangas.add(new Manga(6L, "Naruto", 29.50, 5));
        mangas.add(new Manga(3L, "Dragon ball z", 37.50, 0));
        mangas.add(new Manga(5L, "Demon Slayer", 09.50, 2));

        for(Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
