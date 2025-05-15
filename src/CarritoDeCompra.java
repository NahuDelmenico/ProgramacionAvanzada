import java.util.LinkedList;

public class CarritoDeCompra {
	 
	protected int id;
	protected LinkedList <ItemProducto> itemProducto;
	protected int idVenta;
	
	public CarritoDeCompra(int id, LinkedList<ItemProducto> itemProducto, int idVenta) {
		super();
		this.id = id;
		this.itemProducto = itemProducto;
		this.idVenta = idVenta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LinkedList<ItemProducto> getItemProducto() {
		return itemProducto;
	}
	public void setItemProducto(LinkedList<ItemProducto> itemProducto) {
		this.itemProducto = itemProducto;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	
	
}
