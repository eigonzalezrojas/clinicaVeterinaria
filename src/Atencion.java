import java.util.Date;

public class Atencion {
    private int id;
    private Mascota mascota;
    private Date fecha;
    private String comentario;
    private Double costo;
    private Usuario usuario;

    public Atencion(int id, Mascota mascota, Date fecha, String comentario, Double costo, Usuario usuario) {
        this.id = id;
        this.mascota = mascota;
        this.fecha = fecha;
        this.comentario = comentario;
        this.costo = costo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
