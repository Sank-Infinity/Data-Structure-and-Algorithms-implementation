
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {8,4,5,1,9,2};
		int[] result = insertion(arr);
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	static int[] insertion(int arr[]) {
		
		for(int i=1; i<arr.length;i++) {
			
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
		
		
		
		return arr;
	}
	
}
