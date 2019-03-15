package com.example.appfilmejson;

import com.google.gson.annotations.SerializedName;

public class Filme {
    @SerializedName("id")
    private long ID;
    private String nome;
    private String genero;
    private int anoProducao;
    private boolean nacional;

    public Filme(){
    }

    public Filme(long ID, String nome, String genero, int anoProducao, boolean nacional){
        this.ID = ID;
        this.nome = nome;
        this.genero = genero;
        this.anoProducao = anoProducao;
        this.nacional = nacional;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    @Override
    public String toString() {
        return "Filme{\n" +
                "ID=" + ID +
                ", \nnome='" + nome + '\'' +
                ", \ngenero='" + genero + '\'' +
                ", \nanoProducao=" + anoProducao +
                ", \nnacional=" + nacional +
                "\n}";
    }
}
