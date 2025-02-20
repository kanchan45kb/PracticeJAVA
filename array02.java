package arrayspractice;

public class array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add numbers from array list
		int arr[] = { 100, 2839, 928, 812, 2821, 7875 };
		int m = 0;
		for (int a = 0; a < arr.length; a++) {

			m += arr[a];
		}
		System.out.println(m);

		for (int j=0;j<arr.length;j++)
		{
			if (arr[j]%2==0)
			{
				System.out.println("Numebr is EVEN " +arr[j]);
			}
			else 
			{
				System.out.println("Number is ODD " +arr[j]);
			}
		}
	}
	// array number is even or odd
	

}
