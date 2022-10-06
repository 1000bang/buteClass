package Generic_ex.ch04;

public class MyPoint<X, Y> {

	X x;
	Y y;

	public MyPoint(X k, Y v) {
		this.x = k;
		this.y = v;
	}

	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public Y getY() {
		return y;
	}

	public void setY(Y y) {
		this.y = y;
	}

}
