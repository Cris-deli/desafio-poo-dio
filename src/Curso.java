public class Curso {
    //Atributos
    private String titulo;

    private String descricao;

    private int cargaHoraria;

    // Construtor vazio
    public Curso() {
    }

    //gets e sets
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //ToString

    @Override
    public String toString() {
        return "{" + titulo + '\''  +  descricao + '\''  + cargaHoraria +  '}';
    }
}
