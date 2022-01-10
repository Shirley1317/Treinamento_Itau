package br.project.finalproject.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cliente")
public class Client {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) // indica que é gerado codigo do BD sequencial
    @Column (name = "code")
    private long code;

    @Column (name = "name" , length = 200, nullable = false, unique = true)
    private String name;

    @Column (name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column (name = "address", length = 200, nullable = false)
    private String address;

    @Column (name = "celphone", length = 20, nullable = false)
    private String celphone;

    @Column (name = "email", length = 30, nullable = false, unique = true)
    private String email;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
        
    }

