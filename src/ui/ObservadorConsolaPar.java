package ui;

public class ObservadorConsolaPar implements Observador {

	@Override
	public void notificarCambioContador(int nuevoValor) {
		if(nuevoValor % 2 == 0) {
			System.out.println(nuevoValor + " es Par");
		}
	}
	
}
