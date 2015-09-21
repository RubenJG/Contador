package main;

import ui.ObservadorConsolaImpar;
import ui.ObservadorConsolaPar;
import ui.ObservadorVentana;
import bo.Contador;

public class Main {

	public static void main(String[] args) {
		
		Contador c = new Contador();
		
		c.registrar(new ObservadorConsolaPar());
		c.registrar(new ObservadorConsolaImpar());
		c.registrar(new ObservadorVentana());
		
		c.contar();
		
	}

}
