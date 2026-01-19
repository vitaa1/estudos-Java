package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;
import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "nokia");
        set.add(smartphone);
        System.out.println(set);
        System.out.println("'-------------------------------------------------'");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L, "jujutsu kaisen", 19.50, 2));
        mangas.add(new Manga(6L, "Naruto", 2.50, 3));
        mangas.add(new Manga(3L, "Dragon ball z", 37.50, 8));
        mangas.add(new Manga(5L, "Demon Slayer", 3.50, 4));
        mangas.add(new Manga(10L, "Aemon Slayer", 09.50, 9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga berserk = new Manga(1L, "kakasur", 3.00, 5);

        // Metodos para comparação

        // lower - o que é imediatamente menor <
        //floor - tras o mesmo valor que voce esta passando, o mesmo elemento ou se n existir, o abaixo dele <=
        // higher - o primeiro maior >
        // ceiling - leva em consideracao o valor que voce ta passando

        System.out.println("'----------------------------------'");
        System.out.println(mangas.lower(berserk));
        System.out.println(mangas.floor(berserk));
        System.out.println(mangas.higher(berserk));
        System.out.println(mangas.ceiling(berserk));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
