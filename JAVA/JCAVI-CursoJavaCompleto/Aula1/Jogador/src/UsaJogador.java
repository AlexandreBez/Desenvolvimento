package Jogador.src;

public class UsaJogador{
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Time time = new Time();

        jogador.setNome("Romario");
        jogador.setAltura(1.75);
        jogador.setPeso(70.40);
        jogador.setPosicao("Atacante");

        System.out.println(jogador.getNome());
        System.out.println(jogador.getAltura());
        System.out.println(jogador.getPeso());
        System.out.println(jogador.getPosicao());

        time.setTime("Havai");
        time.setEstado("SC");

        System.out.println(time.getTime());
        System.out.println(time.getEstado());
        System.out.println(jogador);
    }
}
