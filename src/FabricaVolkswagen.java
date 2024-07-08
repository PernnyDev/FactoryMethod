public class FabricaVolkswagen implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new Gol();
    }
}