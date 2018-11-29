package Programacion.Ahorcadoo.Version_1;

import javax.swing.JOptionPane;


public class Principal1 {

	public static void main(String[] args) {
		
		boolean acierto=false;
		String  palabras [] = new String [] {"Perro", "Gato", "Raton"};
		
		String palabra = palabras[(int)Math.round(Math.random()*(palabras.length-1))];
		System.out.println("La palabra es: "+palabra);
		
		//String palabraOculta = palabra;
		char coincidencia [] = new char [palabra.length()];
		int contFallos=0;
		for (int i = 0; i < coincidencia.length; i++) {
			coincidencia[i] = '_';
			System.out.print(coincidencia[i]+" ");
			
			
		
		}
		String introduceUsuario;
		do {
			acierto=false;
			 introduceUsuario = JOptionPane.showInputDialog("Introduce un caracter o una palabra");
			
				
					
				if (introduceUsuario.length()==1) {
					 System.out.println();
					for (int i = 0; i < palabra.length(); i++) {
						 char charUsuario = introduceUsuario.charAt(0);
						 char palabra1 = palabra.charAt(i);
						 if (charUsuario == palabra1) {
							 coincidencia[i]=charUsuario;
							 acierto=true;
							 for (int j = 0; j < palabra.length(); j++) {
								 System.out.print(coincidencia[i]+" ");
							 }
						 } 
						
						 
						 
					}
					
					if (acierto==false) {
						
						contFallos++;
						
					}
				}
				else {
					if (introduceUsuario.equals(palabra)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena, ha acertado la palabra");
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Se ha equivocado, intentelo de nuevo");
						contFallos++;
						 }
					}
		      
		}while(!((introduceUsuario.equals(palabra))||(contFallos == 2)));
	}	


}
