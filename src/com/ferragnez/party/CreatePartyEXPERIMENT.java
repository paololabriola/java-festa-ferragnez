package com.ferragnez.party;

import java.util.Scanner;

public class CreatePartyEXPERIMENT {

	public static void main(String[] args) {
		
		String conferma, nomeParty, nomeOspite;
		
		Scanner scan = new Scanner(System.in);
		
		int contatore, numeroInvitati = 0;	
			
		do {
			
			System.out.print("Inserisci il nome del party che vuoi creare: ");
			nomeParty = scan.nextLine();
			
			do {
			
				System.out.print("Confermi che il nome del party che vuoi creare è " + nomeParty + "? ");
				conferma = scan.nextLine();
			
				if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
				System.out.println("Rispondi solo Si o No.");
			
			}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
		
		}while(conferma.equalsIgnoreCase("no"));
		
		do {
			
			System.out.print("Inserisci il numero di invitati al tuo party: ");
			numeroInvitati = scan.nextInt();
			
			if(numeroInvitati <= 0)
				System.out.println("Il numero degli invitati non può essere 0 o un numero negativo! Riprova.");
		
		}while(numeroInvitati <= 0);
		
		String[] listaInvitati = new String[numeroInvitati];
		
		System.out.println("Inserisca i nomi degli invitati al party: ");
		
		for(contatore = 0; contatore < numeroInvitati; contatore++) {
			
			do {
				
				listaInvitati[contatore] = scan.nextLine();
				
				do {
			
					System.out.print("Confermi che vuoi invitare " + listaInvitati[contatore] + " al party? ");
					conferma = scan.nextLine();
					
					if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
						System.out.println("Rispondi solo Si o No.");
				
				}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
			
			}while(conferma.equalsIgnoreCase("no"));
			
		}
		
		System.out.println("Gli invitati al party sono: ");
		
		for(contatore = 0; contatore < numeroInvitati; contatore++) {
			
			System.out.println(" " + listaInvitati[contatore]);
			
		}
		
		do {
			
				boolean invitato = false;
				
			do {
			
				System.out.println("Inserisca il nome dell'ospite per controllare sia presente sulla lista: ");
				nomeOspite = scan.nextLine();
			
				do {
			
					System.out.println("Confermi che il nome dell'ospite è " + nomeOspite + "?");
					conferma = scan.nextLine();
				
					if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
						System.out.println("Rispondi solo Si o No.");
			
				}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
		
			}while(conferma.equalsIgnoreCase("no"));
		
			for(contatore = 0; contatore < numeroInvitati; contatore++) {
			
				if(nomeOspite.equalsIgnoreCase(listaInvitati[contatore])) 
					invitato = true;
			
			}
		
			if(invitato)
				System.out.println("Il suo nome è sulla lista, benvenuto a " + nomeParty + " ci auguriamo possa passare una bella serata.");
			else
				System.out.println("Il suo nome non è presente sulla lista, ci dispiace ma lei non risulta invitato/a al " + nomeParty + " non possiamo farla entrare, arrivederci.");
		
			do {
			
				System.out.println("C'è un nuovo ospite da controllare? ");
				conferma = scan.nextLine();
		
				if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
					System.out.print("Inscerisci Si o No.");
		
			}while(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"));
	
		}while(conferma.equalsIgnoreCase("si"));
		
		scan.close();
		
	}
	
}