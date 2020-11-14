package client.cursoDominio;



public class CursoDTO {
	
	private Long idCurso;
	private String nombreCurso;
	private String nombreProfesor;
	private String descripcionCurso;
	private String fechaCreacion;
	private String precioCurso;
	
	
	public  CursoDTO() {
		
	}
	
	public CursoDTO(Long idCurso,String nombreCurso,String nombreProfesor,String descripcionCurso,String fechaCreacion, 
					String precioCurso) {
		this.idCurso=idCurso;
		this.nombreCurso=nombreCurso;
		this.nombreProfesor=nombreProfesor;
		this.descripcionCurso=descripcionCurso;
		this.fechaCreacion=fechaCreacion;
		this.precioCurso=precioCurso;
	}

	
	
	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public String getDescripcionCurso() {
		return descripcionCurso;
	}

	public void setDescripcionCurso(String descripcionCurso) {
		this.descripcionCurso = descripcionCurso;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getPrecioCurso() {
		return precioCurso;
	}

	public void setPrecioCurso(String precioCurso) {
		this.precioCurso = precioCurso;
	}
		

}
