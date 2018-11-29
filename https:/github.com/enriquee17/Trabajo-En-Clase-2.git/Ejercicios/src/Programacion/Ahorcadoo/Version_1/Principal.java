package Programacion.Ahorcadoo.Version_1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		String  palabras [] = new String [] {"Perro", "Gato", "Raton"};
		
		String palabra = palabras[(int)Math.round(Math.random()*(palabras.length-1))];
		System.out.println("La palabra es: "+palabra);
		
		//String palabraOculta = palabra;
		char coincidencia [] = new char [palabra.length()];
		
		for (int i = 0; i < coincidencia.length; i++) {
			coincidencia[i] = '_';
			System.out.print(coincidencia[i]+" ");
			
			
		
		}
		int contFallos=0;
		do {
			String introduceUsuario = JOptionPane.showInputDialog("Introduce un caracter o una palabra");
			
				
					
				if (introduceUsuario.length()==1) {
					for (int i = 0; i < coincidencia.length; i++) {
						coincidencia[i] = '_';
						System.out.println();
						System.out.print(coincidencia[i]+" ");
					}
				}
				else {
					if (introduceUsuario.equals(palabra)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena, ha acertado la palabra");
						System.exit(0);
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Se ha equivocado, intentelo de nuevo");
						contFallos++;
						 }
					}
		      
		}while(!(contFallos == 2));
	}	


}
