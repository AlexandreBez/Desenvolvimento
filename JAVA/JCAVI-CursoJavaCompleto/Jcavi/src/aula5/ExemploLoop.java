package aula5;

public class ExemploLoop {

	String nome[] = new String[5];
	Double salario[] = new Double[5];
	int idade[] = new int[5];
	
	String nomes[][] = new String[3][5];

	nomes[0][0] = "AAB";
	nomes[0][1] = "AABC";
	nomes[0][2] = "AABD";
	nomes[0][3] = "AABE";
	nomes[0][4] = "AABF";
	nomes[1][0] = "CCDDD";
	nomes[1][1] = "CCDDE";
	nomes[1][2] = "CCDDDF";
	nomes[1][3] = "CCDDDG";
	nomes[1][4] = "CCDDD";

	for(int h = 0; h < nomes.length; h++) {
		System.out.println(nomes[h][h]);
	};
}
