package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.domain.Anime;
import maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to on instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("demon slayer", 2), new Anime("one Piece", 100), new Anime("jujutsu", 10)));
        animeList.sort(animeComparators::compareByEpisodiesNomStatic);
        System.out.println(animeList);
    }
}
