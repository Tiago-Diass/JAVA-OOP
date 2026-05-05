public class Viatura {
    private String tipo;
    private int nRodas;
    private int velocidadeMax;

    
    public Viatura() {
    }

    public Viatura(String tipo, int nRodas, int velocidadeMax) {
        this.tipo = tipo;
        this.nRodas = nRodas;
        this.velocidadeMax = velocidadeMax;
    }


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnRodas() {
        return nRodas;
    }
    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }


    public void mostraInfo() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Número de Rodas: " + this.nRodas);
        System.out.println("Velocidade Máxima: " + this.velocidadeMax);
    }

}
