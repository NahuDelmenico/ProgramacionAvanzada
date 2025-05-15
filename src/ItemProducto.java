
public class ItemProducto {
	
	protected  int id;
	protected  Producto idProducto;
	protected  CarritoDeCompra idCarrito;
	protected int cantidad;
	
	
	public ItemProducto(int id, Producto idProducto, CarritoDeCompra idCarrito, int cantidad) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.idCarrito = idCarrito;
		this.cantidad = cantidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Producto getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}


	public CarritoDeCompra getIdCarrito() {
		return idCarrito;
	}


	public void setIdCarrito(CarritoDeCompra idCarrito) {
		this.idCarrito = idCarrito;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	
	
	
	
}
