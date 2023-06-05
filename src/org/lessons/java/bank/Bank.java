package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita il tuo nome: ");
        String nomeUtente = scanner.nextLine();
        Conto conto = new Conto(nomeUtente);

        System.out.println("Ciao ".toUpperCase() + conto.getNomeCorrentista());
        System.out.println("Numero conto ".toUpperCase() + conto.getNumeroConto() + " Saldo " + conto.getSaldo() + "€");

        int scelta;
        do {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Versare");
            System.out.println("2. Prelevare");
            System.out.println("3. Esci");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    // Operazione di versamento
                    System.out.println("Hai scelto di versare.");
                    System.out.print("Quanto vuoi versare?");
                    double versamento = scanner.nextDouble();

                    String saldoAggiornato = conto.versaSomma(versamento);
                    System.out.println("Saldo aggiornato: " + saldoAggiornato);
                    break;
                case 2:
                    // Operazione di prelievo
                    System.out.println("Hai scelto di prelevare.");
                    System.out.print("Quanto vuoi prelevare?");
                    double preleva = scanner.nextDouble();

                    if (preleva > conto.getSaldo()) {
                        System.out.println("Saldo insufficiente. Riprova.");
                    } else {
                        saldoAggiornato = conto.prelevaSomma(preleva);
                        System.out.println("Saldo aggiornato: " + saldoAggiornato);
                    }
                    break;
                case 3:
                    // Esci dal sistema
                    System.out.println("Arrivederci e grazie!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }

        } while (scelta != 3);

        scanner.close();
    }
}
