package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest06 {
    //parte de sumarizacao

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("demon slayer", 1.99),
            new LightNovel("naruto", 3.99),
            new LightNovel("jujutsu", 1.59),
            new LightNovel("anath note", 4.00),
            new LightNovel("full metal", 2.99)
    ));

    public static void main(String[] args) {
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String string = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(string);
    }
}
