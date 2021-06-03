package Aula2.Obras.src;

public class Obras {
    public static  void main(String[] args) {
        
        Engenheiro engenheiro1 = new Engenheiro();

        engenheiro1.setCidade("São Paulo");
        engenheiro1.setNome("Luiz Miranda");
        engenheiro1.setCrc("8526436-624");
        engenheiro1.setIdade(29);
        engenheiro1.setSalario(10584.65);
        engenheiro1.setLocal("Ala 1");
        engenheiro1.setFuncao("Engenheiro Civil");
        System.out.println(engenheiro1);

        Pedreiro pedreiro1 = new Pedreiro();

        pedreiro1.setCidade("São Paulo");
        pedreiro1.setNome("Andrei Nunes");
        pedreiro1.setIdade(34);
        pedreiro1.setSalario(2084.65);
        pedreiro1.setLocal("Ala 1");
        pedreiro1.setEquipe("Equipe Alpha");
        pedreiro1.setFuncao("Pedreiro");
        System.out.println(pedreiro1);
        
        Pedreiro pedreiro2 = new Pedreiro();

        pedreiro2.setCidade("Rio Grande do Sul");
        pedreiro2.setNome("Jose Neirelli");
        pedreiro2.setIdade(26);
        pedreiro2.setSalario(2000.65);
        pedreiro2.setLocal("Ala 2");
        pedreiro2.setEquipe("Equipe Beta");
        pedreiro2.setFuncao("Pedreiro");
        System.out.println(pedreiro2);

        Pedreiro pedreiro3 = new Pedreiro();

        pedreiro3.setCidade("Santa Catarina");
        pedreiro3.setNome("Maciel Dornelle");
        pedreiro3.setIdade(30);
        pedreiro3.setSalario(2572.65);
        pedreiro3.setLocal("Ala 3");
        pedreiro3.setEquipe("Equipe Charlie");
        pedreiro3.setFuncao("Pedreiro");
        System.out.println(pedreiro3);

        AuxPedreiro auxPedreiro1 = new AuxPedreiro();

        auxPedreiro1.setCidade("São Paulo");
        auxPedreiro1.setNome("Thiago Gomes");
        auxPedreiro1.setIdade(24);
        auxPedreiro1.setSalario(1532.65);
        auxPedreiro1.setLocal("Ala 3");
        auxPedreiro1.setEquipe("Equipe Charlie");
        auxPedreiro1.setFuncao("Auxiliar de Pedreiro");

        System.out.println(auxPedreiro1);

    }
}
