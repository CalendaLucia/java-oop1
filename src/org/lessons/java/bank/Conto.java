package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
   private int numeroConto;
   private String nomeCorrentista;
   private double saldo;

   public Conto (String nomeCorrentista) {
       this.numeroConto = randomNumeroConto();
       this.nomeCorrentista = nomeCorrentista;
       this.saldo = saldoZero();
   }

   private int randomNumeroConto() {
       Random random = new Random();
       return random.nextInt(1000) + 1;
   }

   private double saldoZero() {
       saldo = 0;
       return saldo;
   }

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getNomeCorrentista() {
       return nomeCorrentista.toUpperCase();
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

//    METODI
protected String versaSomma(double versamento) {
       double somma = saldo + versamento;
       DecimalFormat decimalFormat = new DecimalFormat("#.##€");
       saldo = somma;
       return decimalFormat.format(somma);

}

    protected String prelevaSomma(double preleva) {
        double sottrai = saldo - preleva;
        DecimalFormat decimalFormat = new DecimalFormat("#.##€");
        saldo = sottrai;
        return decimalFormat.format(sottrai);

    }

}
