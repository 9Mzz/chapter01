package ex06;

public class Main {
	public static void main(String[] args) {
		
//		String[] argss = new String[3];
//		argss[0] = "구민석";
//		argss[1] = "구민석1";
//		argss[2] = "구민석2";
//		
//		
//		for( int i=0; i<argss.length; i++) {
//			System.out.println(argss[i]);
		
		if (args[0].equals("-version")) {
			System.out.println("ver0.78");
		}else {
			System.out.println("옵션값을 확인해 주세요.");
		}
		
	}
}

