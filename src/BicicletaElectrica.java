public class BicicletaElectrica extends Bicicleta implements IBicicleta {

    private final double precioHora = 2000;

    public BicicletaElectrica(String codigo, double kilometraje) {
        super(codigo, kilometraje);
    }

    @Override
    public String tipo(){
        return "electrica";
    }
}
