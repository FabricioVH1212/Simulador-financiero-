package simuladorjp;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Fondeo {
Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
private String tasaco,tasado;
private double tasaDolares, tasaColones, tasaRiesgo5, tasaRiesgo10, tasaRiesgo15;
private double montoCorto, montoMedio, montoLargo, costoCorto, costoMedio, costoLargo, requerimiento,
            montoCreditoCorto, montoCreditoMedio, montoCreditoLargo, costoCreditoCorto, costoCreditoMedio, costoCreditoLargo;
    ;
    public Fondeo() {
    }
    public void TasasPorCategoriaRiesgo(String calificacion) {
    
        if (calificacion == "AAA") {
            tasaRiesgo5 = +tasaDolares + 1.5 + 0.5;
            tasaRiesgo10 = +tasaDolares + 2.5 + 0.5;
            tasaRiesgo15 = +tasaDolares + 3.5 + 0.5;
        } 
        
        else if (calificacion == "BBB") {
            tasaRiesgo5 = +tasaDolares  + 1.5 + 1;
            tasaRiesgo10 = +tasaDolares  + 2.5 + 1;
            tasaRiesgo15 = +tasaDolares + 3.5 + 1;
        }
        
        else {
            tasaRiesgo5 = +tasaDolares + 1.5 + 4;
            tasaRiesgo10 = +tasaDolares + 2.5 + 4;
            tasaRiesgo15 = +tasaDolares + 3.5 + 4;
        }
        
    }
    public String Asignacion(double asignacion) {
        if (asignacion < 0 || asignacion > 100) {
            return "% Asignacion: Correcto";
        } else {
            return "% Asignacion: Incorrecto";
        }
    }
    public String FondeoCaptaciones(double financiamiento) {

        double fondeoCaptaciones = 0.50, asignacionCorto = 0.35, asignacionMedio = 0.45, asignacionLargo = 0.20;
        String salida = "";
        
        montoCorto = asignacionCorto * fondeoCaptaciones * financiamiento;
        montoMedio = asignacionMedio * fondeoCaptaciones * financiamiento;
        montoLargo = asignacionLargo * fondeoCaptaciones * financiamiento;

        costoCorto = montoCorto * 0.1375;
        costoMedio = montoMedio * 0.16;
        costoLargo = montoLargo * 0.195;

        //Fondeo Captaciopnes
        //Tipo Pasivo Corto Plazo
        salida = salida+"Fondeo Captaciones \n Tipo Pasivo Corto Plazo \n"+ "% Asignacion: " + (asignacionCorto*100) + "\n"+ "Monto Colones: " + montoCorto + "\n"+ "Costo Anual Colones: " + costoCorto;

        //salida Tipo Pasivo Mediano Plazo
        salida = salida+"\n Tipo Pasivo Mediano Plazo \n" + "% Asignacion: " + (asignacionMedio*100) + "\n"+ "Monto Colones: " + montoMedio + "\n"+ "Costo Anual Colones: " + costoMedio;
        
        //Tipo Pasivo Largo Plazo
        salida = salida+"\n Tipo Pasivo Largo Plazo \n"+ "% Asignacion: " + (asignacionLargo*100) + "\n"+ "Monto Colones: " + montoLargo + "\n"+ "Costo Anual Colones: " + costoLargo;
        
        //a salida se le suma el resultado del método asignacion que retornaun string
        salida = salida+"\n"+Asignacion(asignacionLargo);
        
        requerimiento = (montoCorto + montoMedio + montoLargo) * 0.15;
                
        salida=salida+" \n Requerimiento: " + requerimiento;
        
        return salida;

    }

    public String FondeoCredito(double financiamiento) {

        double fondeoCredito = 0.50, asignacionCorto = 0.30, asignacionMedio = 0.40, asignacionLargo = 0.30;
        String salida = "";
        montoCreditoCorto = asignacionCorto * fondeoCredito * financiamiento;
        montoCreditoMedio = asignacionMedio * fondeoCredito * financiamiento;
        montoCreditoLargo = asignacionLargo * fondeoCredito * financiamiento;

        costoCreditoCorto = montoCreditoCorto * tasaRiesgo5;
        costoCreditoMedio = montoCreditoMedio * tasaRiesgo10;
        costoCreditoLargo = montoCreditoLargo * tasaRiesgo15;

        //Fondeo de Credito 
        //Tipo Pasivo Corto Plazo
        salida = salida+" Tipo Pasivo Corto Plazo \n"+ "% Asignacion: " + (asignacionCorto*100) + "\n" +"Monto Colones: " + montoCreditoCorto + "\n" +"Costo Anual Colones: " + costoCreditoCorto;
   
        //Tipo Pasivo Medio Plazo
        salida = salida+ "\n Tipo Pasivo Medio Plazo \n"+ "% Asignacion: " + (asignacionMedio*100) + "\n" +"Monto Colones: " + montoCreditoMedio + "\n" +"Costo Anual Colones: " + costoCreditoMedio;

        //Tipo Pasivo Largo Plazo
        salida = salida+"\n Tipo Pasivo Largo Plazo \n" + "% Asignacion: " + (asignacionLargo*100) + "\n" +"Monto Colones: " + montoCreditoLargo + "\n" + "Costo Anual Colones: " + costoCreditoLargo;
       
       salida = salida + "\n"+Asignacion(asignacionLargo);
       
       return salida;
    }

    public String getFondeo(String calificacion, double financiamiento) {

       String salida = "";
        JOptionPane.showMessageDialog(null,"La tasa en Colones es de: " + tasaColones + "%\n"
                + "La tasa en Dolares es de: " + tasaDolares + "%","Fondeo",JOptionPane.INFORMATION_MESSAGE, I);
        //para mostrar los valores ingresados
        salida = salida+"La tasa en Colones es de: " + tasaColones + "%\n"+ "La tasa en Dolares es de: " + tasaDolares + "%";
        
        TasasPorCategoriaRiesgo(calificacion);
        
        JOptionPane.showMessageDialog(null,"Creditos Internacionales $ 5 años: " + tasaRiesgo5 + "%\n"
                + "Creditos Internacionales $ 10 años: " + tasaRiesgo10 + "%\n"
                + "Creditos Internacionales $ 15 años: " + tasaRiesgo15 + "%","Fondeo",JOptionPane.INFORMATION_MESSAGE, I);
        
        //Crédoitos internacionales a 5,10,15 años
        salida = salida+"Creditos Internacionales $ 5 años: " + tasaRiesgo5 + "%\n" + "Creditos Internacionales $ 10 años: " + tasaRiesgo10 + "%\n"+ "Creditos Internacionales $ 15 años: " + tasaRiesgo15 + "%";
        
        //se agrega Fondeo de Capacitaciones y Fondeo de Crédito a la salida
        
        salida = salida +" \n"+FondeoCaptaciones(financiamiento)+"\n"+FondeoCredito(financiamiento);

        
        
        return salida;

    }

    public double getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(double requerimiento) {
        this.requerimiento = requerimiento;
    }

    public double getTasaDolares() {
        return tasaDolares;
    }

    public void setTasaDolares(double tasaDolares) {
        this.tasaDolares = tasaDolares;
    }

    public double getTasaColones() {
        return tasaColones;
    }

    public void setTasaColones(double tasaColones) {
        this.tasaColones = tasaColones;
    }

    public double getMontoCorto() {
        return montoCorto;
    }

    public double getCostoMedio() {
        return costoMedio;
    }

    public double getCostoLargo() {
        return costoLargo;
    }

    public void setMontoCorto(double montoCorto) {
        this.montoCorto = montoCorto;
    }

    public void setCostoMedio(double costoMedio) {
        this.costoMedio = costoMedio;
    }

    public void setCostoLargo(double costoLargo) {
        this.costoLargo = costoLargo;
    }

    public double getMontoCreditoCorto() {
        return montoCreditoCorto;
    }

    public double getMontoCreditoMedio() {
        return montoCreditoMedio;
    }

    public double getMontoCreditoLargo() {
        return montoCreditoLargo;
    }

    public void setMontoCreditoCorto(double montoCreditoCorto) {
        this.montoCreditoCorto = montoCreditoCorto;
    }

    public void setMontoCreditoMedio(double montoCreditoMedio) {
        this.montoCreditoMedio = montoCreditoMedio;
    }

    public void setMontoCreditoLargo(double montoCreditoLargo) {
        this.montoCreditoLargo = montoCreditoLargo;
    }

    public double getCostoCreditoCorto() {
        return costoCreditoCorto;
    }

    public double getCostoCreditoMedio() {
        return costoCreditoMedio;
    }

    public double getCostoCreditoLargo() {
        return costoCreditoLargo;
    }

    public void setMontoMedio(double montoMedio) {
        this.montoMedio = montoMedio;
    }

    public void setMontoLargo(double montoLargo) {
        this.montoLargo = montoLargo;
    }

    public void setCostoCorto(double costoCorto) {
        this.costoCorto = costoCorto;
    }

    public void setCostoCreditoCorto(double costoCreditoCorto) {
        this.costoCreditoCorto = costoCreditoCorto;
    }

    public void setCostoCreditoMedio(double costoCreditoMedio) {
        this.costoCreditoMedio = costoCreditoMedio;
    }

    public void setCostoCreditoLargo(double costoCreditoLargo) {
        this.costoCreditoLargo = costoCreditoLargo;
    }

    public double getMontoMedio() {
        return montoMedio;
    }

    public double getMontoLargo() {
        return montoLargo;
    }

    public double getCostoCorto() {
        return costoCorto;
    }
 

}

