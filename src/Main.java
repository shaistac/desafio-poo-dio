import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        //nem = instanciando o objeto curso
        //a classe Curso é a planta da casa e o objetvo curso1 é a casa construída
        Curso curso1 = new Curso();
        curso1.setTitulo("BootCamp Code Girls");
        curso1.setDescricao("BootCamp sobre Java");
        curso1.setCargaHoraria(62);

        Curso curso2 = new Curso();
        curso2.setTitulo("BootCamp Impulso JavaScript Evolution");
        curso2.setDescricao("BootCamp sobre Front-End");
        curso2.setCargaHoraria(104);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria X");
        mentoria.setDescricao("Realizada por Y");
        mentoria.setData(LocalDate.now()); //vai atribuir a data de criação

        //imprimindo
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}