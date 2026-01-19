package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Barco;
import maratonajava.javacore.Zgenerics.domain.Carro;
import maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"), new Carro("mercedes")));

        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("lancha"), new Barco("iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes...");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("'---------------------'");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mes....");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
