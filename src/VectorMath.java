
public class VectorMath {

	public static double getDotProduct(Vector u, Vector v) {
		double xProd = u.getX() * v.getX();
		double yProd = u.getY() * v.getY();
		double zProd = u.getZ() * v.getZ();
		return (xProd + yProd + zProd);
	}
	
	public static Vector getCrossProduct(Vector u, Vector v) {
		double x = u.getY() * v.getZ() - u.getZ() * v.getY();
		double y = u.getZ() * v.getX() - u.getX() * v.getZ();
		double z = u.getX() * v.getY() - u.getY() * v.getX();
		return new Vector(x,y,z);
	}
	
	public static double getArea(Vector u, Vector v) {
		return getCrossProduct(u, v).getMag();
	}
}
