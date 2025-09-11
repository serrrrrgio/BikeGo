public class BicicletaConvencional extends Bicicleta implements IBicicleta{

    private final double precioHora = 1000;

    public BicicletaConvencional(String codigo, double kilometraje) {
        super(codigo, kilometraje);
    }

    @Override
    public String tipo(){
        return "convencional";
    }
}
