package maratonajava.javacore.ZZOptional.test;

import maratonajava.javacore.ZZOptional.dominio.Manga;
import maratonajava.javacore.ZZOptional.repositories.MangaRespository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRespository.findByTitle("naruto");
        mangaByTitle.ifPresent(m -> m.setTitle("naruto2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRespository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRespository.findByTitle("one piece")
                .orElseGet(() -> new Manga(5, "one piece", 1000));

        System.out.println(newManga);
    }
}
