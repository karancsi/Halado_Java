package hu.me.krz.haladojava;

public class Point {

	private long x;
	private long y;
	private long z;
	
	public Point(long x, long y, long z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getZ() {
		return z;
	}
	
	public Point Translate(Point point, Point move){
		Point p = new Point(point.x,point.y,point.z); 
		p.x += move.x;
		p.y += move.y;
		p.z += move.z;
		return p;
	}

}
