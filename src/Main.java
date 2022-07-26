import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Hava Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMilena = new Dev();
        devMilena.setNome("Milena");
        devMilena.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Milena" + devMilena.getConteudoInscritos());
        devMilena.progredir();
        devMilena.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Milena" + devMilena.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Milena" + devMilena.getConteudoConcluidos());
        System.out.println("XP:" + devMilena.calcularTotalXp());

        System.out.println("--------------");

        Dev devRoberta = new Dev();
        devRoberta.setNome("Roberta");
        devRoberta.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Roberta" + devRoberta.getConteudoInscritos());
        devRoberta.progredir();
        devRoberta.progredir();
        devRoberta.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Roberta" + devRoberta.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Roberta" + devRoberta.getConteudoConcluidos());
        System.out.println("XP:" + devRoberta.calcularTotalXp());
    }

}
