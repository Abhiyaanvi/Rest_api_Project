package dependency_ioc_xml_02;

public class DieselEngine implements Iengine {
	
	public DieselEngine() {
		
	}

	public int startEngine() {
		int y= 4;
		System.out.println("start diesel engine");
		return 1;
	}

}
