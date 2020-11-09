package client.cursoDominio;

public class CursoDTO {
	
	private Long Id_Curso;
	private String Nombre_Curso;
	private String Nombre_Profesor;
	private String Descripcion_Curso;
	private String Fecha_Creacion;
	private String Precio_Curso;
	
	
	public  CursoDTO() {
		
		
	}
	
	public CursoDTO(Long Id_Curso,String Nombre_Curso,String Nombre_Profesor,String Descripcion_Curso,String Fecha_Creacion, String Precio_Curso) {
		this.Id_Curso=Id_Curso;
		this.Nombre_Curso=Nombre_Curso;
		this.Nombre_Profesor=Nombre_Profesor;
		this.Descripcion_Curso=Descripcion_Curso;
		this.Fecha_Creacion=Fecha_Creacion;
		this.Precio_Curso=Precio_Curso;
	}

	public Long getId_Curso() {
		return Id_Curso;
	}

	public void setId_Curso(Long id_Curso) {
		Id_Curso = id_Curso;
	}

	public String getNombre_Curso() {
		return Nombre_Curso;
	}

	public void setNombre_Curso(String nombre_Curso) {
		Nombre_Curso = nombre_Curso;
	}

	public String getNombre_Profesor() {
		return Nombre_Profesor;
	}

	public void setNombre_Profesor(String nombre_Profesor) {
		Nombre_Profesor = nombre_Profesor;
	}

	public String getDescripcion_Curso() {
		return Descripcion_Curso;
	}

	public void setDescripcion_Curso(String descripcion_Curso) {
		Descripcion_Curso = descripcion_Curso;
	}

	public String getFecha_Creacion() {
		return Fecha_Creacion;
	}

	public void setFecha_Creacion(String fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}

	public String getPrecio_Curso() {
		return Precio_Curso;
	}

	public void setPrecio_Curso(String precio_Curso) {
		Precio_Curso = precio_Curso;
	}
	

}
