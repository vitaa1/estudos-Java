package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;
import maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> carros = List.of(new Car("green", 2020), new Car("red", 2018), new Car("yellow", 2015));

    public static void main(String[] args) {
        List<Car> greenCars = filter(carros, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9, 10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if(predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
