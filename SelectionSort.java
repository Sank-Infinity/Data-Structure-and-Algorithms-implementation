
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {8,4,0,5,1,9,2,-3};
		int[] result = selection(arr);
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

	static int[] selection(int arr[]) {
		
		
		for(int i=0; i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min!=i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				
			}
		}

		
		return arr;
	}

}

//for(int i = 0 ; i<arr.length; i++) {
//
//int min = arr[i];
//int j ; 
//
//for(j = i ; j<arr.length; j++) {
//	min = Math.min(arr[j], min);
//}
//
//for(int k =0 ;k<arr.length;k++) {
//	if(min==arr[k]) {
//		arr[k] = arr[i];
//		arr[i] = min;
//	}
//}
//}
