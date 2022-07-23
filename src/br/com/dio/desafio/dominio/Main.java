import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // polimorfismo

       /* Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();*/

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSilvia = new Dev();
        devSilvia.setNome("Silvia");
        devSilvia.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos" + devSilvia.getConteudosInscritos());

        devSilvia.progredir();
        devSilvia.progredir();
        System.out.println("-");
        System.out.println("conteudos Inscritos" + devSilvia.getConteudosInscritos());
        System.out.println("conteudos concluidos" + devSilvia.getConteudosConcluidos());
        System.out.println("xp:" + devSilvia.calcularTottalxp());

        System.out.println("-----------");

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos" + devFernando.getConteudosInscritos());
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("-");

        System.out.println("conteudos Inscritos" + devFernando.getConteudosInscritos());
        System.out.println("conteudos concluidos" + devFernando.getConteudosConcluidos());
        System.out.println("xp:" + devFernando.calcularTottalxp());






    }
}
