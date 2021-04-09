/**
 * Classe Compte
  */
public class Compte {
 
    //Atributs
    private String titular;
    private double quantitat;
 
    //Constructors
    public Compte(String nomTitularRebut) {
        this(nomTitularRebut, 0); // Sobrecarga
    }
 
    public Compte(String nomTitularRebut, double quantitatRebuta) {
        this.titular = nomTitularRebut;
        //Si la quantitatRebuta es menor que cero, el posem  a cero
        if (quantitatRebuta < 0) {
            this.quantitat = 0;
        } else {
            this.quantitat = quantitatRebuta;
        }
    }
 
    //M�todes GETTERs
    public String getTitular() {
        return this.titular;
    }
 
    public double getQuantitat() {
        return this.quantitat;
    }

    //M�todes SETTERs
    public void setTitular(String nomTitularRebut) {
        this.titular = nomTitularRebut;
    }
 
    public void setQuantitat(double quantitatRebuda) {
        this.quantitat = quantitatRebuda;
    }
 
    /**
     * ingressar(double quantitatRebuda):
     *   ingressar� una quantitat al compte.
     *   Si la quantitat �s negativa, no far� res.
     * @param quantitatRebuda
     */
    public void ingressar(double quantitatRebuda) {
        if(quantitatRebuda > 0){
            this.quantitat += quantitatRebuda;
            // this.quantitat = this.quantitat + quantitatRebuda;
        }
    }
 
    /**
     * retirar(double quantitatARetirar):
     *   retirar� una quantitat del compte.
     *   Si restant la quantitatARetirar al saldo,
     *   el saldo qued�s negatiu, la quantitat
     *   del compte passar� a ser 0.
     * @param quantitat
     */
    public void retirar(double quantitatARetirar) {
        if (this.quantitat - quantitatARetirar < 0) {
            this.quantitat = 0;
        } else {
            this.quantitat -= quantitatARetirar;
        }
    }
 
    /**
     * Retorna l'estat de l'objete
     * @return
     */
    @Override
    public String toString() {
        return "El titular " 
            + this.titular
            + " t� "
            + this.quantitat
            + " euros al seu compte";
    }
 
}