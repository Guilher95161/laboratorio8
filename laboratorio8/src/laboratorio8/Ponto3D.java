package laboratorio8;

public class Ponto3D extends Ponto2D {
	private double z;

	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public Ponto3D() {
		super();
		this.z = 0.0;
	}

	public double getZ() {
		return this.z;
	}

	public void desloca(double x, double y, double z) {
		super.desloca(x, y);
		this.z += z;
	}

	public Ponto3D somaPonto(double x, double y, double z) {
		return new Ponto3D(super.getX() + x, super.getY() + y, this.z + z);
	}
	public Ponto3D somaPonto(Ponto3D ponto) {
		return new Ponto3D(this.getX()+ponto.getX(),this.getY()+ponto.getY(),this.getZ()+ponto.getZ());
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Ponto Z: " + this.z;
	}

	@Override
	public Ponto3D clone() {
		return new Ponto3D(super.getX(), super.getY(), this.z);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Ponto3D)) {
			return false;
		} else {
			Ponto3D obj = (Ponto3D) o;
			if (obj.getX() == this.getX() && obj.getY() == this.getY() && obj.getZ() == this.z) {
				return true;
			}
			return false;
		}
	}
}
