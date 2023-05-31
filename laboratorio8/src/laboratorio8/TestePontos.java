package laboratorio8;

public class TestePontos {
	public static void main(String []args) {
Ponto2D ponto= new Ponto2D();
Ponto3D ponto3d= new Ponto3D();
Pixel pixel= new Pixel();
/*System.out.println(ponto);
ponto3d.desloca(10, 10,10);
System.out.println(ponto);
Ponto3D ponto2= ponto3d.clone();
ponto2.desloca(-2, -2,-2);
System.out.println(ponto2);
Ponto3D somaPonto=ponto3d.somaPonto(ponto2);
System.out.println(somaPonto);
System.out.println(ponto.equals(ponto2));*/
System.out.println(pixel);
pixel.desloca(10, 10);
pixel.mudaCor(5);
System.out.println(pixel);
Pixel pixel2= pixel.clone();
pixel2.mudaCor(10);
System.out.println(pixel2);
System.out.println(pixel.equals(pixel2));
}
}