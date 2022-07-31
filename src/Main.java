import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        //nem = instanciando o objeto curso
        //a classe Curso é a planta da casa e o objetvo curso1 é a casa construída
        Curso curso1 = new Curso();
        curso1.setTitulo("Usando Orientação a Objetos em Java");
        curso1.setDescricao("Usando a linguagem Java");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Aprendendo sobre IDEs");
        curso2.setDescricao("Eclipse, Intellij, VS Code");
        curso2.setCargaHoraria(4);

        //n consigo criar um novo conteudo pq esta abstrato, mas consigo criar um curso/mentoria (polimorfismo)
        //polimorfismo = tudo q tem em conteudo tem em curso, mas nem tudo q tem em curso tem em conteudo
        /*Conteudo conteudo = new Curso();*/

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria X");
        mentoria.setDescricao("Realizada por Y");
        mentoria.setData(LocalDate.now()); //vai atribuir a data de criação

        //imprimindo
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Code Girls");
        bootcamp.setDescricao("BootCamp sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devShai = new Dev();
        devShai.setNome("Shai");
        devShai.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos" + devShai.getConteudosInscritos());
        devShai.progredir();
        devShai.progredir();
        devShai.progredir();
        System.out.println("\nConteudos Inscritos" + devShai.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos" + devShai.getConteudosConcluidos());
        System.out.println("XP:" + devShai.calcularTotalXp());

        Dev devNatan = new Dev();
        devNatan.setNome("Natan");
        devNatan.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos" + devNatan.getConteudosInscritos());
        devNatan.progredir();
        System.out.println("\nConteudos Inscritos" + devNatan.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos" + devShai.getConteudosConcluidos());
        System.out.println("XP:" + devNatan.calcularTotalXp());

    }
}