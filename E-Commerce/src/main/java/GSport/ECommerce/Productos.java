package GSport.ECommerce;

public class Productos {
	private String nombre; 
	private String descripcion; 
	private String URL_imagen; 
	private double precio;
	private int id;
	private static int total=0;
	
	public Productos(String nombre, String descripcion, String uRL_imagen, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.precio = precio;
		total ++;
		this.id=total;
	}//Constructor 
		//Constructor por default
	public Productos() {
		total ++;
	    this.id=total;
	    } //constructor vacio para llamarlo con el JSON de SprintBoot
	
	//getters & setters generados.
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_imagen() {
		return URL_imagen;
	}

	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen=" + URL_imagen
				+ ", precio=" + precio + "]";
	} 
	
	

}//Producto
