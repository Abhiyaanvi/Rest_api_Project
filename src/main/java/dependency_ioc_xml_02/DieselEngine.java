package dependency_ioc_xml_02;

public class DieselEngine implements Iengine {
	
	public DieselEngine() {
		
	}

	public int startEngine() {
		System.out.println("start diesel engine");
		return 1;
	}

}
