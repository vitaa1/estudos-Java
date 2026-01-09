package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Naruto");
        mangas.add("Dragon ball z");
        mangas.add("Demon slayer");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(21.50);
        dinheiros.add(11.50);
        dinheiros.add(15.50);

        Collections.sort(mangas);

        for(String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
