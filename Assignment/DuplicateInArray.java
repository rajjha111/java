package arrayExamples;

public class DuplicateInArray {
	
   public static void main(String[] args) {
	int arr[]= {1,2,3,4,4,5,6,7,7,};
	for(int i=0;i<arr.length;i++) {
		for(int j=1+i;j<arr.length;j++) {
			if (arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}
}

}


