public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;

    private int fecharegistro;

    public Usuario(int id, String nombre, String email, String password, int fecharegistro) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fecharegistro = fecharegistro;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public int getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(int fecharegistro) {
        this.fecharegistro = fecharegistro;
    }


    }




