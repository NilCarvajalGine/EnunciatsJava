import java.util.Scanner;

/*
 * Crea un array de Password's amb 
 * la mida que tu li indiquis per teclat.
 * Indica tamb� per teclat la longitud dels Passwords.
 * Crea un bucle que cre� un objecte per a cada posici�
 * de l'array amb les dades introdu�des anteriorment.
 * Mostrar per a cada objecte de l'array de Passwords
 * si aquest �s fort o no. Pots fer servir el seg�ent format:
 * 		contrasenya1 valor S�
 * 		contrasenya2 valor NO

*/
public class ProgramaPassword {
	
	public static Scanner teclat = new Scanner(System.in);
	
	public static void main(String[] args) {
	      System.out.print ("Entra la quantitat de passwords: "); // mida array
	      int midaArray= teclat.nextInt();
	      
	      Password llistaDePasswords[] = new Password[midaArray];
	     
	      System.out.print ("Entra la longitud del password: ");
	      int longitudPassword = teclat.nextInt();
	      
	      for (int i=0; i<llistaDePasswords.length; i++ ) {

		      llistaDePasswords[i] = new Password(longitudPassword);
	      }
	      
	      for (int i=0; i<llistaDePasswords.length; i++ ) {
	    	  String textEsFort = " NO";
	    	  boolean esFortTemp = llistaDePasswords[i].esFort();
	    	  if (esFortTemp == true) {
	    		  textEsFort = "";
	    	  }
		      System.out.println ("El password "
	    		  	+ llistaDePasswords[i].getContrasenya()
	    		  	+ textEsFort
	    		  	+ " �s fort!");
	      }


	}

}
