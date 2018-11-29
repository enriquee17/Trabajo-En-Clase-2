package Programacion.orientacionAObjetos.juegoOca;

public class Tablero {
	public  Casilla casillas[] = new Casilla [63];
	/*
	 * 
	 */
	public Tablero() {
		super();
		inicializaTablero();
	}
	
	public void inicializaTablero (){
		// Estructa b�sica del tablero
		
		casillas[0]=new Casilla(1, "Inicio", null, 0, "");
		casillas[1]=new Casilla(2, "Caballo", null, 0, "");
		casillas[2]=new Casilla(3, "Pez", null, 0, "");
		casillas[3]=new Casilla(4, "Payaso", null, 0, "");
		casillas[4]=new Casilla(5, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[5]=new Casilla(6, "Puente", null, 0, "De puente a puente y tiro porque me da la corriente");
		casillas[6]=new Casilla(7, "Tortuga", null, 0, "");
		casillas[7]=new Casilla(8, "Silla", null, 0, "");
		casillas[8]=new Casilla(9, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[9]=new Casilla(10, "Raton", null, 0, "");
		casillas[10]=new Casilla(11, "Rana", null, 0, "");
		casillas[11]=new Casilla(12, "Puente", null, 0, "De puente a puente y tiro porque me da la corriente");
		casillas[12]=new Casilla(13, "Pollo", null, 0, "");
		casillas[13]=new Casilla(14, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[14]=new Casilla(15, "Helado", null, 0, "");
		casillas[15]=new Casilla(16, "Oso", null, 0, "");
		casillas[16]=new Casilla(17, "Bebé", null, 0, "");
		casillas[17]=new Casilla(18, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[18]=new Casilla(19, "Posada", null, 0, "");
		casillas[19]=new Casilla(20, "Cohete", null, 0, "");
		casillas[20]=new Casilla(21, "Tarta", null, 0, "");
		casillas[21]=new Casilla(22, "Casa", null, 0, "");
		casillas[22]=new Casilla(23, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[23]=new Casilla(24, "Florero", null, 0, "");
		casillas[24]=new Casilla(25, "León", null, 0, "");
		casillas[25]=new Casilla(26, "Dados", null, 0, "");
		casillas[26]=new Casilla(27, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[27]=new Casilla(28, "Bicicleta", null, 0, "");
		casillas[28]=new Casilla(29, "Delfín", null, 0, "");
		casillas[29]=new Casilla(30, "Dinosaurio", null, 0, "");
		casillas[30]=new Casilla(31, "Pozo", null, 0, "");
		casillas[31]=new Casilla(32, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[32]=new Casilla(33, "Mariposa", null, 0, "");
		casillas[33]=new Casilla(34, "Moto", null, 0, "");
		casillas[34]=new Casilla(35, "Peluche", null, 0, "");
		casillas[35]=new Casilla(36, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[36]=new Casilla(37, "Elefante", null, 0, "");
		casillas[37]=new Casilla(38, "Ciervo", null, 0, "");
		casillas[38]=new Casilla(39, "Conejo", null, 0, "");
		casillas[39]=new Casilla(40, "Frutas", null, 0, "");
		casillas[40]=new Casilla(41, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[41]=new Casilla(42, "Laberinto", null, 0, "");
		casillas[42]=new Casilla(43, "Jarrón", null, 0, "");
		casillas[43]=new Casilla(44, "Paraguas", null, 0, "");
		casillas[44]=new Casilla(45, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[45]=new Casilla(46, "Conejo", null, 0, "");
		casillas[46]=new Casilla(47, "Muñeco de nieve", null, 0, "");
		casillas[47]=new Casilla(48, "Mariposa", null, 0, "");
		casillas[48]=new Casilla(49, "Tren", null, 0, "");
		casillas[49]=new Casilla(50, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[50]=new Casilla(51, "Pajaro", null, 0, "");
		casillas[51]=new Casilla(52, "Carcel", null, 0, "");
		casillas[52]=new Casilla(53, "Dados", null, 0, "");
		casillas[53]=new Casilla(54, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[54]=new Casilla(55, "Arbol", null, 0, "");
		casillas[55]=new Casilla(56, "Tiburon", null, 0, "");
		casillas[56]=new Casilla(57, "Perro", null, 0, "");
		casillas[57]=new Casilla(58, "Muerte", null, 0, "Has muerto");
		casillas[58]=new Casilla(59, "Oca", null, 0, "De oca a oca y tiro porque me toca");
		casillas[59]=new Casilla(60, "Mariposa", null, 0, "");
		casillas[60]=new Casilla(61, "Demoni", null, 0, "");
		casillas[61]=new Casilla(62, "Regador", null, 0, "");
		casillas[62]=new Casilla(63, "Oca", null, 0, "¡Has ganado!");
	
		
		
		// Destinos de las casillas especiales
		casillas[4].setDestino(casillas[8]); // Oca
		casillas[5].setDestino(casillas[11]); // Puente
		casillas[11].setDestino(casillas[5]); // Puente
		casillas[8].setDestino(casillas[13]);// Oca
		casillas[13].setDestino(casillas[17]);// Oca
		casillas[17].setDestino(casillas[22]);// Oca
		casillas[22].setDestino(casillas[26]);// Oca
		casillas[25].setDestino(casillas[52]);// Dado
		casillas[52].setDestino(casillas[25]);// Dado
		casillas[26].setDestino(casillas[31]);// Oca
		casillas[31].setDestino(casillas[35]);// Oca 
		casillas[35].setDestino(casillas[40]);// Oca 
		casillas[40].setDestino(casillas[44]);// Oca 
		casillas[41].setDestino(casillas[29]);// Laberinto 
		casillas[44].setDestino(casillas[49]);// Oca 
		casillas[49].setDestino(casillas[53]);// Oca 
		casillas[53].setDestino(casillas[58]);// Oca 
		casillas[57].setDestino(casillas[0]);// Muerte 
		casillas[58].setDestino(casillas[62]);// Oca 	
				
		
	}
	public void imprimeTablero () {
		//Imprimir el tablero
		for (int i = 0; i < casillas.length; i++) {
			System.out.println(casillas[i].getOrden() + " - " + casillas[i].getNombre());
		
			}
		}

	
		


}
