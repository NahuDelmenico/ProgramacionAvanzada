import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class Usuario {
	private int id; 
	private String nombreUsuario;
	private String Contraseña;
	private int rol;
	private static LinkedList<Empleado> empleados = new LinkedList<Empleado>();
	private static LinkedList<Administrador> administrador = new LinkedList<Administrador>();
	
	
	public Usuario(int id, String nombreUsuario, String contraseña, int rol) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		Contraseña = contraseña;
		this.rol = rol;

	}
	public Usuario() {
		

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
	
	
	
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
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
	
    private static Connection con = Conexion.getInstance().getConnection();


	 public static Usuario login(String nombre, String password) {
		 Usuario usuario = new Usuario();
	        try {
	            PreparedStatement stmt = con.prepareStatement(
	                "SELECT * FROM usuario WHERE nombre = ? AND contraseña = ?"
	            );
	            stmt.setString(1, nombre);
	            stmt.setString(2,password);
	            
	            ResultSet rs = stmt.executeQuery();
	          
	           
	            if (rs.next()) {
	            	int  id = rs.getInt("id");         
	                int rol = rs.getInt("rol"); 
	                usuario = new Usuario(id, nombre,password, rol);  
	            }
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return usuario;
	    }
	
	public static Usuario login2(String nombre, String contrasena) {
		
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
	
	public static void agregarUsuario(){
		
		
	
	}
	
	
	public static LinkedList<Usuario> mostrarUsuarios(){
		
		 LinkedList<Usuario> usuarios = new LinkedList<>();
		 
		 try {
			
			 PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario");
			 ResultSet rs = stmt.executeQuery();
			 
			 while(rs.next()) {
				 
				 int id = rs.getInt("id");
				 String usuario = rs.getString("usuario");
				 String contrasena = rs.getString("contaseña");
				 int rol= rs.getInt("rol");
				 
				 usuarios.add(new Usuario(id,usuario,contrasena,rol));
			 }
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return usuarios;
		 
		
	}
}
