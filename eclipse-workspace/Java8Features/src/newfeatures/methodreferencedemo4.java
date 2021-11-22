package newfeatures;


// java program to use method reference to a constructor

interface Imessage{

	constructorreference getmessage(String msg);
}

class constructorreference{
	
	constructorreference(String msg){
		System.out.println(msg);
	}
}

public class methodreferencedemo4 {

	public static void main(String[] args) {

		Imessage hello = constructorreference::new;
		hello.getmessage("Method reference to constructor");
	}

}
