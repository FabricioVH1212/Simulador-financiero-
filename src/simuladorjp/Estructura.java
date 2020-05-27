package simuladorjp;
public class Estructura {

    static Fondeo fondeo = new Fondeo();
    public static int operaciones,apalancamiento;
    public static long capital, financiamiento, fondonegocio,financiamientov;
    public static String calificacion,riesgo;//de aqui quite cap, apa,riesgo
    public static double consumo, hipotecario, corporativo, inversiones,carteras, enfoquenegocio = 0;
    private static long cap;//capital
    private static int apa,oper;//apalancamiento
    private static double cons,hipo,corp,inver;//porcentaje consumo, hipotecario, corporativo
     
     public Estructura() {
         riesgo = "";
    }
    public double getCapital() {
        return capital;
    }
    public String getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(String calificacion) {
        Estructura.calificacion = calificacion;
    }
    public double getFinanciamiento() {
        return financiamiento;
    }
    public void setFinanciamiento(long financiamiento) {
        Estructura.financiamiento = financiamiento;
    }
    public int Apalancamiento(int n) {

        if (n == 3) {
            calificacion = "AAA";
            return 3;
        } else if (n == 7) {
            calificacion = "BBB";
            return 7;
        } else {
            calificacion = "CCC";
            return 10;
        }
    }
    public long Financiamiento(long capital, int apalancamiento) {
        return (Apalancamiento(apalancamiento) * capital);   
    }
    public long FondoNegocio(long capital, int apalancamiento) {
        fondonegocio=Financiamiento(capital, apalancamiento) + capital;
        return fondonegocio;
    }
    public String ApetitoRiesgo(double consumo) {  
        if (consumo < 40) {
            return "Bajo";
        } else if (consumo >= 40 && consumo < 60) {
            return "Medio";
        } else {
            return "Alto";
        }   
    }
    public double PorcentajeOperacionaes(double opc) {

        switch (operaciones) {
            case 1:
                operaciones = 5;
                break;
            case 2:
                operaciones = 10;
                break;
            case 3:
                operaciones = 15;
                break;
        }
        return operaciones;
    }
    public double Carteras(double consumo, double hipotecario, double corporativo) {
        return consumo + hipotecario + corporativo;
    }
    public String EnfoqueNegocio(double enfoquenegocio) {
        if (enfoquenegocio == 100) {
            return "Enfoque de negocio: Correcto";
        } else {
            return "Enfoque de negocio: Incorrecto";
        }
    }
    public void setCap(long cap) {
        Estructura.cap = cap;
    }
    public  void setApa(int apa) {
        Estructura.apa = apa;
    }
    public void setCons(double cons){
        Estructura.cons = cons;
    }
    public void setHipo(double hipo){
        Estructura.hipo = hipo;
    }
    public void setCorp(double corp){
        Estructura.corp = corp;
    } 
     public void setInver(double inver) {
        Estructura.inver = inver;
    }
    public void setOper(int oper) {
        Estructura.oper = oper;
    }
    public String getEstructura() {
        
        String respuesta = ""; // variable que almacena todos los datos que posteriormente seran mostrados por un JOptionPane
        
        financiamiento= Financiamiento(cap, apa);
        carteras = Carteras(cons, hipo, corp);

       respuesta = "Capital = "+cap+ "\nApalancamiento = "+apa+ "\nFinanciamiento = "+financiamiento+ "\nFondo de Negocio = "+FondoNegocio(cap, apa)+ "\nFinanciamiento = "+financiamiento+ "\nCalificacion = "+calificacion+"\n"+"Porcentaje de Inversion = " +inver+ "%";
       
        switch (oper)
        {
            case 1:
                respuesta = respuesta + "\n Porcentaje de Operacion = 5%";
                break;    
            case 2:
                respuesta = respuesta + "\n Porcentaje de Operacion = 10%";
                break;
            case 3:   
                respuesta = respuesta + "\n Porcentaje de Operacion = 15%";
                break;
                
        }//fin switch  
       PorcentajeOperacionaes(oper);
       ApetitoRiesgo(cons);
       respuesta = respuesta+"\n Apetito de Riesgo: "+ApetitoRiesgo(cons);
       enfoquenegocio += carteras + inver + oper;
       respuesta = respuesta+"\n"+EnfoqueNegocio(enfoquenegocio);   
       return respuesta;
    }
    public int getApalancamiento() {
        return apalancamiento;
    }
    public void setApalancamiento(int apalancamiento) {
        Estructura.apalancamiento = apalancamiento;
    } 
    public String getRiesgo() {
        return riesgo;
    }
    public void setRiesgo(String riesgo) {
        Estructura.riesgo = riesgo;
    }
    public double getConsumo() {
        return consumo;
    }
    public double getHipotecario() {
        return hipotecario;
    }
    public double getCorporativo() {
        return corporativo;
    }
    public void setConsumo(double consumo) {
        Estructura.consumo = consumo;
    }
    public void setHipotecario(double hipotecario) {
        Estructura.hipotecario = hipotecario;
    }
    public void setCorporativo(double corporativo) {
        Estructura.corporativo = corporativo;
    }
    public long getFondonegocio() {
        return fondonegocio;
    }
    public void setFondonegocio(long fondonegocio) {
        Estructura.fondonegocio = fondonegocio;
    }
    public double getInversiones() {
        return inversiones;
    }
    public void setInversiones(double inversiones) {
        Estructura.inversiones = inversiones;
    }
    public int getOperaciones() {
        return operaciones;
    }
    public void setOperaciones(int operaciones) {
        Estructura.operaciones = operaciones;
    }

   
    
}
