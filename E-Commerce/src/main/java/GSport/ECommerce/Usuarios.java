package GSport.ECommerce;

public class Usuarios {
	private String Nombre; 
	private String APaterno;
	private String AMarterno; 
	private String Correo;
	private String Contraseña;
	
	public Usuarios(String nombre, String aPaterno, String aMarterno, String correo,
			String contraseña) {
		super();
		this.Nombre = nombre;
		this.APaterno = aPaterno;
		this.AMarterno = aMarterno;
		this.Correo = correo;
		this.Contraseña = contraseña;
	}
	public Usuarios(String correo,
			String contraseña) {
		super();
		this.Correo = correo;
		this.Contraseña = contraseña;
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

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuarios [Nombre=" + Nombre + ", APaterno=" + APaterno + ", AMarterno=" + AMarterno + ", Correo="
				+ Correo + ", Contraseña=" + Contraseña + "]";
	}
	
	

}//ClassUsuarios
