
public class ProgramaDausParxis {

	public static void main(String[] args) {
		
		DausParxis dausPerJugarParxis = new DausParxis();
		int jugades = 5;
		
		for (int i = 0; i < jugades; i++) {
			System.out.println("Tirada " 
					+ i + " de " + jugades 
					+ " la tirada �s = " + dausPerJugarParxis.getTirada()
					+ " la tirada dau 1 �s = " + dausPerJugarParxis.getTiradaDau1()
					+ " la tirada dau 2 �s = " + dausPerJugarParxis.getTiradaDau2()
					+ " �s cinc = " + dausPerJugarParxis.esCinc()
					+ " �s doble = " + dausPerJugarParxis.doble() );
			dausPerJugarParxis.llensar();
		}

	}

}
