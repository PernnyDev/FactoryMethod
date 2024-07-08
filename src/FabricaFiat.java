public class FabricaFiat implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new Palio();
    }
}