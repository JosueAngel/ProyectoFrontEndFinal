package client.cuentaControlador;

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

import client.cuentaServicio.CuentaServicio;
import client.cuentaDominio.CuentaDTO;


@Controller
@RequestMapping("/cuenta")

public class CuentaControlador {

	@Autowired
	CuentaServicio servicioCuenta;
	
	
	
	@GetMapping
	public String list(Model  vista) 
	{
		Map<String , Object> modelo= new HashMap<>();
		modelo=(servicioCuenta.listar());
		vista.addAttribute( "cuentas", modelo.get("cuentaList"));
		return "Cuenta";	
	}
	
	
	
	
	@GetMapping("/crear")
	public String redirectcrear(Model model) 
	{
		model.addAttribute("crearCuenta", new CuentaDTO());
		return "CrearCuenta";
	}
	@PostMapping
	public String crear(@ModelAttribute("crearCuenta")CuentaDTO cuenta) 
	{
		servicioCuenta.crear(cuenta);
		return "redirect:/cuenta";
	}
	
	
	
	
	@GetMapping("/actualizar")
	public String redirectact(Model model)
	{
		model.addAttribute("actCuenta", new CuentaDTO());
		return "ActCuenta";
	}
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actCuenta") CuentaDTO cuenta)
	{
		servicioCuenta.actualizar(cuenta);
		return "redirect:/cuenta";
	}
	
	
	
	
	@PostMapping("/delete/{id}")
	public String borrar(@PathVariable("id") Long id) 
	{
		servicioCuenta.eliminar(id);
		return  "redirect:/cuenta";
	}
}
