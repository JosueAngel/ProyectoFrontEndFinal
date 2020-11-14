package client.ventaControlador;

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

import client.ventaServicio.VentaServicio;
import client.ventaDominio.VentaDTO;


@Controller
@RequestMapping("/venta")

public class VentaControlador {

	@Autowired
	VentaServicio servicioVenta;
	
	
	@GetMapping
	public String list(Model  vista) 
	{
		Map<String , Object> modelo= new HashMap<>();
		modelo=(servicioVenta.listar());
		vista.addAttribute( "ventas", modelo.get("ventaList"));
		return "Venta";	
	}
	
	
	
	@GetMapping("/crear")
	public String redirectcrear(Model model) 
	{
		model.addAttribute("crearVenta", new VentaDTO());
		return "CrearVenta";
	}
	@PostMapping
	public String crear(@ModelAttribute("crearVenta")VentaDTO venta) 
	{
		servicioVenta.crear(venta);
		return "redirect:/venta";
	}
	
	
	
	@GetMapping("/actualizar")
	public String redirectact(Model model)
	{
		model.addAttribute("actVenta", new VentaDTO());
		return "ActVenta";
	}
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actVenta") VentaDTO venta)
	{
		servicioVenta.actualizar(venta);
		return "redirect:/venta";
	}
	
	
	
	@PostMapping("/delete/{id}")
	public String borrar(@PathVariable("id") Long id) 
	{
		servicioVenta.eliminar(id);
		return  "redirect:/venta";
	}

}
