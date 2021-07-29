package edu.br.infnet.app;

import edu.br.infnet.domain.contatos.Contato;
import edu.br.infnet.infra.contatos.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping({"/contatos"}) // RequestMapping --> Indica a URL
public class ContatoController
{
    @Autowired // Autowired --> injeta o repository
    private ContatoRepository repository;

    @GetMapping
    public Collection<Contato> listarContatos(){

        return repository.listar();
    }

    @GetMapping(path = {"/{id}"})
    public Contato obterContato(@PathVariable int id){

        return repository.obter(id);
    }
}
