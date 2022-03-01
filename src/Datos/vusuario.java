package Datos;

public class vusuario extends vpersona{
    private String user;
    private String pass;
    private String nivel;
    private String privilegio;

    public vusuario() {
    }

    public vusuario(String user, String pass, String nivel, String privilegio) {
        this.user = user;
        this.pass = pass;
        this.nivel = nivel;
        this.privilegio = privilegio;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }
}
