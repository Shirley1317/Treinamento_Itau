package br.itau.final02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que será armazenada no BD
@Table (name = "cliente") //nome da tabela no BD
public class Client { 

    @Id // indica que é uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //numero será gerado pelo BD sequencialmente
    private long account;

    @Column(name = "nome", length =  200, nullable = false) // permite que mude o nome do campo
    private String name;

    @Column(name = "email", length =  100, nullable = false, unique = true )
    private String email;

    @Column(name = "endereco", length =  200) // permite que mude o nome do campo
    private String address;

    @Column(name = "celular", length =  15, nullable = false) // permite que mude o nome do campo
    private String celphone ;

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    
    
}
