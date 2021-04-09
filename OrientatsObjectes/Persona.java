
public class Persona {

	// Atributs
	private String nom;
	private int edat;
	private String dni;
	private char sexe;
	private double pes;
	private double alssada;
	
    //Constructors
	
	//constructor amb el nom, edat
	// i sexe (la resta per defecte).
	public Persona(	String nomRebut, 
			int edatRebuda,
			char sexeRebut) {
		this(nomRebut, edatRebuda, sexeRebut, 80, 180); 
		// Sobrecarga
		
	}
	
	// constructor amb tots els
	// atributs com a par�metres excepte el DNI.
    public Persona(	String nomRebut, 
    				int edatRebuda,
    				char sexeRebut,
    				double pesRebut,
    				double alssadaRebuda) {
        this.nom  		= nomRebut;
        this.edat 		= edatRebuda;
        this.sexe 		= sexeRebut;
        this.pes    	= pesRebut;
        this.alssada	= alssadaRebuda;
    }
    
    // M�todes
    
    /* calcularIMC(): calcular� si la persona
     * est� en el seu pes ideal (kg/al�ada^2)
     * (pes en kg i al�ada en m). Si aquesta
     * f�rmula retorna un valor menor a 20,
     * la funci� retorna -1, si retorna un
     * n�mero entre 20 i 25 (ambd�s inclosos),
     * significa que est� en el seu pes ideal
     * i la funci� retornar� 0. Per �ltim si
     * retorna un valor m�s gran de 25,
     * significa que t� sobrep�s i retornar� 1.
     * Es recomana que s'utilitzin constants
     * per aix�.*/
    public int calcularIMC() {
    	double valorIMC = 0;
    	int valorARetornar = 1;
    	valorIMC = this.pes / Math.pow(this.alssada, 2);
    	if(valorIMC < 20) {
    		valorARetornar = -1;
    	} else {
    		if ((valorIMC < 25)) {
        		valorARetornar = 0;
        	}
    	}
    	return valorARetornar;
    }
}
