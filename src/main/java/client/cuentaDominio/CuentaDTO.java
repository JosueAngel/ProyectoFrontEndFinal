package client.cuentaDominio;

public class CuentaDTO {
	
	private Long idCuenta;
	private String nombreCuenta;
	private String tipoCuenta;
	private String descripcionCuenta;
	private String fechaCreacion;
	private String contrasenaCuenta;
	
	public  CuentaDTO() {
			
	}

	public CuentaDTO(Long idCuenta,String nombreCuenta,String tipoCuenta,String descripcionCuenta,String fechaCreacion, 
			String contrasenaCuenta) {
		this.idCuenta=idCuenta;
		this.nombreCuenta=nombreCuenta;
		this.tipoCuenta=tipoCuenta;
		this.descripcionCuenta=descripcionCuenta;
		this.fechaCreacion=fechaCreacion;
		this.contrasenaCuenta=contrasenaCuenta;
	}

	
	
	
	public Long getIdCuenta() {
		return idCuenta;
	}
	
	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}
	
	public String getNombreCuenta() {
		return nombreCuenta;
	}
	
	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}
	
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	public String getDescripcionCuenta() {
		return descripcionCuenta;
	}
	
	public void setDescripcionCuenta(String descripcionCuenta) {
		this.descripcionCuenta = descripcionCuenta;
	}
	
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public String getContrasenaCuenta() {
		return contrasenaCuenta;
	}
	
	public void setContrasenaCuenta(String contrasenaCuenta) {
		this.contrasenaCuenta = contrasenaCuenta;
	}
	

}
