package students.lymuy;

public class Task7_FindTheIndexOfAnArrayElement {

	public static void main(String[] args) {
	//	Task7:
//			Write a Java program to find the index of an array element.
//			
//			find index of "Jenkins"
			
//		    String[] my_array2 = {
//	        "Java",
//			
//	        "Python",
//	        "PHP",
//	        "C#",
//	        "C Programming",
//	        "C++",
//	        "Jenkins",
//	        "SQL"
//	    };
		String my_array2[]= {"Java","Python","PHP","C#","C Programming","C++","Jenkins","SQL"};
		String specificIndex="C#";
		String output="";
		
		for(int i=0;i<my_array2.length;i++) {
			if(specificIndex==my_array2[i]){
				output= String.valueOf(i);
				
				break;
			}else {
				output="not in the element";
			}

	}System.out.println(output);
	}
}
