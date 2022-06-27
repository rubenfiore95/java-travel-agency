package Jana60travel;

import java.time.LocalDate;
import java.time.Year;

public class Vacanza {

	public String destinazione;
	public int giorno, mese, anno, gg, mm, yyyy;
    LocalDate inizio, fine, diff;
	
	public Vacanza(String destinazione, int anno, int mese, int giorno, int yyyy, int mm, int gg) throws Exception {
		
       if (giorno > 31 || giorno < 1){
			
			throw new Exception ("Giorno non valido.");
		
		}
		
		if (mese > 12 || mese < 1 ){
			
			throw new Exception ("Mese non valido");
		}
		
        if (anno < Year.now().getValue()){
			
			throw new Exception ("L'anno non puo' essere inferiore a quello attuale");
		}
		
		this.destinazione=destinazione;
		this.giorno=giorno;
		this.mese=mese;
		this.anno=anno;
		this.gg=gg;
		this.mm=mm;
		this.yyyy=yyyy;
		
		inizio = LocalDate.of(anno, mese, giorno);
		fine = LocalDate.of(yyyy, mm, gg);
		
		
		start();
		end();
	
		
	}
	

	public void start() throws Exception {
		
		if(inizio.equals(null))
			throw new Exception("La data iniziale deve necessariamente completata.");
		
		if(inizio.isBefore(LocalDate.now()))
			throw new Exception("La data di inizio non puo' essere precedente a quella attuale");
		}
	
    public void end() throws Exception {
		
		if(fine.equals(null))
			throw new Exception("La data finale deve necessariamente completata.");
		
		if(fine.isBefore(inizio))
			throw new Exception("La data di fine deve essere successiva a quella di inizio.");
    }
    
  
    
    public String Messaggio(){
    	
    	 return "Hai prenotato una vacanza per: "+ destinazione + "\ndella durata di: "+ (yyyy-anno) + " anni " +(mm-mese)+ " mesi " + (gg-giorno)+ " giorni" + " \ndal: \n"+ inizio + "\nal: \n"+ fine ;
    }
}
