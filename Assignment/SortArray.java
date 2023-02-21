package arrayExamples;

public class SortArray {

	public static void sortAsscending(int arr[]) {
		for(int i=0; i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]> arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("asscending order:  ");
		for(int e:arr) {
			System.out.println(e);
		}
	}
	public static void sortDescending(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println("Descending order: ");
		for (int e : arr) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3,5,7, 6, 4, 2 };
		sortAsscending(arr);
		sortDescending(arr);

	}

}


	
	






	
		