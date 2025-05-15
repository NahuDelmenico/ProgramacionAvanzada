import java.time.LocalDateTime;

public class Venta {
	
	protected int id;
	protected Empleado empleado;
	protected Cliente cliente;
	protected CarritoDeCompra compra;
	protected double monto;
	protected LocalDateTime fecha;
	protected String detalle;
	
	public Venta(int id, Empleado empleado, Cliente cliente, CarritoDeCompra compra, double monto, LocalDateTime fecha,
			String detalle) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.cliente = cliente;
		this.compra = compra;
		this.monto = monto;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CarritoDeCompra getCompra() {
		return compra;
	}

	public void setCompra(CarritoDeCompra compra) {
		this.compra = compra;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	} 
	
	
	
}
