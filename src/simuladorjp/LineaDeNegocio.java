 package simuladorjp;
import javax.swing.JOptionPane;

public class LineaDeNegocio {
    
     //ingresos de usuario
    private double capital,apalancamiento,financiamiento,requerimiento,spreedcd, spreedhd, spreedcorpd, spreedcc, spreedhc, spreedcorpc, consumo, hipotecario;
    private double MHMes, TesoroMes, MHAño,TesoroAño,MH5años, Tesoro5años;

    //operaciones 
    private double totalencaje, asignacion, monedac, monedach1, tipodecambio, asignacionh, monedac1, monedah1, monedahs1,
            asignacioncorp, asignacioncorp1, monedacorp, monedacorp1,cp,mp,lp,cons;
    
    public String TesoroMesS,MHAñoS,TesoroAñoS,MH5añosS,Tesoro5añosS,cpS,mpS,calificacion,riesgo;
    
 public LineaDeNegocio() {

    }
    Estructura estructura = new Estructura();
    
    public String getest(double capital, int apalancamiento, double fondonegocio, String calificacion, String riesgo) {
        String salida = "";
        salida = "El capital base es:  " + estructura.getCapital() +"\n El apalancamiento es:   " + estructura.getApalancamiento()+"\n El fondo de negocio es   " + estructura.getFondonegocio()+"\n La calificacion bancaria es:   " + estructura.getCalificacion()+" \n El apetito de riesgo es:   " + estructura.ApetitoRiesgo(consumo);
        return salida;
    }

    public void getTasasActivas(double fondonegocio, double requerimiento, double capital) {
        totalencaje = (fondonegocio - requerimiento);
    }

    public String getConsumo(double consumoEstructura, double totalencaje,double consumo,double monedac,double monedac1,double asignacion){
        
        String salida = "";
        
        asignacion = (100-consumo)/100;

        //Porcentaje de asignacion 
        salida = salida + "\n El  porcentaje de asignacion es:  " + consumo;
        
        //valor de la moneda en colones
        monedac = ((consumoEstructura/100) * (consumo/100) * totalencaje);
        salida = salida+" \n El valor de la moneda en colones es: " + monedac;

        //valor de la moneda en dolares
        monedac1 = (((consumoEstructura/100) * asignacion * totalencaje) / tipodecambio);
        salida = salida+"\n El valor de la moneda en dolares es: " + monedac1 ;

        return salida;

    }

    public String getHipotecario(double hipotecarioEstructura,double asignacionh,double hipotecario,double monedah1,double totalencaje, double monedahs1,double tipodecambio) {
        
        String salida = "";
        asignacionh = (100-hipotecario)/100;
        
        //Porcentaje de asignación 
        salida = salida + "\n El  porcentaje de asignacion es:  " + hipotecario;
        //Valor de la moneda en colones
        monedah1 = (hipotecarioEstructura/100) * (hipotecario/100) * totalencaje;
        salida = salida + "\n El valor de la moneda en colones es: " + monedah1;
        //Valor de la moneda en dolares
        monedahs1 = ((hipotecarioEstructura/100) * asignacionh * totalencaje) / tipodecambio;
        salida = salida + "\n El valor de la moneda en dolares es: " + monedahs1;
        
        return salida;
    }

    public String getCorporativo(double corporativoEstructura,double asignacioncorp1,double totalencaje,double monedacorp,double monedacorp1,double tipodecambio,double asignacioncorp) {
        
        String salida = "";
        asignacioncorp1 = (100-asignacioncorp)/100;
        
        //Porcentaje de asignación corporativo
        salida = salida+"\n El  porcentaje de asignacion es:"+ asignacioncorp;
        //valor de la moneda en colones
        monedacorp = ((corporativoEstructura/100) * (asignacioncorp/100) * totalencaje);
        salida = salida + "\n El valor de la moneda en colones es: " + monedacorp;
        //valor de la moneda en dolares
        monedacorp1 = ((corporativoEstructura/100) * (asignacioncorp1/100) * totalencaje) / tipodecambio;
        salida = salida +"\n El valor de la moneda en dolares es: " + monedacorp1;
        
        
        return salida;
    }
    
    public void getOtros(){

    }
    public String getInversiones(double inversiones){

        lp= (100-(cp+mp));
        if (lp >0 || lp <100)
            return "El valor es correcto";
            
        else 
            return "El valor es incorrecto";
        
    } 
//Getters y Seterrs
    public double getLp() {
        return lp;
    }
    public void setLp(double lp) {
        this.lp = lp;
    }
    public double getMp() {
        return mp;
    }
    public void setMp(double mp) {
        this.mp = mp;
    }
    public double getCp() {
        return cp;
    }
    public void setCp(double cp) {
        this.cp = cp;
    }
    public void setMHMes(double MHMes) {
        this.MHMes = MHMes;
    }
    public void setTesoroMes(double TesoroMes) {
        this.TesoroMes = TesoroMes;
    }
    public void setMHAño(double MHAño) {
        this.MHAño = MHAño;
    }
    public void setTesoroAño(double TesoroAño) {
        this.TesoroAño = TesoroAño;
    }
    public void setMH5años(double MH5años) {
        this.MH5años = MH5años;
    }
    public void setTesoro5años(double Tesoro5años) {
        this.Tesoro5años = Tesoro5años;
    }
    public double getMHMes() {
        return MHMes;
    }
    public double getTesoroMes() {
        return TesoroMes;
    }
    public double getMHAño() {
        return MHAño;
    }
    public double getTesoroAño() {
        return TesoroAño;
    }
    public double getMH5años() {
        return MH5años;
    }
    public double getTesoro5años() {
        return Tesoro5años;
    }
    public double getSpreedcd() {
        return spreedcd;
    }
    public double getSpreedhd() {
        return spreedhd;
    }
    public double getSpreedcorpd() {
        return spreedcorpd;
    }
    public double getSpreedcc() {
        return spreedcc;
    }
    public double getSpreedhc() {
        return spreedhc;
    }
    public double getSpreedcorpc() {
        return spreedcorpc;
    }
    public void setSpreedcd(double spreedcd) {
        this.spreedcd = spreedcd;
    }
    public void setSpreedhd(double spreedhd) {
        this.spreedhd = spreedhd;
    }
    public void setSpreedcorpd(double spreedcorpd) {
        this.spreedcorpd = spreedcorpd;
    }
    public void setSpreedhc(double spreedhc) {
        this.spreedhc = spreedhc;
    }
    public void setSpreedcorpc(double spreedcorpc) {
        this.spreedcorpc = spreedcorpc;
    }
    public void setcapital(double capital) {
        this.capital = capital;
        JOptionPane.showMessageDialog(null, capital);        
    } 

    public double getMonedac() {
        return monedac;
    }

    public void setMonedac(double monedac) {
        this.monedac = monedac;
    }

    public double getMonedach1() {
        return monedach1;
    }

    public void setMonedach1(double monedach1) {
        this.monedach1 = monedach1;
    }

    public double getMonedac1() {
        return monedac1;
    }

    public void setMonedac1(double monedac1) {
        this.monedac1 = monedac1;
    }

    public double getMonedah1() {
        return monedah1;
    }

    public void setMonedah1(double monedah1) {
        this.monedah1 = monedah1;
    }

    public double getMonedahs1() {
        return monedahs1;
    }

    public void setMonedahs1(double monedahs1) {
        this.monedahs1 = monedahs1;
    }

    public double getMonedacorp() {
        return monedacorp;
    }

    public void setMonedacorp(double monedacorp) {
        this.monedacorp = monedacorp;
    }

    public double getMonedacorp1() {
        return monedacorp1;
    }

    public void setMonedacorp1(double monedacorp1) {
        this.monedacorp1 = monedacorp1;
    }
    public double getcapital() {
        return capital;
    }
    public double getApalancamiento() {
        return apalancamiento;
    }
    public void setApalancamiento(double apalancamiento) {
        this.apalancamiento = apalancamiento;
    }
    public void setFinanciamiento(double financiamiento) {
        this.financiamiento = financiamiento;
    }
    public double getFinanciamiento() {
        return financiamiento;
    }
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }
    public String getCalificacion() {
        return calificacion;
    }
    public String getRiesgo() {
        return riesgo;
    }
    public double getTotalencaje() {
        return totalencaje;
    }
    public void setTotalencaje(double totalencaje) {
        this.totalencaje = totalencaje;
    }
    public double getTipodecambio() {
        return tipodecambio;
    }
    public void setTipodecambio(double tipodecambio) {
        this.tipodecambio = tipodecambio;
    }
    public void setConsumo(double consumo ){
        this.consumo = consumo;
    }
    public void setHipotecario(double hipotecario ){
        this.hipotecario = hipotecario;
    }
    public void setCorporativo(double asignacioncorp ){
        this.asignacioncorp = asignacioncorp;
    }
    public double getRequerimiento() {
        return requerimiento;
    }
    public void setSpreedcc(double spreedcc){
        this.spreedcc = spreedcc;
    }
   
}    
