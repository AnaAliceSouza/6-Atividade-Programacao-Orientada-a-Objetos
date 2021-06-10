public class Main {
	
	public static void main(String[] args) {

		Notbook notbook = new Notbook ("Lenovo");
	
		System.out.println(notbook.getTipoAparelho());
		notbook.carregar();
		System.out.println(notbook.toString());
		System.out.println("Bateria: mAh" + notbook.getMAH());
		System.out.println(notbook.getModeloProcessador());
		System.out.println("Potencia: " + notbook.getPotencia());
		System.out.println("Tela: " + notbook.getTipoTela());
	
}

}
