package UNIIT_01;

import java.util.Scanner;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };
		Scanner input = new Scanner(System.in); 
		int d = input.nextInt(); 

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array,d);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		
		int i;
		int j;
		int temp;
		int n=arr.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>=arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		
		

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!

	}

	void leftRotationInAnArray(int[] arr,int d) {
		// write code here!
		int n=arr.length;
		int i,j=0;
		int temp[];
		for(i=d;i>0;i--)
		{
			temp[j]=arr[i];
			j++;
		}
		int k=d+1;
		for(i=n-1;i>d;i--)
		{
			temp[k]=temp[i];
		}
		int s=0;
		for(i=n-1;i>0;i--)
		{
			arr[s]=temp[i];
		}
	}

	void removeElementInArray(int[] arr) {
		// write code here!
		

	}

}
