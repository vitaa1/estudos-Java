package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> newList = new ArrayList<>(List.of(
            new LightNovel("demon slayer", 1.99),
            new LightNovel("naruto", 3.99),
            new LightNovel("jujutsu", 1.59),
            new LightNovel("anath note", 4.00),
            new LightNovel("full metal", 2.99)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = newList.stream();
        newList.forEach(System.out::println);

        long count = stream.distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}
