package br.itau.final02.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.final02.model.Client;

public interface ClientRepo extends CrudRepository<Client, Long> {
    public Client findByEmail(String email);
}
