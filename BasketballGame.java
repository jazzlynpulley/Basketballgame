import java.io.* ;
import java.util.Scanner ;

public class BasketballGame {
	
	static int counter ;
	static String name ;
	static int highScore ;

	public static void main(String[] args) {
		
		Basketball myBasketball = new Basketball();
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Please enter your name: ");
		name = scan.nextLine() ;
		
		Player myPlayer = new Player(name, highScore) ;
		System.out.println("Name: " + name + ", High Score: " + highScore) ;
		
		
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        while(true){
	            System.out.println("\nPress enter to shoot");
	            String s = null;
	            try {
	                s = br.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if(s.length() == 0){
	            	counter = counter + 1 ;
	                System.out.println("Distance: " + myBasketball.getDistance() + " feet");
	                System.out.println("Score: " + myBasketball.getScore());
	                
	            }
	            
	            if (counter == 25){
	            	if (myBasketball.getScore() > highScore){
	            	System.out.println("\nNew High Score! \nHigh Score: " + myBasketball.getScore());
	            	}
	            }
	        }
		}
	}




