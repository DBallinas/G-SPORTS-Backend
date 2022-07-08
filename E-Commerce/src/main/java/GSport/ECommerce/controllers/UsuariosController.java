package GSport.ECommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import GSport.ECommerce.Usuarios;
import GSport.ECommerce.servicios.UsuariosServicios;

@RestController // importar este. 
@RequestMapping (path="/api/usuarios/")

@CrossOrigin(origins="*")
public class UsuariosController {
	
	private final UsuariosServicios usuarioServicios;
	
	//autoconectado
	@Autowired //indica que el constructor necesita un parametro instanciado de servicio
public UsuariosController(UsuariosServicios usuarioServicios) {
	this.usuarioServicios = usuarioServicios;
}//Constructor
	
	@GetMapping
	public List<Usuarios> getUsuarios()
	{
		return usuarioServicios.getUsuarios();
	}//getAllProducts
	
	@PostMapping
	public Usuarios addUsurio(@RequestBody Usuarios usuario)
	{
		return usuarioServicios.addUsuario(usuario);
	}//addUsuario
	
//	@PostMapping
//	public Usuarios addLogin(@RequestBody Usuarios usuario)
//	{
//		return usuarioServicios.addUsuario(usuario);
//	}//addUsuario

}//classUsuarioController
