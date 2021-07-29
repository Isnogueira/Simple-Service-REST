package edu.br.infnet.infra.contatos;

import edu.br.infnet.domain.contatos.Contato;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class ContatoRepository {

    private final HashMap<Integer, Contato> contatos;

    public ContatoRepository() {

        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Ingrid Nogueira", "ingrid@gmail.com", "223754674"));
        contatos.put(2, new Contato(2, "Suellen Nogueira", "zukkkk@gmail.com", "967893456"));
        contatos.put(3, new Contato(3, "Nathalia Nogueira", "nath@gmail.com", "975643213"));
    }

    public Collection<Contato> listar() {

        return contatos.values();
    }

    public Contato obter(int id) {

        return contatos.get(id);
    }
}
