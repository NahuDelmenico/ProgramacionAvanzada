import javax.swing.JOptionPane;

public class Menu {


	public static int subMenu(String[] opciones, String modulo) {
		
		int a = JOptionPane.showOptionDialog(null, "Modulo de" + modulo, null, 0, 0, null, opciones, opciones[0]);
		
		return a;
	}

	
}