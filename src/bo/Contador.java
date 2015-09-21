package bo;

import java.util.LinkedList;
import java.util.List;

import ui.Observador;

public class Contador {

	private List<Observador> observadores;
	
	public Contador() {
		observadores = new LinkedList<Observador>();
	}
	
	public void registrar(Observador o) {
		observadores.add(o);
	}
	 
	public void desregistrar(Observador o) {
		observadores.remove(o);
	}
	
	public void contar() {
		int c = 0;
		while(true) {
			notificarCambioContador(c++);
			esperar();
		}
	}
	
	public void notificarCambioContador(int nuevoValor) {
		for(Observador o : observadores) {
			o.notificarCambioContador(nuevoValor);
		}
	}
	
	private void esperar() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
	}
	
}
