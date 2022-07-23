package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargahoraria;


    public Curso() {
    }



    public int getCargahoraria() {
        return cargahoraria;


    }

    @Override
    public double calcularxp() {
        return 0;
    }

    public void setCargahoraria(int i) {
    }
}