public abstract class  Bicicleta {
    protected String codigo;
    protected double kilometraje;

    protected Bicicleta(String codigo, double kilometraje) {
        this.codigo = codigo;
        this.kilometraje = kilometraje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getkilometraje() {
        return kilometraje;
    }

    public void setkilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
}
