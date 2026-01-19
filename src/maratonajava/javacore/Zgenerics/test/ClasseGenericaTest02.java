package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Barco;
import maratonajava.javacore.Zgenerics.domain.Carro;
import maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
