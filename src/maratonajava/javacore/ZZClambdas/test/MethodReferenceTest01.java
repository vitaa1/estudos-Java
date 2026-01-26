package maratonajava.javacore.ZZClambdas.test;

import maratonajava.javacore.ZZClambdas.test.domain.Anime;
import maratonajava.javacore.ZZClambdas.test.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("demon slayer", 2), new Anime("one Piece", 100), new Anime("jujutsu", 10)));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodies);
        System.out.println(animeList);
    }
}
