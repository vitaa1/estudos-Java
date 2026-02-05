package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Category;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest07 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("demon slayer", 1.99, Category.FANTASY),
            new LightNovel("naruto", 3.99, Category.DRAMA),
            new LightNovel("jujutsu", 1.59, Category.ROMANCE),
            new LightNovel("anath note", 4.00, Category.DRAMA),
            new LightNovel("full metal", 2.99, Category.FANTASY)
    ));

    public static void main(String[] args) {

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory));
        System.out.println(collect);

        Map<Category, LightNovel> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect1);
    }
}
