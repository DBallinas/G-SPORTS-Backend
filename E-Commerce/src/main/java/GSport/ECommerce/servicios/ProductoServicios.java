package GSport.ECommerce.servicios;

import java.util.List;
import java.util.Optional;

//import java.util.ArrayList;

import org.springframework.stereotype.Service;

import GSport.ECommerce.model.Productos;

@Service
public class ProductoServicios {
	
//public final ArrayList<Productos>lista=new ArrayList<Productos>(); //Se crea la lista de los productos.
	
	private final ProductosRepositorio productosRepositorio;
	
	
	//se intancia para cuando se levante el servidor se crea una instancia del servicio.
	public ProductoServicios(ProductosRepositorio productosRepositorio)
	{
				
		this.productosRepositorio=productosRepositorio;
		
	}//Constructor
	
	public List<Productos>getProductos()
	{
		return productosRepositorio.findAll();
	}//getProductos
	
	public Productos getProducto(Long id)
	{
		return productosRepositorio.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El producto con el id "+id+"no existe.")
				);
	}//get producto

	public Productos deleteProducto(Long id) {
		Productos tmProducto=null;
		
		if(productosRepositorio.existsById(id))
		{
			tmProducto=productosRepositorio.findById(id).get();
			productosRepositorio.deleteById(id);
		}//if Exist
		return tmProducto;
	}//deleteProducto
	
	public Productos addProducto(Productos producto)
	{
		Productos tmProducto=null;
		Optional <Productos> prodByName=productosRepositorio.findByNombre(producto.getNombreProducto());
		
		if(prodByName.isPresent())
		{
			throw new IllegalArgumentException("El producto con el nombre ["+producto.getNombreProducto()+" ] ya existe");
		}
		else
		{
			productosRepositorio.save(producto);
			tmProducto=producto;
		}//else//if Present
		return tmProducto;
	}//addProducto
	
	public Productos updateProducto(Long id, String idproductos, String idproveedores, String idcategoria, 
									String nombreproducto, double preciounidad, int unidadesexistentes, String descripción, String marca,String url_imagen)
	{
		Productos tmProducto=null;
		if(productosRepositorio.existsById(id))
		{
			tmProducto=productosRepositorio.findById(id).get();
			if(idproductos != null)tmProducto.setIdproductos(idproductos);
			if(idproveedores !=null)tmProducto.setIdproveedores(idproveedores);
			if(idcategoria!=null)tmProducto.setIdCategorias(idcategoria);
			if(nombreproducto!=null)tmProducto.setNombreProducto(nombreproducto); 
			//if(precio!=null)tmProducto.setPrecio(precio.doubleValue());
			if(preciounidad<=0)tmProducto.setPrecioUnidad(preciounidad);
			if(unidadesexistentes<=0)tmProducto.setUnidadesExistentes(unidadesexistentes);
			if (descripción!=null)tmProducto.setDescripción(descripción);
			if(marca!=null)tmProducto.setMarca(marca);
			if(url_imagen!=null)tmProducto.setURL_Imagen(url_imagen);
		
			productosRepositorio.save(tmProducto);
		}
		else
		{
			System.out.println("El producto con el id:_ "+id+" no existe.");
		}//else//if update
		return tmProducto;
	}//updateProduct
	

}//ClassProductoServicios
