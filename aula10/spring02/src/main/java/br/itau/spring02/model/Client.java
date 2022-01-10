package br.itau.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que esta classe será armazenada no BD // estamos relacionando as anotações @ com o Banco de Dados
@Table(name = "cliente") // nome da tabela no BD
public class Client {

   @Id // indica que esta classe será armazenada no BD
   @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o número será gerado pelo BD sequencialmente (1 2 3 4...)
   private long cod; // atributos // long = parecido com int porem é numero mais longo longo

   @Column(name = "nome", length = 200, nullable = false)
   // lenght  tamanho máxmo em caracteres, nullable = false => campo obrgatório
   private String name; // String = texto

   @Column(name = "email", length = 100, nullable = false, unique = true)
   // unique = não pode ter 2 emails iguais
   private String email; // String = texto

   public long getCod() {
      return cod;
   }

   public void setCod(long cod) {
      this.cod = cod;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   
   
    }

    

