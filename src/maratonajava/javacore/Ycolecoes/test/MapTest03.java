package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("mateus");
        Consumidor consumidor2 = new Consumidor("vitor");

        Manga manga1 = new Manga(1L, "jujutsu kaisen", 19.50);
        Manga manga2 = new Manga(6L, "Naruto", 29.50);
        Manga manga3 = new Manga(3L, "Dragon ball z", 37.50);
        Manga manga4 = new Manga(5L, "Demon Slayer", 09.50);
        Manga manga5 = new Manga(6L, "death note", 79.50);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("'------'" + entry.getKey().getNome());

            for (Manga manga : entry.getValue()) {
                System.out.println("'--------'" + manga.getNome());
            }
        }

    }
}
