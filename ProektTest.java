package simeon;

import java.util.Arrays;
import java.util.ArrayList;

public class ProektTest {
	
	
	    public static void main(String[] args) {

	       
	        Magazin billa = new Magazin();
	        billa.name = "Billa";

	        Proizvoditel devin = new Proizvoditel();
	        devin.name = "Devin OOD";
	        Proizvoditel bankiq = new Proizvoditel();
	        bankiq.name = "Bankiq";
	      
	        Butilka b1 = new Butilka();
	        b1.dobaviProizvoditel(devin);
	        b1.vid = "Trapezna";
	        Butilka b2 = new Butilka();
	        b2.dobaviProizvoditel(bankiq);
	        b2.vid = "Mineralna";
	        
//	        devin.butilki = new ArrayList<Butilka>(Arrays.asList(b1));
//	        bankiq.butilki = new ArrayList<Butilka>(Arrays.asList(b2)); 
	        
	       
	        billa.butilki = new ArrayList<Butilka>(Arrays.asList(b1, b2)); 

	        System.out.println("Stock of: " + billa.name);
	        for (Butilka b : billa.butilki) {
	            System.out.println(b.vid + " " + b.proizvoditel.name + " s sustavki: " + b.sustavki);

	        }
	    }
	}
