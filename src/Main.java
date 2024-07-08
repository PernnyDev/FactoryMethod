public class Main {
    public static void main(String[] args) {
        FabricaCarro fabricaFiat = new FabricaFiat();
        Carro carro1 = fabricaFiat.criarCarro();
        carro1.exibirInfo();

        FabricaCarro fabricaVolkswagen = new FabricaVolkswagen();
        Carro carro2 = fabricaVolkswagen.criarCarro();
        carro2.exibirInfo();
    }
}