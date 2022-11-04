import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C#");
        curso2.setDescricao("Curso de C#");
        curso2.setCargaHoraria(25);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de C#");
        mentoria2.setDescricao("Mentoria de C#");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println("------------------------------------------------");
        System.out.println(curso2);
        System.out.println(mentoria2);

    }
}
