package ui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObservadorVentana extends JFrame implements Observador {

	private static final long serialVersionUID = -6051277566439583215L;
	
	private JLabel label;
	
	public ObservadorVentana() {

		this.setSize(100, 100);

		this.label = new JLabel();
		this.label.setFont(new Font("Sans Serif", Font.BOLD, 58));
		
		this.add(label);
		
		this.setVisible(true);
	}

	@Override
	public void notificarCambioContador(int nuevoValor) {
		label.setText("" + nuevoValor);
	}
	
}
