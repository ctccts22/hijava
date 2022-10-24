package ch05.sec03;



public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		String subject = "Java programming";
		
		int location = subject.indexOf("programming");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);

		location = subject.indexOf("Java");
			if(location != -1) {
				System.out.println("자바와 관련된 책이군요");
			} else {
				System.out.println("자바와 관련없는 책이군요");	
				}
			boolean result = subject.contains("Java");
			if(result) {
				System.out.println("자바와 관련된 책이군요");
			} else {
				System.out.println("자바와 관련없는 책이균요");
			}
				}
			

	}

