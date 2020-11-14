package client.Curso;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.cursoDominio.CursoDTO;
import client.cursoUtil.ResponseDTO;

@FeignClient(url="http://192.168.56.1:8090", name="curso")
public interface CursosPrincipal {
	
	@GetMapping(path="/curso", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/curso", produces="application/json")
	ResponseDTO crear(@RequestBody CursoDTO curso);
	
	@PutMapping(path="/curso", produces="application/json")
	ResponseDTO actualizar(@RequestBody CursoDTO Curso);
	
	@DeleteMapping(path="/curso/{id}" , produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
	
	
	
	
	
}
