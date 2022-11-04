import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C#");
        curso2.setDescricao("Curso de C#");
        curso2.setCargaHoraria(10);

        Conteudo conteudo1 = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de C#");
        mentoria2.setDescricao("Mentoria de C#");
        mentoria2.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria1);
//        System.out.println("------------------------------------------------");
//        System.out.println(curso2);
//        System.out.println(mentoria2);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Bootcamp Java iFood");
        bootcamp1.getConteudo().add(curso1);
        bootcamp1.getConteudo().add(curso2);
        bootcamp1.getConteudo().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp C# Developer");
        bootcamp2.setDescricao("Bootcampo Impacta");
        bootcamp1.getConteudo().add(curso1);
        bootcamp2.getConteudo().add(curso2);
        bootcamp2.getConteudo().add(mentoria2);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos do Rodrigo: " + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        System.out.println("Conteúdos Inscritos do Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos do Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------------------");

        Dev devGiovanna = new Dev();
        devGiovanna.setNome("Giovanna");
        devGiovanna.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos da Giovanna: " + devGiovanna.getConteudosInscritos());
        devGiovanna.progredir();
        System.out.println("Conteúdos Inscritos da Giovanna: " + devGiovanna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos da Giovanna: " + devGiovanna.getConteudosConcluidos());
        System.out.println("XP: " + devGiovanna.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos do Carlos" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("Conteúdos Inscritos do Carlos" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos do Carlos" + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------------------");

        Dev devMarly = new Dev();
        devMarly.setNome("Marly");
        devMarly.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos da Marly: " + devMarly.getConteudosInscritos());
        devMarly.progredir();
        System.out.println("Conteúdos Inscritos da Marly: " + devMarly.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos da Marly: " + devMarly.getConteudosConcluidos());
        System.out.println("XP: " + devMarly.calcularTotalXp());


    }
}
