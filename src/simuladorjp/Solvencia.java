package simuladorjp;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Solvencia  {
  
    public double Activos, BonosMH, BonosTesoro, CarteraCredito, Consumo1, Hipotecario1, Corporativo1, OtrosActivos, DerivadosF, EncanjeML, ActOperativos, EstxDet,
    Pasivos, CapPub1, CuentaC,EncajeML, PasPatri, Patrimonio, CapCons,Ingresos, IngresosFi, Inversiones,Inversiones1, Disponibilidades, InversionesMH, CartCred,
    Consumo2, Hipotecario2, Corporativo2, OtrosIngresos, EncMinL, IngOp,Gastos, Credito, CapPub2, PrestamosInt, GastosOp, DerivadosFinan, Adim;
  
    Icon I = new ImageIcon(getClass().getResource("/Imagenes/UCA.logolabel.png"));
    public Solvencia() {
    }
    //Estado
    public double getDisponibilidades(double cortoplazo1) {
    Disponibilidades = cortoplazo1;
        return Disponibilidades;  
    }
    public double getInversionesMH(double largoplazo3, double medianoplazo2) {
        InversionesMH = medianoplazo2 + largoplazo3;
        return InversionesMH;
    }
    public double getCartCred(double Consumo2 , double Hipotecario2 , double Corporativo2) {
       CartCred = Consumo2 + Hipotecario2 + Corporativo2;
        return CartCred;
    }
    public double getConsumo2(double consumoc, double consumod, double tipodecambio) {
        Consumo2 = consumoc + (consumod * tipodecambio);
        return Consumo2;
    }
    public double getHipotecario2(double hipotecarioc, double tipodecambio, double hipotecariod) {
        Hipotecario2 = hipotecarioc + (hipotecariod * tipodecambio);
        return Hipotecario2;
    }
    public double getCorporativo2(double corporativod, double corporativoc, double tipodecambio) {
        Corporativo2 = corporativoc + (corporativod * tipodecambio);
        return Corporativo2;
    }
    public double getCredito(double Credito) {
        return Credito;
    }
    public double getIngresos(double IngresosFi, double OtrosIngresos) {
        Ingresos= IngresosFi+OtrosIngresos;
        return Ingresos;
    }
    public double getIngresosFi(double Inversiones , double CartCred) {
    IngresosFi = Inversiones + CartCred; 
        return IngresosFi;
    }
    public double getInversiones(double InversionesMH , double Disponibilidades) {
         Inversiones = InversionesMH + Disponibilidades;
        return Inversiones;
    }
    public double getOtrosIngresos(double EncMinL, double IngOp) {
        OtrosIngresos = EncMinL+IngOp;
        return OtrosIngresos;
    }
    public double getEncMinL(double requerimiento, double tasaDolares) {
       EncMinL= requerimiento*tasaDolares;
        return EncMinL;
    }
    public double getIngOp(double CartCred, double Inversiones) {
       IngOp= (CartCred+Inversiones)*0.05;
        return IngOp;
    }
    //Balance general

    public double getActivos(double Inversiones1, double CarteraCredito, double OtrosActivos) {
     Activos=Inversiones1+CarteraCredito+OtrosActivos;
        return Activos;
    }
    public double getBonosMH(double cortoplazo1, double largoplazo3, double medianoplazo2) {
         BonosMH=cortoplazo1+medianoplazo2+largoplazo3;
        return BonosMH;
    }
    public double getCarteraCredito(double Consumo1, double Hipotecario1, double Corporativo1) {
       CarteraCredito=Consumo1+Hipotecario1+Corporativo1;
        return CarteraCredito;
    }
    public double getConsumo1(double consumoc, double consumod, double tipodecambio) {
        Consumo1 = consumoc + (consumod * tipodecambio);
        return Consumo1;
    }
    public double getHipotecario1(double hipotecarioc, double tipodecambio, double hipotecariod) {
        Hipotecario1 = hipotecarioc + (hipotecariod * tipodecambio);
        return Hipotecario1;
    }
    public double getCorporativo1(double monedacorp, double monedacorp1, double tipodecambio) {
       Corporativo1= monedacorp+(monedacorp1*tipodecambio); 
        return Corporativo1;
    }
    public double getInversiones11(double BonosMH,double Bonostesoro) {
        Inversiones1=BonosMH+BonosTesoro; 
        return Inversiones1;
    }
    public double getBonosTesoro(double cortoplazo4, double largoplazo6, double medioplazo5, double tipodecambio) {
      BonosTesoro= (cortoplazo4+medioplazo5+largoplazo6)*tipodecambio;
        return BonosTesoro;
    }
     public double getOtrosActivos(double EncajeML,double ActOperativos,double EstxDet) {
        OtrosActivos= EncajeML+ActOperativos+ EstxDet;
        return OtrosActivos;
    }
    public double getDerivadosF(double contratosadquiridos1, double contratosadquieridos2, double preciofuturo1, double preciofuturo2) {
      DerivadosF=(preciofuturo1 *contratosadquiridos1)+( preciofuturo2 *contratosadquieridos2);
      return DerivadosF;
    } 
    public double getEncajeML(double requerimiento) {
     if(EncajeML==requerimiento){
       JOptionPane.showMessageDialog(null,"Encaje Minimo Legal \n"+EncajeML,"Solvencia",JOptionPane.INFORMATION_MESSAGE,I);       
       }
        return EncajeML;
    }
    public double getEstxDet(double EstDet) {
        return EstxDet;
    } 
    public double getCuentaC(double contratosadquieridos2, double contratosadquiridos1, double preciofuturo1, double preciofuturo2){
       CuentaC=(preciofuturo1 *contratosadquiridos1)+( preciofuturo2 *contratosadquieridos2);
      return CuentaC; 
    }
    public double getPasivos(double CapPub1,double CuentaC,double Patrimonio) {
         Pasivos= CapPub1+ CuentaC+Patrimonio;
        return Pasivos;
    }
    public double getCapPub1(double montoCorto, double montoLargo, double montoMedio) {
        CapPub1=montoCorto+montoMedio+ montoLargo;
        return CapPub1;
    }
    public double getPasPatri(double CapCons,double Patrimonio) {
      if(Patrimonio==CapCons){
       JOptionPane.showMessageDialog(null,"Patrimonio \n"+Patrimonio,"Solvencia",JOptionPane.INFORMATION_MESSAGE,I);    
       }
        return PasPatri;
    }
    public double getPatrimonio(double Pasivos,double PasPatri) {
        Patrimonio =Pasivos+PasPatri;
        return Patrimonio;
    }
    public double getCapCons(double capital) {
        if (CapCons==capital){
           JOptionPane.showMessageDialog(null,"Capital de Constitucion \n"+CapCons,"Solvencia",JOptionPane.INFORMATION_MESSAGE,I);   
       }
        return CapCons;
    }
    public double getActOperativos(double fondonegocio, double operaciones) {
       ActOperativos= operaciones*fondonegocio;
        return ActOperativos;
    }
    
}