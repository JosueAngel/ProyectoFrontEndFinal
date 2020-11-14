package client.cuentaServicio;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import client.Cuenta.CuentaPrincipal;
import client.cuentaDominio.CuentaDTO;
import client.cuentaUtil.ResponseDTO;


@Service
public class CuentaServicio {

	@Autowired
	CuentaPrincipal cuentabd;
	
	public Map<String, Object>listar()
	{
		 Map<String,Object>model = new HashMap<>();	 
		try 
		{
			ResponseDTO cuentaList=cuentabd.listar();
		 	model.put("cuentaList", cuentaList.getRespuesta());
		}
		catch (Exception e) 
		{
			model.put("err", "error");
			model.put("msg", "Error al extraer los datos, si el error persiste contacte al admin");
			e.printStackTrace();
		}	 
		return model;
	}
	
	
	
	public Map<String, Object>crear(CuentaDTO cuenta)
	{
		 Map<String,Object>model = new HashMap<>();
		try 
		{
			ResponseDTO res= cuentabd.crear(cuenta);		
		} 
		catch(HttpStatusCodeException e) 
		{
			model.put("msg",ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}
	
	
	
	public Map<String, Object>actualizar(CuentaDTO cuenta)
	{	
		Map<String,Object>model = new HashMap<>();	 
		try 
		{
			ResponseDTO res = cuentabd.actualizar(cuenta);
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
			cuentabd.borrar(id);
		} 
		catch (HttpStatusCodeException e) 
		{
			model.put("msg", ResponseDTO.CODE_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}
}
