public class Revista extends Item {
    private int numero;
    private Frecuencia frecuencia;



    public Revista(String titulo, int año, Genero genero, int numero, Frecuencia frecuencia) {
        super(titulo, año, genero);
        this.numero = numero;
        this.frecuencia = frecuencia;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }



    @Override
    public String info() {
        return "Nombre de la revista: " + getTitulo();
    }
}
