package maratonajava.javacore.ZZClambdas.service;

import maratonajava.javacore.ZZClambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodies(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }

    public int compareByEpisodiesNomStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
}
