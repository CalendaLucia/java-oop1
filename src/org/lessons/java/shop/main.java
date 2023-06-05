package org.lessons.java.shop;

public class main {
    public static void main(String[] args) {

        Prodotto prodotto = new Prodotto("Prodotto 1", "Descrizione 1", 19.99, 22);

        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("IVA: " + prodotto.getIva());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
        System.out.println("Nome Esteso: " + prodotto.getNomeEsteso());
    }
}
