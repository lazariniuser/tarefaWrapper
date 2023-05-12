public class ChecaTipo {
    public void checagem(Object receptor) {
        Object resposta = receptor.getClass().getSimpleName();

        if (resposta instanceof String) {
            System.out.print("Parabéns! Você inseriu um dado int que foi transformado em Integer.");
        } else {
            System.out.print("O dado não pôde ser convertido para Integer.");
        }
    }
}