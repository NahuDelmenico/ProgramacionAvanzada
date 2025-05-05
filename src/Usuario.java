import java.util.LinkedList;

public class Usuario {
	private int id; 
	private String nombreUsuario;
	private String Contraseña;
	private boolean rol;
	private static LinkedList<Empleado> empleados = new LinkedList<Empleado>();
	private static LinkedList<Administrador> administrador = new LinkedList<Administrador>();
	
	
	public Usuario(int id, String nombreUsuario, String contraseña, boolean rol) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		Contraseña = contraseña;
		this.rol = rol;

	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public boolean isRol() {
		return rol;
	}
	public void setRol(boolean rol) {
		this.rol = rol;
	}
	
	
	public static LinkedList<Empleado> getEmpleados() {
		return empleados;
	}


	public static void setEmpleados(LinkedList<Empleado> empleados) {
		Usuario.empleados = empleados;
	}


	public static LinkedList<Administrador> getAdministrador() {
		return administrador;
	}


	public static void setAdministrador(LinkedList<Administrador> administrador) {
		Usuario.administrador = administrador;
	}


	public static Usuario login(String nombre, String contrasena) {
		
		Usuario usuarioLogeado = null;
		
		for (Administrador admin : administrador) {
			if (nombre.equals(admin.getNombreUsuario())&&contrasena.equals(admin.getContraseña())) {
				usuarioLogeado = admin;
			}
		}
		
		for (Empleado emp : empleados) {
			if (nombre.equals(emp.getNombreUsuario())&&contrasena.equals(emp.getContraseña())) {
				usuarioLogeado = emp;
			}
		}
		
		return usuarioLogeado;
	}
	
	
}
