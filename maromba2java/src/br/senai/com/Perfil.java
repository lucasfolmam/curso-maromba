package br.senai.com;

public class Perfil {
    private String nome;
    private String editarfoto;
    private String email;

    public Perfil(String nome, String editarfoto, String email) {
        this.nome = nome;
        this.editarfoto = editarfoto;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditarfoto() {
        return editarfoto;
    }

    public void setEditarfoto(String editarfoto) {
        this.editarfoto = editarfoto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

