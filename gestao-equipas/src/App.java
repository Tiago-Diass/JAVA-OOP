public class App {
    public static void main(String[] args) throws Exception {
        Viatura v1 = new Viatura();

        v1.setTipo("Carro");
        v1.setnRodas(4);
        v1.setVelocidadeMax(200);

        System.out.println("Informações da Viatura:");
        v1.mostraInfo();
    }
}
