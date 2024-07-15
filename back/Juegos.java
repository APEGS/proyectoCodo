package gameList;

public class Juegos {
    private String nombreJuego;
    private String categoria;
    private int anho;

    public Juegos(int id, String nombreJuego, String categoria, int anho, String descripcion){
        this.id = id;
        this.nombreJuego = nombreJuego;
        this.categoria = categoria;
        this.anho = anho;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }
    public void setNombreJuego(String nombre) {
        this.nombre = nombreJuego;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAnho() {
        return anho;
    }
    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Juegos [id=" + id + ", nombreJuego=" + nombreJuego + ", anho=" + anho + ", genero=" + genero + ", descripcion="
        + descripcion + "]";
    }
}