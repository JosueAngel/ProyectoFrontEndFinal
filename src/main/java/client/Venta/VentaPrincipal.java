package client.Venta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.ventaDominio.VentaDTO;
import client.ventaUtil.ResponseDTO;


@FeignClient(url="http://192.168.56.1:8090", name="venta")
public interface VentaPrincipal {
	
	@GetMapping(path="/venta", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/venta", produces="application/json")
	ResponseDTO crear(@RequestBody VentaDTO venta);
	
	@PutMapping(path="/venta", produces="application/json")
	ResponseDTO actualizar(@RequestBody VentaDTO venta);
	
	@DeleteMapping(path="/venta/{id}" , produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);

}
