package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		//Dichiarazione e inizializzazione lista invitati
		String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		//Dichiarazione stringa per la ricerca del nome
		String nomeDaControllare;
		//Dichiarazione e inizializzazione della variabile booleana per la ricerca
		boolean trovato = false;
		//Dichiarazione variabile scelta che serve a riusare il codice più volte
		String scelta;
		//Dichiarazione dello scanner per prendere in input il nome da ricercare
		Scanner scan = new Scanner(System.in);
		
		do {	
			//Inizializzazione variabile nome per la ricerca
			System.out.print("Inserisci il tuo nome: ");
			nomeDaControllare = scan.nextLine();
			//Ciclo di controllo per la ricerca del nome, con eventuale cambio di valore della flag trovato qualora il nome inserito fosse sulla lista
			for(int i = 0; i < listaInvitati.length; i++) {
				
				if(nomeDaControllare.equalsIgnoreCase(listaInvitati[i])) 
					trovato = true;
			
			}
			//Stampa risultato in base al valore della flag "trovato"
			if(trovato)
				System.out.println("Il tuo nome è sulla lista, puoi entrare.");
			else
				System.out.println("Il tuo nome non è sulla lista, non puoi entrare.");
			//Inizializzazione variabile scelta con eventuale risultato
			do {
			
				System.out.println("Vuoi ripetere il codice? ");
				scelta = scan.nextLine();
			
				if(!scelta.equalsIgnoreCase("si") && !scelta.equalsIgnoreCase("no"))
					System.out.print("Inscerisci Si o No.");
			
			}while(!scelta.equalsIgnoreCase("si") && !scelta.equalsIgnoreCase("no"));
		
		}while(scelta.equalsIgnoreCase("si"));
		
		scan.close();
		
	}
	
}