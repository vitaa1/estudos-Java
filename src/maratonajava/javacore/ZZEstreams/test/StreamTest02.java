package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> newList = new ArrayList<>(List.of(
            new LightNovel("demon slayer", 1.99),
            new LightNovel("naruto", 3.99),
            new LightNovel("jujutsu", 1.59),
            new LightNovel("anath note", 4.00),
            new LightNovel("full metal", 2.99)
    ));

    public static void main(String[] args) {
        List<String> titles = newList.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
