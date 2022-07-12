package GSport.ECommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",unique=true,nullable=false)
	
	private Long id;
	@Column(name="idproductos")
	private String idproductos;
	//@Column(name="idProveedores")
	private String idproveedores;
	//@Column(name="idCategorias")
	private String idCategorias;
	@Column(name="NombreProducto")
	private String NombreProducto; 
	@Column(name="PrecioUnidad")
	private double PrecioUnidad;
	@Column(name="UnidadesExistentes")
	private int UnidadesExistentes;
	@Column(name="Descripción")
	private String Descripción;
	@Column(name="marca")
	private String Marca;
	@Column(name="url_imagen")
	private String URL_Imagen;
	public Productos(Long id, String idProductos, String idproveedores, String idCategorias, String nombreProducto,
			double precioUnidad, int unidadesExistentes, String descripción, String marca, String uRL_Imagen) {
		super();
		this.id = id;
		this.idproductos = idProductos;
		this.idproveedores = idproveedores;
		this.idCategorias = idCategorias;
		NombreProducto = nombreProducto;
		PrecioUnidad = precioUnidad;
		UnidadesExistentes = unidadesExistentes;
		Descripción = descripción;
		Marca = marca;
		URL_Imagen = uRL_Imagen;
	}
	public Long getId() {
		return id;
	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	public String getIdproductos() {
		return idproductos;
	}
	public void setIdproductos(String idProducto) {
		this.idproductos = idProducto;
	}
	public String getIdproveedores() {
		return idproveedores;
	}
	public void setIdproveedores(String idproveedores) {
		this.idproveedores = idproveedores;
	}
	public String getIdCategorias() {
		return idCategorias;
	}
	public void setIdCategorias(String idCategorias) {
		this.idCategorias = idCategorias;
	}
	public String getNombreProducto() {
		return NombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}
	public double getPrecioUnidad() {
		return PrecioUnidad;
	}
	public void setPrecioUnidad(double precioUnidad) {
		PrecioUnidad = precioUnidad;
	}
	public int getUnidadesExistentes() {
		return UnidadesExistentes;
	}
	public void setUnidadesExistentes(int unidadesExistentes) {
		UnidadesExistentes = unidadesExistentes;
	}
	public String getDescripción() {
		return Descripción;
	}
	public void setDescripción(String descripción) {
		Descripción = descripción;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getURL_Imagen() {
		return URL_Imagen;
	}
	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}
	@Override
	public String toString() {
		return "Productos [id=" + id + ", idProductos=" + idproductos + ", idproveedores=" + idproveedores
				+ ", idCategorias=" + idCategorias + ", NombreProducto=" + NombreProducto + ", PrecioUnidad="
				+ PrecioUnidad + ", UnidadesExistentes=" + UnidadesExistentes + ", Descripción=" + Descripción
				+ ", Marca=" + Marca + ", URL_Imagen=" + URL_Imagen + "]";
	} 

	
	
	
	
	
	
}//Producto
