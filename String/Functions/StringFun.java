package arrays;

public class StringFun {

	public static void main(String[] args) {
		
		String name = "Sayan";	
		String name2 = new String("Anuj ");
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		System.out.println(name.charAt(3));             
		System.out.println(name.length());             
		System.out.println(name.substring(1,3));
		System.out.println(name.contains("S"));
		//String concat
		name = name +" "+ "Kumar ";
		System.out.println(name.concat("Manna"));
		
		//Replace
		System.out.println(name.replace('a', 'c'));
		
		//Split
		String footballers = "Messi,Ronaldo,Suarez,Drogba,Pique";
		String allPlayers[] = footballers.split(",");
		for(String footballer: allPlayers) {
			System.out.println(footballer);
			
		}
		
		//indexOf
		System.out.println(footballers.indexOf('z'));
		
		//toLowerCase
		
		System.out.println(footballers.toLowerCase());
		
		//trim
		
		String name = "      Sayan     ";
		System.out.println(name + "  "+ name.trim());
		 
		
		
		
		
		
	}

}
