package Jana60travel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
			
		Scanner scan = new Scanner(System.in);
		
		
		try {
		System.out.print("Inserire la destinazione: ");
		String des= scan.nextLine();
		System.out.println("Inserisci data di inzio viaggio");
		
		System.out.print("Inserisci anno: ");
		int a = scan.nextInt();
		System.out.print("Inserisci mese: ");
		int m = scan.nextInt();
		System.out.print("Inserisci giorno: ");
		int g = scan.nextInt();
		
		
		
		System.out.println("Inserisci ora la data di fine");
		
		System.out.print("Inserisci anno: ");
		int afine = scan.nextInt();
		System.out.print("Inserisci mese: ");
		int mfine = scan.nextInt();
		System.out.print("Inserisci giorno: ");
		int gfine = scan.nextInt();
		
		
		Vacanza vacanza = new Vacanza(des, a, m, g, afine, mfine, gfine);
		
		System.out.println(vacanza.Messaggio());

		}  catch (Exception e) {
		      System.out.println("Impossibile completare la registrazione");
		      System.out.println(e.getMessage()); 
		}
		
		
		
		
		
		
		
		
		
	}

}
