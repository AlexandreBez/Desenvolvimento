package cursojava;

public class LoopWhile {

	
	public static void main(String[] args) {
		//Vetor: variaveis em vetor
		String [] nome = new String[5];
		Double [] salario = new Double[5];
		int [] idade = new int[5];
		
		//-------------------------------------------------------
		//criando um vetor do tipo da classe contato
		Contato listaContato[]=new Contato[5];
		
		String nomes[][] = new String[3][5];
		nomes[0][0]="AAB";
		nomes[0][1]="AAC";
		nomes[0][2]="AAD";
		nomes[0][3]="AAF";
		nomes[0][4]="AAG";
		
		nomes[1][0]="BAAB";
		nomes[1][1]="BAAC";
		nomes[1][2]="BAAD";
		nomes[1][3]="BAAF";
		nomes[1][4]="BAAG";
		
		for(int i=0;i<nomes.length;i++) {
			System.out.println(nomes[i][i]);
		}
		
		//criando um objeto da classe contato para inserir no vetor do tipo da classe contato
		Contato contato1 = new Contato();
		contato1.setNome("Gabriel");
		contato1.setTelefone("3322-7766");
		contato1.setEmail("g.g@terra.com");
		contato1.setEndereco("Bela Vista- Palhoça SC");
		contato1.setPretencaoSalarial(5000.00);
		
		
		Contato contato2 = new Contato();
		contato2.setNome("Rafael");
		contato2.setTelefone("3366-2266");
		contato2.setEmail("rafa.r@terra.com");
		contato2.setEndereco("Bela Vista- Palhoça SC");
		contato2.setPretencaoSalarial(7000.00);
		
		Contato contato3 = new Contato();
		contato3.setNome("Joel");
		contato3.setTelefone("3344-1520");
		contato3.setEmail("joel.s@terra.com");
		contato3.setEndereco("Passa Vinte- Palhoça SC");
		contato3.setPretencaoSalarial(1500.00);
		 
		Contato contato4 = new Contato();
		contato4.setNome("Renato Silva");
		contato4.setTelefone("3245-9900");
		contato4.setEmail("juca.l@terra.com");
		contato4.setEndereco("Brejaru- Palhoça SC");
		contato4.setPretencaoSalarial(2050.00);
		
		Contato contato5 = new Contato();
		contato5.setNome("Renato Souza");
		contato5.setTelefone("3245-2266");
		contato5.setEmail("renatinho.f@terra.com");
		contato5.setEndereco("Brejaru- Palhoça SC");
		contato5.setPretencaoSalarial(3800.00);
		
		//Inserindo o objeto do tipo contato no vetor do tipo da classe contato
		listaContato[0]= contato1;
		listaContato[1]= contato2;
		listaContato[2]= contato3;
		listaContato[3]= contato4;
		listaContato[4]= contato5;
		System.out.println(contato1
				+"\n"+contato2
				+"\n"+contato3
				+"\n"+contato4
				+"\n"+contato5);
		System.out.println();
		
		//Visualizando os dados do vetor de contato
		int contar =0;
				while(contar<listaContato.length) {
					System.out.println(listaContato[contar]);
					contar++;
				}
				System.out.println();
				
				
		//Laço for
				contar =0;
				for(int i=0;i<listaContato.length;i++) {
					System.out.println(listaContato[contar]);
					contar++;
				}
				
		//Laco for
				contar=0;
				for(Contato contato:listaContato) {
					System.out.println(listaContato[contar]);
					contar++;
				}
		//-----------------------------------------------------------------------------
		
		nome[0]= "Francisco";
		nome[1]= "Julia";
		nome[2]= "Maria";
		nome[3]= "Paula";
		nome[4]= "Roberto";
		
		salario[0]=4900.00;
		salario[1]=3500.00;
		salario[2]=2700.00;
		salario[3]=3500.00;
		salario[4]=5900.00;
		
		idade[0]=22;
		idade[1]=33;
		idade[2]=30;
		idade[3]=28;
		idade[4]=21;
		
		
		
		for(int i =0;nome.length<i;i++) {
			System.out.println(i+":"+nome[i]);
		}
		
		//Mostrando tamanho vetor
		int tamanho = nome.length;
		System.out.println("Tamanho do vetor : " +tamanho);
	
		int count =0;
		while(count<tamanho) {
			System.out.println("Nome: "+nome[count]);
			System.out.println("Salario: "+salario[count]);
			System.out.println("Idade: "+idade[count]);
			
			if(nome[count].equals("Julia")) {
				System.out.println("Achei a possição: "+count);
			}
			count++;
		}
		//while:  repetição ate chegar o numero desejado
		int cont = 0;
		
		while(cont<20) {
			System.out.println("Contador "+cont);
			cont++;
		}
		
		
		String frase = "Amanhã é Domingo!";
		for(int i=0;i<frase.length();i++) {
			System.out.println(frase.charAt(i));
		}
	}
	
}
