package Arrays;

public class ArrayDemo {
public static void main(String []args) {
//	int arr[]= new int[5];
//	arr[0]=10;
//	arr[1]=20;
//	arr[2]=30;
//	arr[3]=40;
//	arr[4]=50;
	
	/* forloop */
	
//	for(int i=0;i<arr.length;i++) {
//	System.out.println(arr[i]);
//	}
	
	/* whileloop */
	
//	int i = 0;
//	while (i < arr.length) {
//		System.out.println(arr[i]);
//		i++;
//	
//}
	
	  /* sum of Array */
	
	
//	int sum = 0;
//	for(int i=0;i<arr.length;i++) {
//		sum=sum+arr[i];
//		System.out.println(sum);
//	}
	
	/* smallest of Array */
	
//	int arr1[]= new int []{23,32,45,56,89};
//	int min=arr1[0];
//	for(int i=0;i<arr1.length;i++) {
//		if (arr1[i]<min) {
//		 min=arr1[i];
//		}
//	}
//	System.out.println(min);
	
	/* largest of Array */
	
	int arr2[]=new int[]{90,98,97,96,95,94,93};
	 int max=arr2[0];
	 for (int i = 0; i < arr2.length; i++) {
		 if(arr2[i]<max) {
			 max=arr2[i];
		 }
	}
	System.out.println(max);
	
	}
}
