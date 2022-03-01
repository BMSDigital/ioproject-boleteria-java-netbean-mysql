
package Datos;

public class vtrenes {
    private int idtrenes;
    private String conductores;
    private String cod_tren;
    private String tiempo_salida;
    private String asientos_normal;
    private String asientos_prefe;

    public vtrenes() {
    }

    public vtrenes(int idtrenes, String conductores, String cod_tren, String tiempo_salida, String asientos_normal, String asientos_prefe) {
        this.idtrenes = idtrenes;
        this.conductores = conductores;
        this.cod_tren = cod_tren;
        this.tiempo_salida = tiempo_salida;
        this.asientos_normal = asientos_normal;
        this.asientos_prefe = asientos_prefe;
    }

    public int getIdtrenes() {
        return idtrenes;
    }

    public void setIdtrenes(int idtrenes) {
        this.idtrenes = idtrenes;
    }

    public String getConductores() {
        return conductores;
    }

    public void setConductores(String conductores) {
        this.conductores = conductores;
    }

    public String getCod_tren() {
        return cod_tren;
    }

    public void setCod_tren(String cod_tren) {
        this.cod_tren = cod_tren;
    }

    public String getTiempo_salida() {
        return tiempo_salida;
    }

    public void setTiempo_salida(String tiempo_salida) {
        this.tiempo_salida = tiempo_salida;
    }

    public String getAsientos_normal() {
        return asientos_normal;
    }

    public void setAsientos_normal(String asientos_normal) {
        this.asientos_normal = asientos_normal;
    }

    public String getAsientos_prefe() {
        return asientos_prefe;
    }

    public void setAsientos_prefe(String asientos_prefe) {
        this.asientos_prefe = asientos_prefe;
    }
}
