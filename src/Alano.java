public class Alano extends Perro implements Lebrel, Dogo{
	
	public String nombre;
	public int años;
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public int getAños() {
		return años;
	}
	public void setAños(int años) {
		this.años = años;
	}
	
	public String comer(){
		String com = "come pienso";
		return com;
	}
		
	public int velocidadCorrer(){
		return 5;
	}
	
	
	public int velocidadCorrer1(){
		return 5;
	}

}
