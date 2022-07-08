package GSport.ECommerce.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import GSport.ECommerce.Productos;

@Service
public class ProductoServicios {
	
public final ArrayList<Productos>lista=new ArrayList<Productos>(); //Se crea la lista de los productos.
	
	
	//se intancia para cuando se levante el servidor se crea una instancia del servicio.
	public ProductoServicios()
	{
				
		lista.add(new Productos("Polainas Wilson 4lbs Unisex",
				"Diseñadas para amoldarse encima de los tobillos con comodidad.",
				"PolainasRojas.jpg",459.0));
		
		lista.add(new Productos("Tenis Mujer Nike Tanjun",
				"Tenis aerodimámicos super lijeros de alta calidad",
				"TenisNikeMujer.jpg",1239.0));
		
		lista.add(new Productos("Xiaomi Mi Watch Negro",
				"Pantalla: 1.39 Pulgadas, compatibile con Android 4.4 e IOS 10 o superior",
				"WatchNegro.jpg",2800.0));
		
	}//Constructor
	
	public ArrayList<Productos>getProductos()
	{
		return lista;
	}//getProductos
	
	public Productos getProducto(Long id)
	{
		Productos tmProduct=null;
		for (Productos producto : lista)
		{
			if(producto.getId()==id)
			{
				tmProduct=producto;
				break;
			}//if
		}//for
		return tmProduct;
	}//get producto

	public Productos deleteProducto(Long id) {
		Productos tmProduct=null;
		for (Productos producto : lista)
		{
			if(producto.getId()==id)
			{
				tmProduct=lista.remove(lista.indexOf(producto));
				break;
			}//if
		}//for
		return tmProduct;
	}//deleteProduct
	
	public Productos addProducto(Productos producto)
	{
		lista.add(producto);
		return producto;
	}//addProducto
	
	public Productos updateProducto(Long id, String nombre, String descripcion,
									String uRL_imagen, double precio)
	{
		Productos tmProduct=null;
		for (Productos producto : lista) {
			if(producto.getId()==id)
			{
				if(descripcion != null) {producto.setDescripcion(descripcion);}
				if(uRL_imagen!=null) {producto.setURL_imagen(uRL_imagen);}
				//no puede ser nulo porque es dooble 
				if (precio>0) {producto.setPrecio(precio);}
				tmProduct=producto;
				break;
			}//if
			
		}//for
		return tmProduct;
	}//updateProduct
	

}//ClassProductoServicios
