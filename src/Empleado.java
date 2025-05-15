

public class Empleado extends Usuario {

	protected String nombre;
	protected String apellido;
	
	
	public Empleado(int id, String nombreUsuario, String contraseña, int rol, String nombre, String apellido) {
		super(id, nombreUsuario, contraseña, rol);
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	} 

//	
	
	
	
}
