package LPAloreSemestre2;

public class ObjetosPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome("Samuel Freitas");
		pessoa1.setIdade(16);
		pessoa1.setEndereco("Itapetininga, SP");
		pessoa1.setProfissao("Estudante");
		pessoa1.setCPF("479.506.388-50");
		pessoa1.setRG("123456789");
		
		pessoa2.setNome("Samuel Freitas");
		pessoa2.setIdade(16);
		pessoa2.setEndereco("Itapetininga, SP");
		pessoa2.setProfissao("Estudante");
		pessoa2.setCPF("479.506.388-50");
		pessoa2.setRG("123456789");
		
		System.out.println("----- OBJETO -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		
		System.out.println("----- OBJETO -----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
	}
}