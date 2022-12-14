package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    //modificadores de acesso na frente dos atributos

    /*private String titulo;
    private String descricao;*/
    private int cargaHoraria;
    //atributos encapsulados

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    /*public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }*/

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getTitulo() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
