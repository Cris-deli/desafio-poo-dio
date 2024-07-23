import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //objetos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso: Java");
        curso1.setDescricao("Descrição: Curso Básico Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso: JS");
        curso2.setDescricao("Descrição: Curso básico JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição: Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer.");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("Inscrevendo o Dev.");
        Dev devCris = new Dev();
        devCris.setNome("Cris");
        //inscrito
        devCris.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos  Cris :  " + devCris.getConteudosInscritos());

        //progredir
        devCris.progredir();
        System.out.println("Conteudos Inscritos Cris :  " + devCris.getConteudosInscritos());
        System.out.println("Conteudos Concluídos  Cris :  " + devCris.getConteudosConcluidos());

        Dev devTania = new Dev();
        devTania.setNome("Tânia");
        devTania.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos  Tânia :  " + devTania.getConteudosInscritos());

        devTania.progredir();
        System.out.println("Conteudos Inscritos Tânia :  " + devTania.getConteudosInscritos());
        System.out.println("Conteudos Concluídos  Tânia :  " + devTania.getConteudosConcluidos());


    }
}
