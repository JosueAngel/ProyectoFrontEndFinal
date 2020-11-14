package client.ventaServicio;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import client.Venta.VentaPrincipal;
import client.ventaDominio.VentaDTO;
import client.ventaUtil.ResponseDTO;


@Service
public class VentaServicio {
	
	@Autowired
	VentaPrincipal ventabd;
	
	
	public Map<String, Object>listar()
	{
		 Map<String,Object>model = new HashMap<>();	 
		try 
		{
			 	ResponseDTO ventaList = ventabd.listar();
			 	model.put("ventaList", ventaList.getRespuesta());	
		} 
		 
		catch (Exception e) 
		{
			model.put("err", "error");
			model.put("msg", "Error al extraer los datos, si el error persiste contacte al admin");
		e.printStackTrace();
		}	 
		return model;
	}
	
	
	
	
	public Map<String, Object>crear(VentaDTO venta)
	{
		 Map<String,Object>model = new HashMap<>();
		try 
		{
			ResponseDTO res=  ventabd.crear(venta);		
		} 
		catch(HttpStatusCodeException e) 
		{
			model.put("msg",ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}

	
	
	
	public Map<String, Object>actualizar(VentaDTO venta)
	{	
		Map<String,Object>model = new HashMap<>();	 
		try 
		{
			ResponseDTO res = ventabd.actualizar(venta);
		} 
		catch (HttpStatusCodeException e) 
		{
			model.put("msg", ResponseDTO.CODE_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}
	
	
	
	
	public Map<String, Object>eliminar(Long id)
	{
		Map<String,Object>model = new HashMap<>(); 
		try 
		{	
			ventabd.borrar(id);
		} 
		catch (HttpStatusCodeException e) 
		{
			model.put("msg", ResponseDTO.CODE_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}
	
}
