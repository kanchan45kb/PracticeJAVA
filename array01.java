package arrayspractice;

public class array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 100, 200, 19281, 532, 982, 1828 };
		System.out.println("Lenght of Array: " + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int m[][] = { { 100, 263 }, { 212, 827 }, { 312, 781 }, { 431, 8191 } };
		System.out.println("Lenght of row " + m.length);
		System.out.println("Lenght of coloum " + m[0].length);
		for (int r = 0; r < m.length; r++) {
			for (int k = 0; k < m[0].length; k++) {
				System.out.print(m[r][k] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// Simple way to write code
		for (int arr[] : m) // It store first element into array first place
		{
			for (int n : arr) // it place first element from array to variable if array reach to zero it jump
								// to next row
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Hetrogenious data type
		Object x[] = { 100, 2121,'A',"START",true};
		{
			System.out.println(x.length);
			for(int l=0;l<x.length;l++)
			{
				System.out.println(x[l]);
			}
		}
	
	}

}
