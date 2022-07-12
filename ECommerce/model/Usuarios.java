package GSport.ECommerce.model;

public class Usuarios {
	private String Nombre; 
	private String APaterno;
	private String AMarterno; 
	private String Correo;
	private String contrase�a;
	
	public Usuarios(String nombre, String aPaterno, String aMarterno, String correo,
			String contrase�a) {
		super();
		this.Nombre = nombre;
		this.APaterno = aPaterno;
		this.AMarterno = aMarterno;
		this.Correo = correo;
		this.contrase�a = contrase�a;
	}
	public Usuarios(String correo,
			String contrase�a) {
		super();
		this.Correo = correo;
		this.contrase�a = contrase�a;
	}
	
	public Usuarios() {}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAPaterno() {
		return APaterno;
	}

	public void setAPaterno(String aPaterno) {
		APaterno = aPaterno;
	}

	public String getAMarterno() {
		return AMarterno;
	}

	public void setAMarterno(String aMarterno) {
		AMarterno = aMarterno;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getcontrase�a() {
		return contrase�a;
	}

	public void setcontrase�a(String contrase�a) {
		contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Usuarios [Nombre=" + Nombre + ", APaterno=" + APaterno + ", AMarterno=" + AMarterno + ", Correo="
				+ Correo + ", Contraseña=" + contrase�a + "]";
	}
	
	

}//ClassUsuarios
