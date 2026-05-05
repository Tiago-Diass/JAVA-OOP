public class Viatura {
    private String tipo;
    private int nRodas;
    private int velocidadeMax;
    private String matricula;

    
    public Viatura() {
    }

    public Viatura(String tipo, int nRodas, int velocidadeMax, String matricula) {
        this.tipo = tipo;
        this.nRodas = nRodas;
        this.velocidadeMax = velocidadeMax;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void mostraInfo() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Número de Rodas: " + this.nRodas);
        System.out.println("Velocidade Máxima: " + this.velocidadeMax);
        System.out.println("Matricula: " + this.matricula);
    }

}
