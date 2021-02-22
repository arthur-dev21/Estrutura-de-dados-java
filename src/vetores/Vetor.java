package vetores;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho; // PODEMOS CONTROLAR O TAMANHO DO VETOR

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public boolean adcionaEspecialista(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public void adcionaSenior(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("vetor esta cheio , nao � possivel adcionar elementos");
		}
	}

	/*
	 * no modelo pleno vai dar erro caso queiramos adcionar elementos acima da
	 * capaidade
	 * 
	 */

	public void adcionaPleno(String elemento) { // adciona um elemento no vetor
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	}

	/*
	 * funciona , beleza mas temos somente 5 posi�oes , mas caso tivessimos 10 mil
	 * posi�oes ?ou 1 milhao de posi�oes em sistemas grandes?
	 */

	public void adcionaJunior(String elemento) { // adciona um elemento no vetor
		for (int i = 0; i < this.elementos.length; i++) { // pecorre o array
			if (this.elementos[i] == null) { // verifica a posi�ao vazia
				this.elementos[i] = elemento; // adciona p elemento a posi�ao vazia
				break; // para o loop
			}
		}
	}

	/*
	 * metodo tamanho para retornar o tamanho do nosso array , mas porque nao o
	 * metodo set ? simplismente porque nao queremos que a pessoa que vai usar nossa
	 * classe altere o tamanho (nesse contexto)
	 */
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}

}
