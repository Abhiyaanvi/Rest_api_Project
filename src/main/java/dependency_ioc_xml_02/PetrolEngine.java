package dependency_ioc_xml_02;

public class PetrolEngine implements Iengine {
	
	public PetrolEngine() {
		
	}

	public int startEngine() {
		int x= 3;
		System.out.println("start petrol engine");
		
		return 1;
	}

}
