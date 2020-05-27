package simuladorjp;
public class Carteras {
 
    //Variables: Calculo de ingreso por estimaciones en colones₡
    public double consumoc, hipotecarioc, corporativoc, totalc,hipotecarioc1, corporativoc1, totalc1 ;

    //Variables: Calculo de gastos por estimaciones en dolares$ 
    public double consumod, hipotecariod, corporativod, totald, hipotecariod1, corporativod1, totald1;

    //Calculo de ingreso por estimaciones en colones     
    public double getConsumoc(double monedac, double spreedcc, double tasaColones) {
        consumoc = monedac * (tasaColones + spreedcc);
        return consumoc;
    }
    public double getHipotecarioc(double monedah1, double spreedhc, double tasaColones) {
        hipotecarioc = monedah1 * (tasaColones + spreedhc);
        return hipotecarioc;
    }
    public double getCorporativoc(double monedacorp, double spreedcorpc, double tasaColones) {
        corporativoc = monedacorp * (tasaColones + spreedcorpc);
        return corporativoc;
    }
    public double getTotalc() {
         totalc = (consumoc + hipotecarioc + corporativoc);
        return totalc;
    }
    //Calculo de ingreso por estimaciones en dolares 
    public double getConsumod(double monedac1, double spreedcd, double tasaDolares) {
         consumod = monedac1 * (tasaDolares + spreedcd);
         return consumod;
    }
    public double getHipotecariod(double monedahs1, double spreedhd, double tasaDolares) {
        hipotecariod = monedahs1 * (tasaDolares + spreedhd); 
        return hipotecariod;
    }
    public double getCorporativod(double monedacorp1, double spreedcord, double tasaDolares) {
        corporativod = monedacorp1 * (tasaDolares + spreedcord);
        
        return corporativod;
    }
    public double getTotald() {
        totald = (consumod + hipotecariod + corporativod);
        return totald;
    }
   }
    
  
 



