import java.time.LocalDate;

public class Alquiler {
    private LocalDate FechaInicio;
    private LocalDate FechaFinal;
    private double precioTotal;

    public Alquiler(LocalDate fechaInicio, LocalDate fechaFinal, double precioTotal) {
        this.FechaInicio = fechaInicio;
        this.FechaFinal = fechaFinal;
        this.precioTotal = precioTotal;
    }
    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public LocalDate getFechaFinal() {
        return FechaFinal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        FechaFinal = fechaFinal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "FechaInicio=" + FechaInicio +
                ", FechaFinal=" + FechaFinal +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
