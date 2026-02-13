public class DemoCliente{
	public static void main(String[] args){

	Cliente c = new Cliente();

	c.setNome("Cauê");
	c.setCredito(51.0f);

	System.out.println("Nome :"+c.getNome());
	System.out.println("Creditos :"+c.getCredito());
	}
}
