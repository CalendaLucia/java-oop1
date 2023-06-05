package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    private int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getPrezzoConIva() {
        double prezzoIva = prezzo + (prezzo * iva / 100);
        DecimalFormat decimalFormat = new DecimalFormat("#.##€");
        return decimalFormat.format(prezzoIva);
    }

    public String getNomeEsteso() {
        return getPaddedCodice() + "-" + nome;
    }
    private String getPaddedCodice() {
        String codiceString = String.valueOf(codice);
        if (codiceString.length() < 8) {
            StringBuilder stringBuilder = new StringBuilder();
            int paddingLength = 8 - codiceString.length();
            for (int i = 0; i < paddingLength; i++) {
                stringBuilder.append("0");
            }
            stringBuilder.append(codiceString);
            return stringBuilder.toString();
        } else {
            return codiceString;
        }
    }
}