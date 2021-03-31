
public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {55,44,33,22,11,9,81,56};//,34,26,87,10,2,65};
     
     
     PrintLine();
     PrintArrayLength(arr);
     PrintArray(arr);
     PrintLine();
     BubbleSort(arr);
     
	}

public static void PrintLine()
{
	System.out.println("=============================================================");
}

public static void PrintArrayLength(int [] arr) {
	System.out.println("Length of Array is : "+ arr.length);
}
public static void PrintArray(int[] arr) {
	System.out.println("Printing Elements of Araay :");
	
	for(int i=0; i<arr.length-1;i++) {
		System.out.println("arr[" + i +"] = "+ arr[i]);
	}}
public static void PrintArrayInLine(int[] arr) {
	for(int i=0; i<arr.length-1;i++) {
		System.out.print(" "+ arr[i]);
	}
	System.out.println();
	}
	
public static void BubbleSort(int[] arr) {
	int i=0,j=0,iteration=0,swaps=0;
		for(i=0; i<arr.length-1;i++) {
			for(j=i+1; j<arr.length-1;j++) {
				iteration++;
				if(arr[j]<arr[i]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					swaps++;
				}PrintArrayInLine(arr);
			}
					//System.out.println("arr[" + i +"] = "+ arr[i]);
			//PrintArrayInLine(arr);
		}
		System.out.println(" >>>> Total Iteration= "+iteration+ "|| Total Swaps="+swaps);
}
}
