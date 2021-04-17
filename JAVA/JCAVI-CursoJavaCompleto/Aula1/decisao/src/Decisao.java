public class Decisao {
    public static void main(String[] args) throws Exception {
        int x = 7;
        boolean certo = false;

        if((x >= 10) || (x <= 5)) {
            x++;
            System.out.println(x);
        }

        if((certo == true) && (x == 10)) {
            System.out.println(certo);
        }

        if(x <= 5 ^ x == 0) {
            System.out.println(x);
        }

        if(!certo) {
            System.out.println(certo);
        }
    }
}
