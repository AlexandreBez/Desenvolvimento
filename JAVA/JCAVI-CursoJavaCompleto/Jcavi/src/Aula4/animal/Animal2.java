package Aula4.animal;

public class Animal2 implements IAnimal{

    @Override
    public String andar() {
        // TODO Auto-generated method stub
        return "Quadrupede";
    }

    @Override
    public String velocidadeCorrida(Double velocidade) {
        // TODO Auto-generated method stub
        return velocidade.toString();
    }

    @Override
    public String comer() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
