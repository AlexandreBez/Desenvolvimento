package Aula8;

public class Break_Continue {
    
    public static void main(String[] args) {

        double valorTotal = 30000;

        for(int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = (valorTotal / parcela);

            // if(valorParcela <= 1000){
            //     System.out.println("Valor é menor do que 1000");
            //     break;
            // }else{
            //     System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            // }

            if(valorParcela <= 1000){
                continue;
            }

            System.out.printf("Parcela %d R$ %.2f %n", parcela, valorParcela);

        }
    }
}
