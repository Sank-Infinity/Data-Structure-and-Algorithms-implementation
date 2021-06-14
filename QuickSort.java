
public class QuickSort {

	
	
	public static void main(String[] args) {
		
		int a[] = {4,6,2,5,7,9,1,3};
		int n = a.length;
		int result[] = QuickSort(a,0, n-1);
		for(int bit: result) {
			System.out.print(bit+" ");
		}
	}
	
	static int[] QuickSort(int a[], int l , int h) {
		
		if(l<h) {
			
			int pivot = partitioning(a, l, h);
			QuickSort(a,l,pivot-1);
			QuickSort(a,pivot+1, h);
			
		}
		
		return a;
	}
	
	
	static int partitioning(int a[], int l , int h ) {
		
		int pivot = a[l];
		int i = l;
		int j = h;
		
		while(i<j) {
			
			while(a[i]<= pivot) i++;
			while(a[j]>pivot) j--;
			
			if(i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
		
		int temp = a[j];
		a[j] = a[l];
		a[l] = temp;
		
		return j;
		
	}
	
	
	
}
