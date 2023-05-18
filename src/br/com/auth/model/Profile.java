package br.com.auth.model;

import java.util.Collection;
import java.util.Vector;

public class Profile {

    private Long id;

    private String nome;

    private Collection<Role> roles = new Vector<>();

    public Profile() {
    }

    public Profile(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
