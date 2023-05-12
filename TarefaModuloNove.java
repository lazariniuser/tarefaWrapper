import java.util.Scanner;

class TarefaModuloNove {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        int getValue = sc.nextInt();
        Integer numero = Integer.valueOf(getValue);

        ChecaDigita finaliza = new ChecaDigita();
        finaliza.checateclado(sc, numero, getValue);

    }
}