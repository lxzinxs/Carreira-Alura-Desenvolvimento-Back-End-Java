import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                Escolha o exercicio que deseja acessar:
                [ 1 ] - Temperatura
                [ 2 ] - Média
                [ 3 ] - Nome
                [ 4 ] - Valor total
                [ 5 ] - Conversão
                [ 6 ] - Desconto
                """);
        int opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                Exercicio_01();
                break;
            case 2:
                Exercicio_02();
                break;
            case 3:
                Exercicio_03();
                break;
            case 4:
                Exercicio_04();
                break;
            case 5:
                Exercicio_05();
                break;
            case 6:
                Exercicio_06();
                break;
        }
        teclado.close();
    }

    //Exercicio 01
    public static void Exercicio_01(){
        double celsius = 37.0;
        double fahrenheit;

        fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("37 em Celsius é o mesmo que %.2f em fahrenheit", fahrenheit);
    }

    //Exercicio 02
    public static void Exercicio_02(){
        double nota1 = 8.3;
        double nota2 = 3.4;

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média das notas é %.2f", media);
    }

    //Exercicio 03
    public static void Exercicio_03(){
        char letra = 'V';
        String texto = "A primeira letra do nome da minha namorada é: ";

        System.out.println(texto + letra + "!");
    }

    //Exercicio 04
    public static void Exercicio_04(){
        double precoProduto = 127.56;
        int quantidade = 6;

        double valorTotal = precoProduto * quantidade;

        System.out.printf("O valor total é: %.2f", valorTotal);
    }

    //Exercicio 05
    public static void Exercicio_05(){
        double valorEmDolares = 657.75;
        double reais = 4.94;

        double valorEmReais = valorEmDolares * reais;

        System.out.printf("O valor em reais é: %.2f", valorEmReais);
    }

    //Exercicio 06
    public static void Exercicio_06(){
        double precoOriginal = 100.00;
        double percentualDesconto = 10;

        double desconto = ((precoOriginal) * (percentualDesconto / 100));
        double total = precoOriginal - desconto;

        System.out.printf("O valor com desconto é: %.2f", total);
    }
}