public class Mascota {
    public int id;
    public String nombre;
    public String raza;
    public String especie;
    public String anioNacimiento;
    public double peso;
    public Duenio duenio;

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
