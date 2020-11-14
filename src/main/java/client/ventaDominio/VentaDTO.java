package client.ventaDominio;

public class VentaDTO {
	
	private Long idVenta;
	private String nombreCliente;
	private String fechaVenta;
	private String cantidadVenta;
	private String tipoComprobante;
	private String totalVenta;
	private String estadoVenta;

	
	public VentaDTO() {
		
	}
	
	
	
	public VentaDTO(Long idVenta,String nombreCliente,String fechaVenta, String cantidadVenta,String tipoComprobante,String totalVenta, 
			String estadoVenta) {
		
		this.idVenta=idVenta;
		this.nombreCliente=nombreCliente;
		this.fechaVenta=fechaVenta;
		this.cantidadVenta=cantidadVenta;
		this.tipoComprobante=tipoComprobante;
		this.totalVenta=totalVenta;
		this.estadoVenta=estadoVenta;
	}



	public Long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	
	

	
	public String getCantidadVenta() {
		return cantidadVenta;
	}
	public void setCantidadVenta(String cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}



	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public String getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(String totalVenta) {
		this.totalVenta = totalVenta;
	}


	public String getEstadoVenta() {
		return estadoVenta;
	}
	public void setEstadoVenta(String estadoVenta) {
		this.estadoVenta = estadoVenta;
	}

	
	
}
