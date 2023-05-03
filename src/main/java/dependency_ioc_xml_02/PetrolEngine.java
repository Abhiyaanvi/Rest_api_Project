package dependency_ioc_xml_02;

public class PetrolEngine implements Iengine {
	
	public PetrolEngine() {
		
	}

	public int startEngine() {
		
		System.out.println("start petrol engine");
		
		return 5;
	}

}
