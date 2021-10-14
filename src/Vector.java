
public class Vector {
	
	private double[] vector; 
	
	public Vector(double x, double y, double z) {
		vector = new double[3];
		vector[0] = x;
		vector[1] = y;
		vector[2] = z;
	}

	public double getX() {
		return vector[0];
	}
	
	public double getY() {
		return vector[1];
	}
	
	public double getZ() {
		return vector[2];
	}
	
	public void setX(double x) {
		vector[0] = x; 
	}
	
	public void setY(double y) {
		vector[1] = y; 
	}
	
	public void setZ(double z) {
		vector[2] = z; 
	}
	
	public double getMag() {
		double x2 = Math.pow(getX(), 2);
		double y2 = Math.pow(getY(), 2);
		double z2 = Math.pow(getZ(), 2);
		return Math.sqrt(x2 + y2 + z2);
	}
	
	public Vector getUnitVector() {
		double xM = getX()/getMag();
		double yM = getY()/getMag();
		double zM = getZ()/getMag();
		return new Vector(xM,yM,zM);
	}
	
	public String toString() {
		return "<" + getX() + ", " + getY() + ", " + getZ() + ">";
	}
}
