
public class InterfaceEx {
	public static void main(String[] args) {
		Mach mach1=new Mach();
		mach1.start();
		Pers pers1=new Pers("Bob");
		pers1.greet();
		Info info1=new Mach();
		info1.showInfo();
		Info info2=new Pers("Tom");
		info2.showInfo();
		System.out.println();
		outputInfo(mach1);
		outputInfo(pers1);
			
		
	}
	private static void outputInfo(Info info)
	{
		info.showInfo();
	}
}
