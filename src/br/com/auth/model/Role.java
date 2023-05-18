package br.com.auth.model;

public class Role {

    private String nome;

    private Long id;

    private String descricao;


    public Role() {
    }

    public Role(String nome, Long id, String descricao) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Role{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
