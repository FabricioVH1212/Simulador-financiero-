package simuladorjp;
import javax.swing.JTable;

public class TablasMora {

    public void setTipodeCambio(double tipodecambio) {
        this.tipodecambio = tipodecambio;
        
    }
 
    private String operacion,tcambio;
    private double consumom1, hipotecariom1,corporativom, consumom2, hipotecariom2,corporativom2;
    private double consumom3, hipotecariom3,corporativom3, consumom1d, hipotecariom1d,corporativom1d;
    private double consumom2d, hipotecariom2d,corporativom2d, consumom3d, hipotecariom3d,corporativom3d;
    private double consumom4, hipotecariom4,corporativom4, consumom5, hipotecariom5,corporativom5;
    private double consumom6, hipotecariom6,corporativom6, consumom4d, hipotecariom4d,corporativom4d;
    private double consumom5d, hipotecariom5d,corporativom5d, consumom6d, hipotecariom6d,corporativom6d;
    private double consumom7, hipotecariom7,corporativom7, consumom8, hipotecariom8,corporativom8;
    private double consumom9, hipotecariom9,corporativom9, consumom7d, hipotecariom7d,corporativom7d;
    private double consumom8d, hipotecariom8d,corporativom8d, consumom9d, hipotecariom9d,corporativom9d;
    
    private int oper, opera;
    private double cons1,hip1,corp1,cons2,hip2,corp2,cons3,hip3,corp3,fondon, fondeo,tencaje,pconsumo,phipot,pcorp,lineac,lineah,lineacorp;
    private double montoc, montom, montol, financiamiento, tipodecambio, lineacd,lineahd,lineacorpd;
    private String consumo1,hipotecario1, corporativo1,consumo2,hipotecario2, corporativo2,consumo3,hipotecario3, corporativo3;
    private String consumo4,hipotecario4, corporativo4,consumo5,hipotecario5, corporativo5,consumo6,hipotecario6, corporativo6;
    private String consumo7,hipotecario7, corporativo7,consumo8,hipotecario8, corporativo8,consumo9,hipotecario9, corporativo9;
   
    
    public TablasMora(){   
    }

   
public JTable getobtenertmora( double consumom1,double hipotecariom1,double corporativom,
        double consumom2,double hipotecariom2,double corporativom2, double consumom3,double hipotecariom3  ,double corporativom3,double consumom1d
     ,double hipotecariom1d,double corporativom1d,  double consumom2d,double hipotecariom2d,double corporativom2d,double consumom3d,double hipotecariom3d,double corporativom3d
     ,double consumom4,double hipotecariom4,double corporativom4,double consumom5,double hipotecariom5,double corporativom5
     ,double consumom6,double hipotecariom6,double corporativom6,double consumom4d,double hipotecariom4d,double corporativom4d
     ,double consumom5d,double hipotecariom5d,double corporativom5d,double consumom6d,double hipotecariom6d,double corporativom6d
     ,double consumom7,double hipotecariom7,double corporativom7,double consumom8,double hipotecariom8,double corporativom8
     ,double consumom9,double hipotecariom9,double corporativom9,double consumom7d,double hipotecariom7d,double corporativom7d
     ,double consumom8d,double hipotecariom8d,double corporativom8d,double consumom9d,double hipotecariom9d,double corporativom9d,double cons1,double hip1,double corp1,double cons2,double hip2,double corp2,double cons3,double hip3,double corp3,double fondon,double fondeo,double tencaje,double pconsumo,double phipot,double pcorp,double lineac,double lineah,double lineacorp
     ,double montoc,double montom,double montol,double financiamiento,double tipodecambio,double lineacd,double lineahd,double lineacorpd,String consumo1,String hipotecario1,String corporativo1,String consumo2,String hipotecario2,String corporativo2,String consumo3,String hipotecario3,String corporativo3
     ,String consumo4,String hipotecario4,String corporativo4,String consumo5,String hipotecario5,String corporativo5,String consumo6,String hipotecario6,String corporativo6
     ,String consumo7,String hipotecario7,String corporativo7,String consumo8,String hipotecario8,String corporativo8,String consumo9,String hipotecario9,String corporativo9){
   
    Estructura Estructura = new Estructura();
    double fondeoCaptaciones = 0.5, asignacionCorto = 0.35, asignacionMedio = 0.45, asignacionLargo = 0.20;
    oper=Estructura.getOperaciones();
    financiamiento=Estructura.getFinanciamiento();
    montoc = asignacionCorto * fondeoCaptaciones * financiamiento;
    montom = asignacionMedio * fondeoCaptaciones * financiamiento;
    montol = asignacionLargo * fondeoCaptaciones * financiamiento;
    fondon=Estructura.getFondonegocio();
    fondeo=(montoc+montom+montol)*0.15;
    pconsumo=Estructura.getConsumo();
    phipot=Estructura.getHipotecario();
    pcorp=Estructura.getCorporativo();
    tencaje=fondon-fondeo;
    lineac=tencaje*pconsumo*0.45;
    lineah=tencaje*phipot*0.6;
    lineacorp=tencaje*pcorp*0.45;
    lineacd=((tencaje*pconsumo*0.45)/tipodecambio);
    lineahd=((tencaje*phipot*0.6)/tipodecambio);
    lineacorpd=((tencaje*pcorp*0.45)/tipodecambio);
    
    if (oper==5){
        consumo1="4%"; 
        hipotecario1="2%";
        corporativo1="3%";
        consumo2="6%"; 
        hipotecario2="3%";
        corporativo2="5%";
        consumo3="11%"; 
        hipotecario3="6%";
        corporativo3="8%";
        consumom1=(lineac*0.25)*0.04;
        hipotecariom1=(lineah*0.05)*0.02;
        corporativom= (lineacorp*0.1)*0.03;
        consumom2=(lineac*0.5)*0.06;
        hipotecariom2=(lineah*0.1)*0.03;
        corporativom2= (lineacorp*0.2)*0.05;
        consumom3=(lineac*1)*0.11;
        hipotecariom3=(lineah*0.15)*0.06;
        corporativom3= (lineacorp*0.4)*0.08;
        consumom1d=(lineacd*0.25)*0.04;
        hipotecariom1d=(lineahd*0.05)*0.02;
        corporativom1d= (lineacorpd*0.1)*0.03;
        consumom2d=(lineacd*0.5)*0.06;
        hipotecariom2d=(lineahd*0.1)*0.03;
        corporativom2d= (lineacorpd*0.2)*0.05;
        consumom3d=(lineacd*1)*0.11;
        hipotecariom3d=(lineahd*0.15)*0.06;
        corporativom3d= (lineacorpd*0.4)*0.08;
        //nivel 2
        consumo4="3%"; 
        hipotecario4="1%";
        corporativo4="2%";
        consumo5="5%"; 
        hipotecario5="2%";
        corporativo5="4%";
        consumo6="9%"; 
        hipotecario6="5%";
        corporativo6="7%";
        consumom4=(lineac*0.25)*0.03;
        hipotecariom4=(lineah*0.05)*0.01;
        corporativom4= (lineacorp*0.1)*0.02;
        consumom5=(lineac*0.5)*0.05;
        hipotecariom5=(lineah*0.1)*0.02;
        corporativom5= (lineacorp*0.2)*0.04;
        consumom6=(lineac*1)*0.09;
        hipotecariom6=(lineah*0.15)*0.05;
        corporativom6= (lineacorp*0.4)*0.07;
        consumom4d=(lineacd*0.25)*0.03;
        hipotecariom4d=(lineahd*0.05)*0.01;
        corporativom4d= (lineacorpd*0.1)*0.02;
        consumom5d=(lineacd*0.5)*0.05;
        hipotecariom5d=(lineahd*0.1)*0.02;
        corporativom5d= (lineacorpd*0.2)*0.04;
        consumom6d=(lineacd*1)*0.09;
        hipotecariom6d=(lineahd*0.15)*0.05;
        corporativom6d= (lineacorpd*0.4)*0.07;
        //nivel 3
        consumo7="2%"; 
        hipotecario7="1%";
        corporativo7="1%";
        consumo8="4%"; 
        hipotecario8="1%";
        corporativo8="3%";
        consumo9="7%"; 
        hipotecario9="4%";
        corporativo9="6%";
        consumom7=(lineac*0.25)*0.02;
        hipotecariom7=(lineah*0.05)*0.01;
        corporativom7= (lineacorp*0.1)*0.01;
        consumom8=(lineac*0.5)*0.04;
        hipotecariom8=(lineah*0.1)*0.01;
        corporativom8= (lineacorp*0.2)*0.03;
        consumom9=(lineac*1)*0.07;
        hipotecariom9=(lineah*0.15)*0.04;
        corporativom9= (lineacorp*0.4)*0.06;
        consumom7d=(lineacd*0.25)*0.02;
        hipotecariom7d=(lineahd*0.05)*0.01;
        corporativom7d= (lineacorpd*0.1)*0.01;
        consumom8d=(lineacd*0.5)*0.04;
        hipotecariom8d=(lineahd*0.1)*0.01;
        corporativom8d= (lineacorpd*0.2)*0.03;
        consumom9d=(lineacd*1)*0.07;
        hipotecariom9d=(lineahd*0.15)*0.04;
        corporativom9d= (lineacorpd*0.4)*0.06;
    } else if(oper==10) {
        consumo1="3,5%"; 
        hipotecario1="1,5%";
        corporativo1="2,5%";
        consumo2="5,5%"; 
        hipotecario2="2,5%";
        corporativo2="4,5%";
        consumo3="10,5%"; 
        hipotecario3="5,5%";
        corporativo3="7,5%";
        consumom1=(lineac*0.25)*0.035;
        hipotecariom1=(lineah*0.05)*0.015;
        corporativom= (lineacorp*0.1)*0.025;
        consumom2=(lineac*0.5)*0.055;
        hipotecariom2=(lineah*0.1)*0.025;
        corporativom2= (lineacorp*0.2)*0.045;
        consumom3=(lineac*1)*0.105;
        hipotecariom3=(lineah*0.15)*0.055;
        corporativom3= (lineacorp*0.4)*0.075;
        consumom1d=(lineacd*0.25)*0.035;
        hipotecariom1d=(lineahd*0.05)*0.015;
        corporativom1d= (lineacorpd*0.1)*0.025;
        consumom2d=(lineacd*0.5)*0.055;
        hipotecariom2d=(lineahd*0.1)*0.025;
        corporativom2d= (lineacorpd*0.2)*0.045;
        consumom3d=(lineacd*1)*0.105;
        hipotecariom3d=(lineahd*0.15)*0.055;
        corporativom3d= (lineacorpd*0.4)*0.075;
        //nivel 2
        consumo4="2,5%"; 
        hipotecario4="0,5%";
        corporativo4="1,5%";
        consumo5="4,5%"; 
        hipotecario5="1,5%";
        corporativo5="3,5%";
        consumo6="8,5%"; 
        hipotecario6="4,5%";
        corporativo6="6,5%";
        consumom4=(lineac*0.25)*0.025;
        hipotecariom4=(lineah*0.05)*0.005;
        corporativom4= (lineacorp*0.1)*0.015;
        consumom5=(lineac*0.5)*0.045;
        hipotecariom5=(lineah*0.1)*0.015;
        corporativom5= (lineacorp*0.2)*0.035;
        consumom6=(lineac*1)*0.085;
        hipotecariom6=(lineah*0.15)*0.045;
        corporativom6= (lineacorp*0.4)*0.065;
        consumom4d=(lineacd*0.25)*0.025;
        hipotecariom4d=(lineahd*0.05)*0.005;
        corporativom4d= (lineacorpd*0.1)*0.015;
        consumom5d=(lineacd*0.5)*0.045;
        hipotecariom5d=(lineahd*0.1)*0.015;
        corporativom5d= (lineacorpd*0.2)*0.035;
        consumom6d=(lineacd*1)*0.085;
        hipotecariom6d=(lineahd*0.15)*0.045;
        corporativom6d= (lineacorpd*0.4)*0.065;
        //nivel 3
        consumo7="1,5%"; 
        hipotecario7="0,5%";
        corporativo7="0,5%";
        consumo8="3,5%"; 
        hipotecario8="0,5%";
        corporativo8="2,5%";
        consumo9="6,5%"; 
        hipotecario9="3,5%";
        corporativo9="5,5%";
        consumom7=(lineac*0.25)*0.015;
        hipotecariom7=(lineah*0.05)*0.005;
        corporativom7= (lineacorp*0.1)*0.005;
        consumom8=(lineac*0.5)*0.035;
        hipotecariom8=(lineah*0.1)*0.005;
        corporativom8= (lineacorp*0.2)*0.025;
        consumom9=(lineac*1)*0.065;
        hipotecariom9=(lineah*0.15)*0.035;
        corporativom9= (lineacorp*0.4)*0.055;
        consumom7d=(lineacd*0.25)*0.015;
        hipotecariom7d=(lineahd*0.05)*0.005;
        corporativom7d= (lineacorpd*0.1)*0.005;
        consumom8d=(lineacd*0.5)*0.035;
        hipotecariom8d=(lineahd*0.1)*0.005;
        corporativom8d= (lineacorpd*0.2)*0.025;
        consumom9d=(lineacd*1)*0.065;
        hipotecariom9d=(lineahd*0.15)*0.035;
        corporativom9d= (lineacorpd*0.4)*0.055;
    } else {
        consumo1="3%"; 
        hipotecario1="1%";
        corporativo1="2%";
        consumo2="5%"; 
        hipotecario2="2%";
        corporativo2="4%";
        consumo3="10%"; 
        hipotecario3="5%";
        corporativo3="7%";
        consumom1=(lineac*0.25)*0.03;
        hipotecariom1=(lineah*0.05)*0.01;
        corporativom= (lineacorp*0.1)*0.02;
        consumom2=(lineac*0.5)*0.05;
        hipotecariom2=(lineah*0.1)*0.02;
        corporativom2= (lineacorp*0.2)*0.04;
        consumom3=(lineac*1)*0.1;
        hipotecariom3=(lineah*0.15)*0.05;
        corporativom3= (lineacorp*0.4)*0.07;
        consumom1d=(lineacd*0.25)*0.03;
        hipotecariom1d=(lineahd*0.05)*0.01;
        corporativom1d= (lineacorpd*0.1)*0.02;
        consumom2d=(lineacd*0.5)*0.05;
        hipotecariom2d=(lineahd*0.1)*0.02;
        corporativom2d= (lineacorpd*0.2)*0.04;
        consumom3d=(lineacd*1)*0.1;
        hipotecariom3d=(lineahd*0.15)*0.05;
        corporativom3d= (lineacorpd*0.4)*0.07;
        //nivel 2
        consumo4="2%"; 
        hipotecario4="0%";
        corporativo4="1%";
        consumo5="4%"; 
        hipotecario5="1%";
        corporativo5="3%";
        consumo6="8%"; 
        hipotecario6="4%";
        corporativo6="6%";
        consumom4=(lineac*0.25)*0.02;
        hipotecariom4=(lineah*0.05)*0;
        corporativom4= (lineacorp*0.1)*0.01;
        consumom5=(lineac*0.5)*0.04;
        hipotecariom5=(lineah*0.1)*0.01;
        corporativom5= (lineacorp*0.2)*0.03;
        consumom6=(lineac*1)*0.08;
        hipotecariom6=(lineah*0.15)*0.04;
        corporativom6= (lineacorp*0.4)*0.06;
        consumom4d=(lineacd*0.25)*0.02;
        hipotecariom4d=(lineahd*0.05)*0;
        corporativom4d= (lineacorpd*0.1)*0.01;
        consumom5d=(lineacd*0.5)*0.04;
        hipotecariom5d=(lineahd*0.1)*0.01;
        corporativom5d= (lineacorpd*0.2)*0.03;
        consumom6d=(lineacd*1)*0.08;
        hipotecariom6d=(lineahd*0.15)*0.04;
        corporativom6d= (lineacorpd*0.4)*0.06;
        //nivel 3
        consumo7="1%"; 
        hipotecario7="0%";
        corporativo7="0%";
        consumo8="3%"; 
        hipotecario8="0%";
        corporativo8="2%";
        consumo9="6%"; 
        hipotecario9="3%";
        corporativo9="5%";
        consumom7=(lineac*0.25)*0.01;
        hipotecariom7=(lineah*0.05)*0;
        corporativom7= (lineacorp*0.1)*0;
        consumom8=(lineac*0.5)*0.03;
        hipotecariom8=(lineah*0.1)*0;
        corporativom8= (lineacorp*0.2)*0.02;
        consumom9=(lineac*1)*0.06;
        hipotecariom9=(lineah*0.15)*0.03;
        corporativom9= (lineacorp*0.4)*0.05;
        consumom7d=(lineacd*0.25)*0.01;
        hipotecariom7d=(lineahd*0.05)*0;
        corporativom7d= (lineacorpd*0.1)*0;
        consumom8d=(lineacd*0.5)*0.03;
        hipotecariom8d=(lineahd*0.1)*0;
        corporativom8d= (lineacorpd*0.2)*0.02;
        consumom9d=(lineacd*1)*0.06;
        hipotecariom9d=(lineahd*0.15)*0.03;
        corporativom9d= (lineacorpd*0.4)*0.05;
    }

    Object[][] rows = {
        {"Consumo 5% Desempleo", consumo1,consumom1,consumom1d},
        {"Hipotecario 5% Desempleo", hipotecario1,hipotecariom1, hipotecariom1d},
        {"Corporativo 8% CE",corporativo1,corporativom,corporativom1d},
        {"","","",""},
        {"Consumo 10% Desempleo", consumo2,consumom2, consumom2d},
        {"Hipotecario 10% Desempleo", hipotecario2,hipotecariom2,hipotecariom2d},
        {"Corporativo 4% CE",corporativo2,corporativom2,corporativom2d},
        {"","","",""},
        {"Consumo 15% Desempleo", consumo3,consumom3, consumom3d},
        {"Hipotecario 15% Desempleo", hipotecario3,hipotecariom3, hipotecariom3d},
        {"Corporativo 2% CE",corporativo3,corporativom3, corporativom3d},
        {"","","",""},
        {"Morosidad","Nivel 2", "Monto ¢", "Monto $"},
        {"Consumo 5% Desempleo", consumo4,consumom4,consumom4d},
        {"Hipotecario 5% Desempleo", hipotecario4,hipotecariom4, hipotecariom4d},
        {"Corporativo 8% CE",corporativo4,corporativom4,corporativom4d},
        {"","","",""},
        {"Consumo 10% Desempleo", consumo5,consumom5, consumom5d},
        {"Hipotecario 10% Desempleo", hipotecario5,hipotecariom5,hipotecariom5d},
        {"Corporativo 4% CE",corporativo5,corporativom5,corporativom5d},
        {"","","",""},
        {"Consumo 15% Desempleo", consumo6,consumom6, consumom6d},
        {"Hipotecario 15% Desempleo", hipotecario6,hipotecariom6, hipotecariom6d},
        {"Corporativo 2% CE",corporativo6,corporativom6, corporativom6d},
        {"","","",""},
        {"Morosidad","Nivel 3", "Monto ¢", "Monto $"},
        {"Consumo 5% Desempleo", consumo7,consumom7,consumom7d},
        {"Hipotecario 5% Desempleo", hipotecario7,hipotecariom7, hipotecariom7d},
        {"Corporativo 8% CE",corporativo7,corporativom7,corporativom7d},
        {"","","",""},
        {"Consumo 10% Desempleo", consumo8,consumom8, consumom8d},
        {"Hipotecario 10% Desempleo", hipotecario8,hipotecariom8,hipotecariom8d},
        {"Corporativo 4% CE",corporativo8,corporativom8,corporativom8d},
        {"","","",""},
        {"Consumo 15% Desempleo", consumo9,consumom9, consumom9d},
        {"Hipotecario 15% Desempleo", hipotecario9,hipotecariom9, hipotecariom9d},
        {"Corporativo 2% CE",corporativo9,corporativom9, corporativom9d},
        
};
    Object[] cols = {
        "Morosidad","Nivel 1", "Monto ¢", "Monto $"
};
    
     JTable table = new JTable(rows,cols);
     return table;
    
}
}
