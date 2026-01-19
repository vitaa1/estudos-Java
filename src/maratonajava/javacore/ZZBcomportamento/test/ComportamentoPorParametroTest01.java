package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> carros = List.of(new Car("green", 2020), new Car("red", 2018), new Car("yellow", 2015));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(carros));
        System.out.println(filterRedCar(carros));
        System.out.println(filterByColor(carros, "yellow"));
        System.out.println("'---------------------------'");
        System.out.println(filterByYearBefore(carros, 2025));
    }

    private static List<Car> filterGreenCar (List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("green")) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterRedCar (List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("red")) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByColor (List<Car> cars, String cor) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByYearBefore (List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
