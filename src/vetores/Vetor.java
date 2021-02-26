package vetores;

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

	public void adcionaJunior(String elemento) { 								// adciona um elemento no vetor
		for (int i = 0; i < this.elementos.length; i++) { 						// pecorre o array
			if (this.elementos[i] == null) {									 // verifica a posi�ao vazia
				this.elementos[i] = elemento; 									// adciona p elemento a posi�ao vazia
				break; 															// para o loop
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

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

	// metodo de busca
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) { 									// a posicao tem que ser maior que zero e menor que o tamanho , caso
																						// negamos essa expressao recuperamos os dados possiveis
			throw new IllegalArgumentException("posicao invalida");
		}

		return this.elementos[posicao];
	}

	// verifica se o elemeneto existe no vetor
	public boolean busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) { 										// busca sequencial vai de posi�ao em posicao ate encontrar o elemento
			if (this.elementos[i].equals(elemento)) {
				return true;
			}

		}
		return false;
	}
	
	// adcionr elemento a qualquer posi�ao do vetor
	// 0 1 2 3 4 5 6= tamanho � 5
	// B C D E F + +
	public boolean adcionaQualquerPosicao(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) { 								 //primeiro verificamos se a posicao que o usuario digitou � valida		
			throw new IllegalArgumentException("posicao invalida");					 																
		}
		//depois que mover
		for(int i = this.tamanho-1 ; i>=posicao ; i--) {
//		        (1)                   (2)        (3)
			this.elementos[i+1]= this.elementos[i];
//                 (4)             (5)			
		}
		
		this.elementos[posicao] = elemento;    
//                (6)		
		tamanho++;
//	      (7)	
		return true;
	}
	/* comentario do codigo
	 * 
	 * (1) -> o i inicia pelo tamanho total do vetor "5-1=4", e tem o menos um para que possamos pegar o elemento anterior e coloca-lo na posi�ao original
	 * (2) -> o "i" tem que ser maior que a posicao que o usuario digitou para que possamos subistituit os elementos da frente
	 * (3) -> teremos que decrementar pois pecorreremos o array ate a posi�ao que o usuario digitou (2)
	 * (4) -> o "i " tem valor 4 e com mais 1 vai valer 5 ,
	 * (5) -> o "i " tem valor 4 e vai adcionar a posi�ao 5 do vetor
	 * 
	 * (6) -> apos o fim do loop e seguido ate a posi�ao digitada pelo o usuario a posi�ao digitada pelo mesmo agora esta livre para receber o elemento
	 * (7) -> com um elemento a mais o array deve ter o tamanho aumentado
	 *   
	 * 
	 * */
	

}
