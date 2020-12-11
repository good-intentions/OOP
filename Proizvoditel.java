package simeon;

import java.util.ArrayList;

public class Proizvoditel {

	    String name;
	    ArrayList<Butilka> butilki;
	    
	    void dobavibutilka(Butilka butilka){
	    	this.butilki.add(butilka);
	    	butilka.proizvoditel = this;
	    	}
	}