package animal;

public class Animal implements IAnimal{

    @Override
    public String andar() {
        // TODO Auto-generated method stub
        return "Bipede";
    }

    @Override
    public String velocidadeCorrida(Double velocidade) {
        // TODO Auto-generated method stub
        return velocidade.toString();
    }

    @Override
    public String comer() {
        // TODO Auto-generated method stub
        return "Feijão";
    }
    
}
