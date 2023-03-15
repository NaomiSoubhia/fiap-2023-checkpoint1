package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.controller.dto.EmpregadoNovo;
import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.service.EmpregadoService;


@RestController
@RequestMapping("/empregados")
public class EmpregadoController {

	@Autowired
	private EmpregadoService empregadoService;


	//Post
	@PostMapping
	public Empregado create(EmpregadoNovo novo) {
		
		Empregado empregadoInsert = new Empregado();
		empregadoInsert.setNome(novo.getNome());
		empregadoInsert.setEndereco(novo.getEndereco());
		
		Empregado result = empregadoService.save(empregadoInsert);
		return result;
	}

	//Put
	@PutMapping
	public Empregado update(Empregado emp) {
		Empregado result = empregadoService.save(emp);
		return result;
	}
	
	//Get
	@GetMapping
	public List<Empregado> listAll() {
		return empregadoService.list();
	}


}
