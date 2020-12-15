package Recreativa_Objetos;

import java.util.Scanner;

public class Principal {
	public static int PintaMenu() {
		Scanner leer = new Scanner(System.in);
		int menu;
		System.out.println("para salir pulse : 0");
		System.out.println("para añadir un juego pulse : 1");
		System.out.println("para poner puntuacion a un juego pulse : 2");
		System.out.println("para mostrar todos los juegos pulse : 3");
		System.out.println("¿Que desea hacer?");
		menu = leer.nextInt();
		return menu;
		
	}
	
	public static void GuardarJuego(Juego vJuegos[]) {

			for (int i = 0; i < vJuegos.length; i++) {
				if (vJuegos[i] == null) {
					vJuegos[i] = new Juego("Skyrim");
					break;
				}
			}
		
	}
	
	public static void PonerPuntuacionJuego(Juego vJuegos[]) {
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < vJuegos.length; i++) {	
		System.out.println("dime el nombre del juego que quieres cambiar la puntuacion");
		String nombre = leer.next();
			if (nombre == vJuegos[i].getNombre()) {
				vJuegos[i].setRecord(3);

				}
			}
		}
	public static void main(String[] args) {
		Juego vJuegos[] = new Juego[100];
	
		vJuegos[0] = new Juego("CiberPunk");
		vJuegos[1] = new Juego("R6");
		vJuegos[2] = new Juego("LOL");
		vJuegos[3] = new Juego("Dark Souls III");
		
		vJuegos[1].setMultijugador(true);
		vJuegos[1].setRecord(5);
		PintaMenu();
		while (PintaMenu() != 0) {
			if (PintaMenu() <= 3 && PintaMenu() >= 1) {
				switch (PintaMenu()) {
					case 1: {
						GuardarJuego(vJuegos);
						PintaMenu();
					}
					case 2: {
						PonerPuntuacionJuego(vJuegos);
						PintaMenu();
					}
					case 3: {
						for (int i = 0; i < vJuegos.length; i++) {
							if (vJuegos[i] != null)
								System.out.println(vJuegos[i].toString());
						}
						PintaMenu();
					}
				}
		} else {
			System.out.println("ERROR esa opcion no es valida");
		}
		
	}

}
	}
