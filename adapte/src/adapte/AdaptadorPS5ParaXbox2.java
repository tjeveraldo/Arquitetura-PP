package adapte;


public class AdaptadorPS5ParaXbox2 extends SensorPS5  {
	
    private SensorXbox2 adaptee;

    public AdaptadorPS5ParaXbox2(SensorXbox2 adaptee) {
        this.adaptee = adaptee;
    }

    //Override da solicita��o
    public void conectarPS5() {
        adaptee.conectarXbox2();
        System.out.println("Controle de um PlayStation");
    }
}
