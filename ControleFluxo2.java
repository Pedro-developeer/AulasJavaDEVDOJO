
public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        boolean ok = true;
        status = idade < 18 ? "Não adulto" : "Adulto";
        System.out.println(status);
    }
}