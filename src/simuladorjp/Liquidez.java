package simuladorjp;
public class Liquidez {
     
private double cortoplazo1, medianoplazo2, largoplazo3, total1, totalhacienda, totaltesoro, cortoplazo4, medioplazo5, largoplazo6, cortoplazo7, medioplazo8, largoplazo9,fondoactivol, reqliquidez, icl;
 
    //Calculo de bono hacienda
    public double getCortoplazo1(double consumo, double cp, double fondonegocio) {
        cortoplazo1 = (fondonegocio * consumo * cp);
        return cortoplazo1;
    }
    public double getMedianoplazo2(double consumo, double fondonegocio, double mp) {
        medianoplazo2 = (fondonegocio * consumo * mp);
        return medianoplazo2;
    }
    public double getLargoplazo3(double consumo, double fondonegocio, double lp) {
        largoplazo3 = (fondonegocio * consumo * lp);
        return largoplazo3;
    }
      public double getTotalhacienda() {
        totalhacienda = cortoplazo1 + medianoplazo2 + largoplazo3;
        return totalhacienda;
    }
    public void setTotalhacienda(double totalhacienda) {
        this.totalhacienda = totalhacienda;
    }
    
    //Calculo de bonos tesoro
      public double getCortoplazo4(double cp, double consumo, double fondonegocio, double tipodecambio) {
        cortoplazo4 = ((fondonegocio * consumo * cp) / tipodecambio);
        return cortoplazo4;
    }
    public double getMedioplazo5(double consumo, double fondonegocio, double tipodecambio, double mp) {
        medioplazo5 = ((fondonegocio * consumo * mp) / tipodecambio);
        return medioplazo5;
    }
    public double getLargoplazo6(double tipodecambio, double lp, double fondonegocio, double consumo) {
         largoplazo6 = ((fondonegocio * consumo * lp) / tipodecambio);
        return largoplazo6;
    }
        public void setTotaltesoro(double totaltesoro) {
        this.totaltesoro = totaltesoro;
    }      
    public double getTotaltesoro() {
        totaltesoro = cortoplazo4 + medioplazo5 + largoplazo6;
        return totaltesoro;
    }
    
   //Calculo activos liquidos
   public double getFondoactivol(double tipodecambio) {
        fondoactivol = cortoplazo1 + (cortoplazo4 * tipodecambio);
        return fondoactivol;
    }
   
   //Calculo requerimiento liquidez
    public double getReqLiquidez(double fondonegocio) {
        reqliquidez = fondonegocio * 0.10; 
        return reqliquidez;
    }
    
    //Calculo de indice de Cobertura de liquidez
    public double getIcl(double fondoactivol, double reqliquidez) {
        icl = (fondoactivol / reqliquidez); 
       return icl;
    }
    
    //Calculo de ingreso colones
    public double getCortoplazo7(double MHMes, double TesoroMes, double tipodecambio) {
        cortoplazo7 = ((cortoplazo1 * MHMes) + (cortoplazo4 * TesoroMes * tipodecambio));
        return cortoplazo7;
    }
    public double getMedioplazo8(double MHAño, double TesoroAño, double tipodecambio) {
        medioplazo8 = ((medianoplazo2 * MHAño) + (medioplazo5 * TesoroAño * tipodecambio));
        return medioplazo8;
    }
    public double getLargoplazo9(double MH5años, double Tesoro5años, double tipodecambio) {  
        largoplazo9 = ((largoplazo3 * MH5años) + (largoplazo6 * Tesoro5años * tipodecambio));
        return largoplazo9;
    }
      public void setTotal1(double total1) {
        this.total1 = total1;
    }
    public double getTotal1() {
          total1 = cortoplazo7 + medioplazo8 + largoplazo9;
        return total1;
    } 
}