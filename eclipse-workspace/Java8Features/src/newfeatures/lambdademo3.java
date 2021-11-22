package newfeatures;

public class lambdademo3 {

	public static void main(String[] args) {

		Mystring ms = (str) ->{
	
				String result="";
				for(int i =str.length()-1;i>=0;i--) 
					result+= str.charAt(i);
					return result;
				
			};
			System.out.println(ms.mystringfunction("Lmabda Expression"));
		
	
	Mystring myName = (name) -> {return "Hello"+name;}; 
	
	System.out.println(myName.mystringfunction("Babloo"));
}
}


