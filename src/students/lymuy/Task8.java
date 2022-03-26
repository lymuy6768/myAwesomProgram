package students.lymuy;

public class Task8 {

	public static void main(String[] args) {
		
		int Arr[]= {25,14,56,-15,36,56,77,18,29,49,0};
		
		int minValue=Arr[0];
		
		int maxValue=Arr[0];
		
		for(int i=0;i<Arr.length;i++) {
			
			if(Arr[i]<minValue) {
				minValue=Arr[i];
				}
			if(Arr[i]>maxValue) {
				maxValue=Arr[i];
			}
			
			
		}
		
		System.out.println("Maximum value is: "+ maxValue);
		System.out.println("Minimum value is: "+ minValue);
	
	
	
	}

}
