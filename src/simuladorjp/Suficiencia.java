package simuladorjp;
public class Suficiencia {    
 double riesgocredito, riesgoprecio, riesgooperativo, riesgodetipocambio;
 
    public double getRiesgocredito(double monedac,double monedac1,double tipodecambio,double monedah1,double monedahs1,double monedacorp,double monedacorp1) {
      riesgocredito = ((monedac + (monedac1 * tipodecambio)) * (0.10)) + ((monedah1 + (monedahs1 * tipodecambio)) * (0.02)) + (monedacorp + (monedacorp1 + tipodecambio)) * (0.05);
        return riesgocredito;
    }
    public double getRiesgoprecio(double futurointeres, double largoplazo3, double largoplazo9, double medianoplazo8, double medianoplazo2, double tipodecambio) {
         riesgoprecio = (((medianoplazo2 * 0.02) + (largoplazo3 * 0.10) + (medianoplazo8 * tipodecambio * 0.01) + (largoplazo9 * tipodecambio * 0.02))) - futurointeres;
        return riesgoprecio;
    }
      public double getRiesgodetipocambio(double activos, double capital, double futurocambio, double monedac1, double monedacorp1, double montoCreditoCorto, double monedahs1, double montoCreditoLargo, double montoCreditoMedio, double tipodecambio) {
         riesgodetipocambio = (((monedac1 + monedahs1 + monedacorp1) * tipodecambio) - (montoCreditoCorto + montoCreditoMedio + montoCreditoLargo) - (capital * (((monedac1 + monedahs1 + monedacorp1) * tipodecambio) / activos)) * 0.10) - futurocambio;
        return riesgodetipocambio;
    }
    public double getRiesgooperativo() {
        return riesgooperativo;
    }
}
