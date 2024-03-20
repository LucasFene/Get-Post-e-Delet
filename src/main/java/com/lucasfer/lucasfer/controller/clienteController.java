	package com.lucasfer.lucasfer.controller;
	
	import org.springframework.web.bind.annotation.RestController;
	
	import com.lucasfer.lucasfer.ClienteRepository.ClienteInterface;
	import com.lucasfer.lucasfer.model.Cliente;
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping; 

@RestController
@RequestMapping("/clientes")
public class clienteController {

	@Autowired
	private ClienteInterface clienteInterface;
	
	@GetMapping
	public List<Cliente>lister() {
		return clienteInterface.findAll();
		}
	
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		
		return clienteInterface.save(cliente);
		
	}
	
	@DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable(value="id") Long id) {
		
		clienteInterface.deleteById(id);
	
	}
	
}
