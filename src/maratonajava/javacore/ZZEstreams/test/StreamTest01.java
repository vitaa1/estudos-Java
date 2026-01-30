package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {

    private static List<LightNovel> newList = new ArrayList<>(List.of(
            new LightNovel("demon slayer", 1.99),
            new LightNovel("naruto", 3.99),
            new LightNovel("jujutsu", 1.59),
            new LightNovel("anath note", 4.00),
            new LightNovel("full metal", 2.99)
    ));
    public static void main(String[] args) {
        newList.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : newList) {
            if(lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >= 3) {
                break;
            }
        }
        System.out.println(newList);
        System.out.println(titles);
    }
}
