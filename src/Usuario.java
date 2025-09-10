import java.time.LocalDate;

public class Usuario {
    private String Nombre;
    private String Cedula;
    private String Correo;
    private String Telefono;

    private Usuario (Builder builder) {
        this.Nombre = builder.Nombre;
        this.Cedula = builder.Cedula;
        this.Correo = builder.Correo;
        this.Telefono = builder.Telefono;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Cedula='" + Cedula + '\'' +
                ", Correo='" + Correo + '\'' +
                ", telefono='" + Telefono + '\'' +
                '}';
    }
    public static class Builder {
        private String Nombre;
        private String Cedula;
        private String Correo;
        private String Telefono;

        public Builder Nombre(String Nombre) {
            this.Nombre = Nombre;
            return this;
        }
        public Builder Cedula(String Cedula) {
            this.Cedula = Cedula;
            return this;
        }
        public Builder Correo(String Correo) {
            this.Correo = Correo;
            return this;
        }
        public Builder Telefono(String Telefono) {
            this.Telefono = Telefono;
            return this;
        }
    }
}
