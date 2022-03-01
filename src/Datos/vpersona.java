package Datos;

public class vpersona {
    private int idpersona;
    private String nombre;
    private String apellido;
    private String telf;
    private String email;

    public vpersona() {
    }

    public vpersona(int idpersona, String nombre, String apellido, String telf, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telf = telf;
        this.email = email;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
