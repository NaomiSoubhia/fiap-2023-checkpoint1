package br.com.fiap.checkpoint1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.repository.EmpregadoRepository;

@Service
public class EmpregadoService {
	@Autowired
	private EmpregadoRepository empregadoRep;

	public List<Empregado> list() {
		return empregadoRep.findAll();
	}
	
	public Empregado save(Empregado salvar) {			
		return empregadoRep.save(salvar);
	}
}
