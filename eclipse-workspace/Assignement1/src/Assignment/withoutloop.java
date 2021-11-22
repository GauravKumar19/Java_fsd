package Assignment;

public class withoutloop {

	
	public static void main(String[] args) {

       loop("Gaurav", 10);

    }

    static void loop(String name, int times) {

        System.out.println(times + ":" + name);

        if (times > 1) {
            loop(name, times - 1);
        }
    }
}
