
public class Producto {
	
	protected int id;
	protected String nombre;
	protected double precio;
	protected int stock;
	protected String talle;
	protected Categoria idCategoria;
	
	
	public Producto(int id, String nombre, double precio, int stock, String talle, Categoria idCategoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.talle = talle;
		this.idCategoria = idCategoria;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getTalle() {
		return talle;
	}


	public void setTalle(String talle) {
		this.talle = talle;
	}


	public Categoria getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	

}
