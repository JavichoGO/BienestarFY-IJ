package pe.edu.upc.bienestarfy.entities;

public class RespuestaSuscripcionPromedio {
    private String promedio;

    public RespuestaSuscripcionPromedio(String promedio) {
        this.promedio = promedio;
    }

    public RespuestaSuscripcionPromedio() {
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }
}
