package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("mateus");
        Consumidor consumidor2 = new Consumidor("vitor");

        Manga manga1 = new Manga(1L, "jujutsu kaisen", 19.50);
        Manga manga2 = new Manga(6L, "Naruto", 29.50);
        Manga manga3 = new Manga(3L, "Dragon ball z", 37.50);
        Manga manga4 = new Manga(5L, "Demon Slayer", 09.50);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }

    }
}
