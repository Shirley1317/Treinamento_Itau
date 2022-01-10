package br.itau.final02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.final02.model.Client;
import br.itau.final02.repository.ClientRepo;

@RestController
@CrossOrigin ("*")
@RequestMapping ("/client")
public class ClientController {

    @Autowired
    private ClientRepo repo;
        
    
    @GetMapping("/all")
    public List<Client> listarTodos() {
        List<Client> lista = (List<Client>) repo.findAll();

        return lista;
    }

    @GetMapping("/{conta}")
    public ResponseEntity<Client> buscarCliente(@PathVariable long conta) {
        Client clienteEncontrado = repo.findById(conta).orElse(null);

        if(clienteEncontrado != null) {
            return ResponseEntity.ok(clienteEncontrado);

        }

        return ResponseEntity.notFound().build();

    }
    @PostMapping
    public ResponseEntity<Client> inserirCliente(@RequestBody Client cliente) {
        Client novoClient = repo.save(cliente);

        return ResponseEntity.ok(novoClient);

    }
    @DeleteMapping("/{account}")
    public ResponseEntity<Void> apagarCliente(@PathVariable long account) {

        Client clienteEncontrado = repo.findById(account).orElse(null);

        if(clienteEncontrado != null) {
            repo.deleteById(account);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

            
         return ResponseEntity.notFound().build();
        
    }
    @PostMapping("/email")
    public ResponseEntity<Client> buscarPorEmail(@RequestBody Client cliente) {
        Client clienteEncontrado = repo.findByEmail(cliente.getEmail());

        if (clienteEncontrado != null) {
            return ResponseEntity.ok(clienteEncontrado);
        }

        return ResponseEntity.notFound().build();
    }

}


  
    

