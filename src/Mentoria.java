import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    //Construror vazio

    public Mentoria() {
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" + getTitulo() + ' ' +  getDescricao()  + ' ' + " Data: " + data + '}';

    }
}
