package simeon;

import java.util.ArrayList;
import java.util.Arrays;

public class Butilka {
    
	String vid;
    Proizvoditel proizvoditel;
    ArrayList<Sustavka> sustavki;

    Butilka() {
    	  sustavki = new ArrayList<Sustavka>(Arrays.asList(
    	            new Sustavka("voda"),
    	            new Sustavka("zahar"),
    	            new Sustavka("sirop")));
    }
    void dobaviProizvoditel(Proizvoditel proizvoditel){
    	proizvoditel.butilki.add(this);
    	this.proizvoditel = proizvoditel;
    }
    
}
