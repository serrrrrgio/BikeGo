import java.util.ArrayList;
import java.util.List;

public class BikeGo {
    private List<Usuario> usuarios;
    private List<Bicicleta> bicicletas;
    private List<Estacion> estaciones;
    private String nombre;

    private static BikeGo instance;

    public BikeGo(String nombre) {
       this.usuarios = new ArrayList<>();
       this.bicicletas = new ArrayList<>();
       this.estaciones = new ArrayList<>();
       this.nombre = nombre;
    }

    public static BikeGo getInstance(){
        if (instance == null){
            instance = new BikeGo("BikeGo");
        }
        return instance;
    }

}
