import java.util.ArrayList;

public class sinComparator {

	public static void main(String[] args) {
		ArrayList<String> milista = new ArrayList<>();
		
		milista.add("Plutón");
		milista.add("Julio");
		milista.add("Marte");
		milista.add("Jupiter");
		milista.add("Ceres");
				
		milista.sort(null);
		imprimePlanetas(milista);
		
	}
	
	public static void imprimePlanetas(ArrayList<String> lista){
		for(String planeta : lista)
			System.out.println(planeta);
	}


}
   

/*
IMPRIME EN CONSOLA: 
Ceres
Julio
Jupiter
Marte
Plutón
*/