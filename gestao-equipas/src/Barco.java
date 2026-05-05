public class Barco extends Viatura{

    private boolean temPiscina;

    public Barco() {
        super("Barco", 0, 0, "");
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }
    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }
    
    @Override
    public void mostraInfo() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Número de Rodas: " + getnRodas());
        System.out.println("Velocidade Máxima: " + getVelocidadeMax());
        System.out.println("Matricula: " + getMatricula());
        if(temPiscina) System.out.println("Tem piscina: Sim :-)");
        else System.out.println("Tem piscina: Não :-(");
    }
}
