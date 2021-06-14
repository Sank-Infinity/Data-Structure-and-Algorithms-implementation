
//Time Complexity O(N*N)
//Space Complexity O(1)

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {4,3,7,1,5,0};
		int[] result = bubble(arr);
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	static int[] bubble(int arr[]) {
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		return arr;
	}

}
