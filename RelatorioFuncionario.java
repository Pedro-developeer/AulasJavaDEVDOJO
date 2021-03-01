public class RelatorioFuncionario {
    public static void main(String[] args) {
        String nome = "Pedro";
        String salario = "R$7780,90";
        String sexo = "Masculino";
        String idade = "18 anos";
        String estado_civil = "Solteiro";
        System.out.println ("O trabalhador(a) "+nome+" do sexo "+sexo+", idade "+idade+", estado civil "+estado_civil+"e salário "+salario+" está empregado nesse estabelicimento");
    }
}
/*OS 8 TIPOS DE DADOS PRIMITIVOS EM JAVA
A linguagem de programação Java é fortemente tipada, o que significa que todas as variáveis ​​devem primeiro ser declaradas antes de poderem ser utilizadas. Isto implica que em Java devemos primeiro informar o tipo da variável e o nome, por exemplo:

int x = 1;

Neste caso a variável x é de tipo inteira e possui o valor inicial de 1. Um tipo de dado determina quais
 valores podem ser armazenados em uma determinada variável, além das operações que podem ser executadas
 com a mesma. Além de int, a linguagem de programação Java suporta sete outros tipos de dados primitivos.
 Um tipo de dado primitivo é pré-definido pela linguagem e é chamado por uma palavra reservada. Os oito
 tipos primitivos de dados suportados pela linguagem de programação Java são:

byte: O tipo de dado byte pode assumir valores inteiros positivos ou negativos e requer 8 bits para ser
implementado. O valor mínimo de uma variável byte é de -128 e o valor máximo é de 127. O tipo de dado byte
pode ser útil para economizar espaços de memória em matrizes de grandes dimensões, em casos que sejam viáveis.
 Variáveis tipo byte também podem ser usadas ​​no lugar de variáveis int de tal modo que seus limites
 ajudem a clarear o seu código, o fato de que uma variável byte é limitada pode servir como uma forma de
 documentação.

short: O tipo de dado short pode assumir valores inteiros positivos ou negativos e requer 16 bits para ser
 implementado. O valor mínimo de uma variável short é de -32.768 e o valor máximo de 32.767. Tal como acontece
 com byte, as mesmas diretrizes se aplicam: você pode usar um short para economizar memória em arrays grandes,
 em situações em que as economias seja realmente importante.

int: O tipo de dado int pode assumir valores inteiros positivos ou negativos e requer 32 bits para ser
implementado. O valor mínimo de uma variável int é  de -2.147.483.648 e o valor máximo de 2.147.483.647.
Para valores inteiros, esse tipo de dado é geralmente a escolha padrão, a menos que haja uma razão
(como citado acima) para escolher outra tipo. Este tipo de dado provavelmente será grande o suficiente
 para os números que seu programa irá utilizar.

long: O tipo de dado long pode assumir valores inteiros positivos ou negativos e requer 64 bits para ser
implementado. O valor mínimo de uma variável long é  de -9.223.372.036.854.775.808 e o valor máximo de
9.223.372.036.854.775.807. Use este tipo de dado é utilizado quando você precisa de um intervalo de
valores maior do que os previstos por int.

float: O tipo de dado float é de precisão simples de 32 bits IEEE 754 ponto flutuante(traduzindo, é
preciso). Tal como acontece com as recomendações para byte e short, use float (em vez de double), se
você precisa economizar memória em grandes conjuntos de números decimais. Este tipo de dado nunca deve
ser usado para valores muito preciso, como moeda. Para isso, você vai precisar usar a classe java.math.
BigDecimal(se isso não faz muito sentido não se preocupe, iremos falar disso em vídeo aulas futuras).

double: O tipo de dado double é de dupla precisão de 64 bits IEEE 754 ponto flutuante(traduzindo, é
 preciso pra car**ho). Para valores decimais, este tipo de dado é geralmente a opção padrão. Como
  mencionado acima, este tipo de dado não deve ser utilizado para valores como moeda.

boolean: O tipo de dado boolean tem apenas dois valores possíveis: true e false(verdadeiro/falso).
Este tipo de dado representa um bit de informação, mas o seu “tamanho” não é algo que é definido com
 precisão.

char: O tipo de dado char é um caractere de 16 bits único Unicode. Ela tem um valor
mínimo de ‘\ u0000’ (ou 0), e um valor máximo de ‘\ uffff’ (ou 65535.

 */