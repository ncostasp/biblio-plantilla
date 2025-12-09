import java.time.LocalDate;

public abstract class Item {
    private String titulo;
    private int año;
    private Genero genero;



    public Item(String titulo, int año, Genero genero) {
        this.titulo = titulo;
        setAño(año);
        this.genero = genero;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if(año < LocalDate.now().getYear()){
            this.año = año;
        } else {
            throw new IllegalArgumentException("El año no es válido");
        }
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }



    public abstract String info();

}
