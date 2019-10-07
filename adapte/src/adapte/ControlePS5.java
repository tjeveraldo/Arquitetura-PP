package adapte;



	public class ControlePS5 {
		private SensorPS5 sensorAQueSeConecta;
    
    public void Conectar(SensorPS5 sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarPS5();
    }

	
		// TODO Auto-generated method stub
		
	

}
