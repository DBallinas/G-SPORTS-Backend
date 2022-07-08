package GSport.ECommerce.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import GSport.ECommerce.Usuarios;

@Service
public class UsuariosServicios {
	
	public final ArrayList<Usuarios> lista=new ArrayList<Usuarios>();

	public UsuariosServicios() {
	
			lista.add(new Usuarios(
					"Juan Pablo",
					"Alquiricia",
					"Li",
					"JuanLi021@gmail.com",
					"Pa$$w0rd"));
			
			lista.add(new Usuarios(
					"María julieta",
					"Flores",
					"Nemeses",
					"MariJukiet@gmail.com",
					"Pa$$w0rd"));
		
		// TODO Auto-generated constructor stub
	}//usuarioServicios
	
	public List<Usuarios> getUsuarios() {
		// TODO Auto-generated method stub
		return lista;
	}//getUsuarios
	
	public Usuarios addUsuario(Usuarios usuario)
	{
		lista.add(usuario);
		return usuario;
	}//addUsuario
	
	public Usuarios addLogin(Usuarios Login)
	{
		lista.add(Login);
		return Login;
	}//addUsuario



}//ClassusaiosSerevicios
