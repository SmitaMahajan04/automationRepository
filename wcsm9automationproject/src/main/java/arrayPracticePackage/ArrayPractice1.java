package arrayPracticePackage;

public class ArrayPractice1 {
	
public static void main(String[] args) {
	String [][]data=new String[3][2];
	data[0][0]="admin";
	data[1][0]="manager";
	data[1][1]="admin";
	data[2][0]="admin";
	data[2][1]="manager123";
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=1;j++)
		{
			System.out.print(" "+data[i][j]+" ");
		}
		System.out.println();
	}
	
			
}

}
