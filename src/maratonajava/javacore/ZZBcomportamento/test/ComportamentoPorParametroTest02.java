package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;
import maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> carros = List.of(new Car("green", 2020), new Car("red", 2018), new Car("yellow", 2015));

    public static void main(String[] args) {
        List<Car> greenCars = filter(carros, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
    }

    private static List<Car> filter (List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
