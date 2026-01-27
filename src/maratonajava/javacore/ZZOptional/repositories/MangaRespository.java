package maratonajava.javacore.ZZOptional.repositories;

import maratonajava.javacore.ZZOptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRespository {
    private static List<Manga> mangas = List.of(new Manga(1, "naruto", 3), new Manga(2, "demon slayer", 4));

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}


