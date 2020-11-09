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
				public String list(Model  vista) {
					Map<String , Object> modelo = new HashMap<>();
					modelo=(servicioCurso.listar());
					vista.addAttribute( "curso" , modelo.get("cursolist"));
					return "curso";
			
		
	}
	
	
	@GetMapping("/crear")
	public String redirect(Model model) {
		model.addAttribute("crear curso", new CursoDTO());
		return "Crar curso";
	}
	
	@PostMapping
	public String crear(@ModelAttribute("crearCurso")CursoDTO curso) {
		
		servicioCurso.crear(curso);
		return "redirect:/curso";
		
	}
	@GetMapping("/actualizar")
	public String actualizar(@ModelAttribute ("actualizarcurso")CursoDTO curso) {
		servicioCurso.actualizar(curso);
		return  "redirect:/curso";
	}
	@PostMapping("/deletr/{Id_Curso}")
	public String borrar(@PathVariable("Id_Curso") Long Id_Curso) {
		servicioCurso.eliminar(Id_Curso);
		return  "redirect:/curso";
	}
	

}
