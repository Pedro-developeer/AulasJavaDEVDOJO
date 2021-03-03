public class ControleDeFluxo1 {
    public static void main(String[] args) {
        //idade < 15 categoria infatil
        //idade >= 15 && idade <18 juvenil
        //idade >=18 adulto
        int idade = 15;

        if (idade < 15) {
            System.out.println("categorial infatil");
        }else if (idade>=15 && idade <18) {
            System.out.println("categoria juvenil");
        }else {
            System.out.println("Categoria adulto");
        }
    }
}
