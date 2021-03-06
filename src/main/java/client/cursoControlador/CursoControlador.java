package client.cursoControlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import client.CursoServicio.CursoServicio;
import client.cursoDominio.CursoDTO;

@Controller
@RequestMapping("/curso")

public class CursoControlador {
	@Autowired
	CursoServicio servicioCurso;
	
	
	@GetMapping
	public String list(Model  vista) 
	{
		Map<String , Object> modelo= new HashMap<>();
		modelo=(servicioCurso.listar());
		vista.addAttribute( "cursos", modelo.get("cursoList"));
		return "Curso";	
	}
	
	
	
	@GetMapping("/crear")
	public String redirectcrear(Model model) 
	{
		model.addAttribute("crearCurso", new CursoDTO());
		return "CrearCurso";
	}
	@PostMapping
	public String crear(@ModelAttribute("crearCurso")CursoDTO curso) 
	{
		servicioCurso.crear(curso);
		return "redirect:/curso";
	}
	
	
	
	@GetMapping("/actualizar")
	public String redirectact(Model model)
	{
		model.addAttribute("actCurso", new CursoDTO());
		return "ActCurso";
	}
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actCurso") CursoDTO curso)
	{
		servicioCurso.actualizar(curso);
		return "redirect:/curso";
	}
	
	
	
	
	@PostMapping("/delete/{id}")
	public String borrar(@PathVariable("id") Long id) 
	{
		servicioCurso.eliminar(id);
		return  "redirect:/curso";
	}
	

}
