
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	//Hello
	
	public static void main(String[] args) {
		System.out.println("Define first vector...");
		Vector u = createVector();
		System.out.println("Define second vector...");
		Vector v = createVector(); 
		
		runVectorMath(u, v);
		
		}
	
	public static Vector createVector() {
		System.out.println("Enter x component:");
		double x = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter y component:");
		double y = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter z component:");
		double z = Double.parseDouble(scanner.nextLine());
		
		return new Vector(x, y, z);
	}
	
	public static void runVectorMath(Vector u, Vector v) {
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("What would you like to compute?");
			String action = scanner.nextLine();
			
			switch(action){
			
			case("cross product"):
				System.out.println(VectorMath.getCrossProduct(u, v));
				break;
			case("dot product"):
				System.out.println(VectorMath.getDotProduct(u, v));
				break;
			case("u"):
				System.out.println(u);
				break;
			case("v"):
				System.out.println(v);
				break;
			case("u mag"):
				System.out.println(u.getMag());
				break;
			case("v mag"):
				System.out.println(v.getMag());
				break;
			case("unit vector u"):
				System.out.println(u.getUnitVector());
				break;
			case("unit vector v"):
				System.out.println(v.getUnitVector());
				break;
			case("area para"):
				System.out.println(VectorMath.getArea(u, v));
				break;
			case("area tri"):
				System.out.println(VectorMath.getArea(u, v)/2);
				break;
			case("esc"):
				isRunning = false;
				break;
			default:
				System.out.println("Invalid command");
				break;
			}
		}
	}
}

