import java.util.Scanner;


class Lab6Ex1{
	
	public static void main(String args[]){
		
	Scanner scn =  new Scanner(System.in);	
	
	System.out.println("Enter string");
	String s = scn.nextLine();
	int count = 0;
	
	for(int i=0;i<s.length();i++){
		char ch = s.charAt(i);

		switch(ch){
		
		case 'a': case 'A':
		count++;
		break;
		
		case 'e': case'E':
		count++;
		break;
		
		case 'i': case 'I':
		count++;
		break;
		
		case 'o': case 'O':
		count++;
		break;
		
		case 'u': case 'U':
		count++;
		break;
		
		//Rather than having count and break at each case we cav use it as below
		/*
		case 'a': case 'A':
		case 'e': case'E':
		case 'i': case 'I':
		case 'o': case 'O':
		case 'u': case 'U':
		count++;
		break;
		*/
		
			
		}
		
		
	}
	System.out.println("Number of vowels:"+count);
		
		
	}
	
}