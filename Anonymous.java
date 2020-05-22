class Device2 {

	public void start() {
		System.out.println("Starting machine...");
	}
}
interface Plant1
{
	public void grow();
}
public class Anonymous {

	public static void main(String[] args) {
		Device2 dev2=new Device2()
		{
		@Override
		public void start()
		{
			System.out.println("Camera snapping");
		}
		};
		dev2.start();
		Plant1 plant1=new Plant1()
		{
			@Override
			public void grow()
			{
				System.out.println("Plant growing");
			}
		};
		plant1.grow();
	}

}
