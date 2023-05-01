package dependency_ioc_xml_02;

public class Car {
	
	private Iengine engine;

	public Iengine getEngine() {
		return engine;
	}

	public void setEngine(Iengine engine) {
		this.engine = engine;
	}

	public Car() {		
	}
	
	public  void drive() {
		int status = engine.startEngine();
		
		if(status >= 1) {
			System.out.println("journy is started");
		}else {
		   System.out.println("car is not Started");	
		}
		
	}
	

}
