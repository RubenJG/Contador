package ui;

public class ObservadorConsolaImpar implements Observador {

	@Override
	public void notificarCambioContador(int nuevoValor) {
		if(nuevoValor % 2 == 1) {
			System.out.println(nuevoValor + " es Impar");
		}
	}

}
