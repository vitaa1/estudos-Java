package maratonajava.javacore.ZZFthreads.test;

import maratonajava.javacore.ZZFthreads.dominio.Members;
import maratonajava.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread vitor = new Thread(new EmailDeliveryService(members), "vitor");
        Thread thaci = new Thread(new EmailDeliveryService(members), "thaci");

        vitor.start();
        thaci.start();

        while(true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
