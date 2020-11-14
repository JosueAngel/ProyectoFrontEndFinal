package client.Cuenta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.cuentaUtil.ResponseDTO;
import client.cuentaDominio.CuentaDTO;
 

@FeignClient(url="http://192.168.56.1:8090", name="cuenta")
public interface CuentaPrincipal {
	
	@GetMapping(path="/cuenta", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/cuenta", produces="application/json")
	ResponseDTO crear(@RequestBody CuentaDTO curso);

	@PutMapping(path="/cuenta", produces="application/json")
	ResponseDTO actualizar(@RequestBody CuentaDTO Curso);
	
	@DeleteMapping(path="/cuenta/{id}" , produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
}
