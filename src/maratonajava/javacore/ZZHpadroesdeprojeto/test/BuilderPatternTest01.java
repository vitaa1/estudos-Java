package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Vitor")
                .lastName("jose")
                .username("vita1")
                .email("vitor@dsdsdhusuduhsd")
                .build();

        System.out.println(build);
    }
}
