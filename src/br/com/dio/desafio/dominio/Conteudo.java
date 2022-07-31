package br.com.dio.desafio.dominio;

//classe abstrata = não é possível instanciar/criar conteudo
//classe criada para implementar os atriutos nas classes filhas, evitando repetição de código (herança)
public abstract class Conteudo {

    //clase criada para simplificar codigo e evitar repetição

    //boot camp vai ter conteudo,ex mentoria e cursos

    // static = vou poder acessar XP_PADRAO fora dessa classe
    //protected = os filhos de conteudo terao acesso
    //public = qlqr classe poderia ter acesso
    //private = só a classe conteudo poderia ter acesso ao atributo XP_PADRAO
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public String getTitulo() {
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
    }

    public abstract double calcularXp();

}
