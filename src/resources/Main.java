import java.util.Date;

public class Main {
	public static void main (String[] args){
		Cargador c= new Cargador();
		Compra co= new Compra();
		c.crearCode(co);
		System.out.println(co.getCod());
		System.out.println(co.getTime());
		System.out.println(new Date());
	}

}
