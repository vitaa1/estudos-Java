package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("demon slayer", 2), new Anime("one Piece", 100), new Anime("jujutsu", 10)));
        animeList.sort(animeComparators::compareByEpisodiesNomStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodies) -> new Anime(title, episodies);
        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;
        System.out.println(animeBiFunction1.apply("dbz", 20));

    }
}
