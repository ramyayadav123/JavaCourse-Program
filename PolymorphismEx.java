
public class PolymorphismEx {
	public static void main(String[] args) {
		Plants plant1=new Plants();
		Tree tree=new Tree();
		Plants plant2=tree;
		plant2.grow();
		tree.shedLeaves();
		doGrow(tree);
	}
	public static void doGrow(Plants plant)
	{
		plant.grow();
	}
}
