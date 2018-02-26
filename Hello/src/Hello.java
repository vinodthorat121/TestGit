import java.util.Arrays;
import java.util.List;

public class Hello {

	final static String st = " Hello ";
	
	public static void main(String[] args) {
		System.out.println("Hi, Welcome");
		//commit
		hSevrive hsSevrive = new hSevrive() {
			@Override
			public void message(String message) {
				// TODO Auto-generated method stub
				
				System.out.println("Hi THis is lambda");
			}
		};
		
		hSevrive ft = (message) -> {
			System.out.println("football");
		};
		//hSevrive hs = message -> System.out.println(st + message);
		//hs.message("lamda");
		
		List<String> players = Arrays.asList("Sachin", "Kohli","MSD");
		
/*		for(String p : players) {
			if(p.equals("Sachin")) {
				System.out.println("yes sachin is here");
			}
		}
*/		
		
		players .stream()
				.filter(player -> player.equals("Sachin1"))
				.forEach(player -> System.out.println("yes111"));
		//System.out.println(players);
	}
		
	
	interface hSevrive {
		void message(String message);
		//void xyz(String message);
	}
}
