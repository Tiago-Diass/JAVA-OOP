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
    
}
