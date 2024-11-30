public class Mascota {
    private int id;
    private String nombre;
    private String raza;
    private String especie;
    private String anioNacimiento;
    private double peso;
    private Duenio duenio;

    public Mascota(int id, String nombre, String raza, String especie, String anioNacimiento, double peso, Duenio duenio) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.duenio = duenio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(String anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
}
