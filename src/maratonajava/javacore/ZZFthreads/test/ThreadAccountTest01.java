package maratonajava.javacore.ZZFthreads.test;

import maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Vitor");
        Thread t2 = new Thread(threadAccountTest01, "Thaci");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance() < 0) {
                System.out.println("Lascou");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        if(account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta" + account.getBalance());
        }else {
            System.out.println("Sem dinheiro para" + getThreadName() + " efeturar o saque" + account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

}
