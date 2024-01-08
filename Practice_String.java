package practice1;

public class Practice_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//replace
		String str1="Abdul";		
		String replaced=str1.replace("A", "Shaik A");
		System.out.println(replaced);
		
		//contains()
		String str2="hello world";
		boolean str3=str2.contains("World");
		System.out.println(str3);
		
		//indexOf
		int str4=str2.indexOf("o");
		System.out.println(str4);
		
		//startsWith
		boolean str5=str2.startsWith("h");
		System.out.println(str5);
		
		//endsWith
		boolean str6=str2.endsWith("d");
		System.out.println(str6);
		
		//replaceFirst()
		String str7=str2.replaceFirst("l","a");
		System.out.println(str7);
		
		//replace()
		String str8=str2.replace("world","Abdul");
		System.out.println(str8);
		
		//split()
		String[] str9=str2.split("l");
		System.out.println(str9);
		for(String str:str9) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
