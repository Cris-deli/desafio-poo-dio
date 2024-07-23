public class Curso extends Conteudo {
    //Atributos

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // Construtor vazio
    public Curso() {
    }

    //gets e sets

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //ToString

    @Override
    public String toString() {
        return "{" + getTitulo() +  ' '  +   getDescricao() + ' ' + " Carga Horaria: " + cargaHoraria +  '}';

    }
}
