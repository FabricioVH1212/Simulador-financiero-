package simuladorjp;

public class Coberturas {
    
public double contratos1, preciofuturo1, costooperativo1, contratosadquiridos1, futurointeres;
public double contratos2, preciofuturo2, costooperativo2, contratosadquiridos2, futurocambio;

public String calificacion, riesgo,contratos1S,preciofuturo1S,costooperativo1S,contratosadquiridos1S,contratos2S;
public String preciofuturo2S,costooperativo2S,contratosadquiridos2S;
 
//Calculo de tasas
public double getTasasInteres(){  
   futurointeres=+(contratos1*contratosadquiridos1)/2;
   return futurointeres;
}
public double getTasasCambio(){
    futurocambio=+(contratos2*contratosadquiridos2)/4;
   return futurocambio;
}
//Getters y Setters
 public double getContratos1() {
        return contratos1;
    }
    public void setContratos1(double contratos1) {
        this.contratos1 = contratos1;
    }
    public double getPreciofuturo1() {
        return preciofuturo1;
    }
    public void setPreciofuturo1(double preciofuturo1) {
        this.preciofuturo1 = preciofuturo1;
    }
    public double getCostooperativo1() {
        return costooperativo1;
    }
    public void setCostooperativo1(double costooperativo1) {
        this.costooperativo1 = costooperativo1;
    }
    public double getContratosadquiridos1() {
        return contratosadquiridos1;
    }
    public void setContratosadquiridos1(double contratosadquiridos1) {
        this.contratosadquiridos1 = contratosadquiridos1;
    }
    public double getFuturointeres() {
        return futurointeres;
    }
    public void setFuturointeres(double futurointeres) {
        this.futurointeres = futurointeres;
    }
    public double getContratos2() {
        return contratos2;
    }
    public void setContratos2(double contratos2) {
        this.contratos2 = contratos2;
    }
    public double getPreciofuturo2() {
        return preciofuturo2;
    }
    public void setPreciofuturo2(double preciofuturo2) {
        this.preciofuturo2 = preciofuturo2;
    }
    public double getCostooperativo2() {
        return costooperativo2;
    }
    public void setCostooperativo2(double costooperativo2) {
        this.costooperativo2 = costooperativo2;
    }
    public double getContratosadquiridos2() {
        return contratosadquiridos2;
    }
    public void setContratosadquiridos2(double contratosadquiridos2) {
        this.contratosadquiridos2 = contratosadquiridos2;
    }
    public double getFuturocambio() {
        return futurocambio;
    }
    public void setFuturocambio(double futurocambio) {
        this.futurocambio = futurocambio;
    }

}
