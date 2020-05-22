
public class Field {
	Plant plant=new Plant();
	public Field()
	{
		//size is protected and Field is in same package as Plant.
		System.out.println(plant.size);
	}
}
