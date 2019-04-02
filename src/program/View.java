package program;

public class View {
	public static void main(String[] args) 
	{
		int[][] testm={{1,2,3},{4,5,6},{7,8,9}};
		Matrix m =new Matrix(testm);
		System.out.println(m.toString());
		MatrixOperation.DiagSort(m);
		System.out.println();
		System.out.println(m.toString());
		
	}
}
