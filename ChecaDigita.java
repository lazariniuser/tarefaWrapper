public class ChecaDigita {
    public void checateclado(Object dado, Integer numdig, Object valor) {
        if (dado instanceof String) {
            System.out.println("Você digitou um dado do tipo String, digite um número, por gentileza.");
        } else {
            System.out.println("O valor digitado foi " + numdig + ".");
            ChecaTipo result = new ChecaTipo();
            result.checagem(valor);
        }
    }
}
