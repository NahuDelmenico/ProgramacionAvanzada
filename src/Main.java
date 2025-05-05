import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		Empleado empleado = new Empleado(0, "empleado", "", false);
		Administrador admin = new Administrador(0, "admin", "", true);
		
		Usuario.getAdministrador().add(admin);
		Usuario.getEmpleados().add(empleado);
		
		
		String[] menuPrincipal = {"Iniciar Sesion","Salir"};
		
		
		boolean conectado = true; 
		
		while(conectado == true) {
		
			int a  = JOptionPane.showOptionDialog(null, "Bienvenido", null, 0, 0, null, menuPrincipal, menuPrincipal[0]);
			if (a == 1 ) {
				conectado = false; 
			}else {
				
				
				String nombre = JOptionPane.showInputDialog("Ingrese su usuario");
				String contra = JOptionPane.showInputDialog("Ingrese su contrasena");
				
				Usuario usuarioLogeado; 
				usuarioLogeado = Usuario.login(nombre, contra);
				
				if(usuarioLogeado.login(nombre, contra)==null) {
					JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
				}else {
					
					boolean log = true;
					while(log == true) {
						
						 String[] menuOpciones = {"Clientes", "Productos", "Ventas", "Categorías", "Usuarios", "Salir"};
						 String[] subMenuOpciones = {"Agregar","Editar","Eliminar","Consultar", "Volver al menu"};   
					        
					        int m=JOptionPane.showOptionDialog(null, "Seleccione el modulo", contra, a, a, null, menuOpciones, menuOpciones[0]);
					        
					        switch (m) {
			                case 0:
			                    JOptionPane.showMessageDialog(null, "Clientes");
			                    Menu.subMenu(subMenuOpciones, "Clientes");
			                    break;
			                case 1:
			                    JOptionPane.showMessageDialog(null, "Productos");
			                    Menu.subMenu(subMenuOpciones, "Productos");
			                    break;
			                case 2:
			                    JOptionPane.showMessageDialog(null, "Ventas");
			                    Menu.subMenu(subMenuOpciones, "Ventas");
			                    break;
			                case 3:
			                    JOptionPane.showMessageDialog(null, "Categorías");
			                    Menu.subMenu(subMenuOpciones, "Categorias");
			                    break;
			                case 4:
			                	if (usuarioLogeado.isRol()==true) {
			                		JOptionPane.showMessageDialog(null, "Usuarios");
				                    Menu.subMenu(subMenuOpciones, "Usuarios");
								}else {
									JOptionPane.showMessageDialog(null, "No tienes los permisos para acceder al modulo");
								}
			                    
			                    break;
			                case 5:
			                
			                	log = false;
			                    break;
			            }
					}//while menu principal
					
				}//if verificacion login
				
				
				
				
			}//if login
		
		
		
		
		}//while conectado
		

	}

}
