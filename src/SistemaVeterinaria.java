import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaVeterinaria {
    private Connection conexion;

    public SistemaVeterinaria() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/veterinaria";
            String usuario = "root";
            String contrasena = "";
            conexion = DriverManager.getConnection(url, usuario, contrasena);

            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }

    public void agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (rut, nombre, direccion, telefono, correo, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, usuario.getRut());
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getDireccion());
            stmt.setString(4, usuario.getTelefono());
            stmt.setString(5, usuario.getCorreo());
            stmt.setString(6, usuario.getPassword());
            stmt.executeUpdate();
            System.out.println("Usuario agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el usuario.");
            e.printStackTrace();
        }
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String rut = rs.getString("rut");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
                String password = rs.getString("password");
                usuarios.add(new Usuario(rut, nombre, direccion, telefono, correo, password));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los usuarios.");
            e.printStackTrace();
        }
        return usuarios;
    }

    public void agregarMascota(Mascota mascota) {
        String sql = "INSERT INTO mascotas (id, nombre, raza, especie, anio_nacimiento, peso, duenio_rut) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, mascota.getId());
            stmt.setString(2, mascota.getNombre());
            stmt.setString(3, mascota.getRaza());
            stmt.setString(4, mascota.getEspecie());
            stmt.setString(5, mascota.getAnioNacimiento());
            stmt.setDouble(6, mascota.getPeso());
            stmt.setString(7, mascota.getDuenio().getRut());
            stmt.executeUpdate();
            System.out.println("Mascota agregada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar la mascota.");
            e.printStackTrace();
        }
    }

    public List<Mascota> obtenerMascotas() {
        List<Mascota> mascotas = new ArrayList<>();
        String sql = "SELECT * FROM mascotas";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String raza = rs.getString("raza");
                String especie = rs.getString("especie");
                String anioNacimiento = rs.getString("anio_nacimiento");
                double peso = rs.getDouble("peso");
                String duenioRut = rs.getString("duenio_rut");

                Duenio duenio = new Duenio(duenioRut, "NombreDueño", "Dirección", "Teléfono", "Email");
                mascotas.add(new Mascota(id, nombre, raza, especie, anioNacimiento, peso, duenio));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las mascotas.");
            e.printStackTrace();
        }
        return mascotas;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }
}