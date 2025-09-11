public class FabricaBicicleta {

    public static Bicicleta crearBicicleta(String tipo, String codigo, double kilometraje){
        switch (tipo){
            case "convencional":
                return new BicicletaConvencional(codigo, kilometraje);
            case "electrica":
                return new BicicletaElectrica(codigo, kilometraje);
            default:
                throw new IllegalArgumentException("Tipo de bicicleta no existe: " + tipo);
        }

    }

}
