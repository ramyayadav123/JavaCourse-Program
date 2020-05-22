class Details
{
	public static final int ID=7;
	private String name;
	public String getData()
	{
		String data="some stuff "+calculateGrowthForecast();
		return data;
	}
	private int calculateGrowthForecast()
	{
		return 9;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
public class EncapsulationEx {
	public static void main(String[] args) {
		Details dt=new Details();
		System.out.println(dt.getData());
	}
}
