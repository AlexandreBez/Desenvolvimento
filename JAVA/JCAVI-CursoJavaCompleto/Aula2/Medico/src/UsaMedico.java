package src;

public class UsaMedico {
    public static void main(String[] args) {
        Medico medico = new Medico();

        medico.setNome("Zezinho");
        medico.setCrc("047489934-863");
        System.out.println(medico);

        MedicoCirurgiao medicoCir01 = new MedicoCirurgiao();

        medicoCir01.setNome("Flatline");
        medicoCir01.setCrc("463283946-73");
        medicoCir01.setTipoCirurgia("CiberNeural");
        medicoCir01.setQtdCirurgias(967);
        System.out.println(medicoCir01);
    }
}
