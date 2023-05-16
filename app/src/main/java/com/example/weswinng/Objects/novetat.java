package com.example.weswinng.Objects;

public class novetat {
    private int foto;
    private String descripcio;
    private String hores;

    public novetat(int foto, String descripcio, String hores) {
        this.foto = foto;
        this.descripcio = descripcio;
        this.hores = hores;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getHores() {
        return hores;
    }

    public void setHores(String hores) {
        this.hores = hores;
    }
}
