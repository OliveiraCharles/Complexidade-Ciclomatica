import java.util.Scanner;

public class ContratacaoFuncionario {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /*[1]: Coleta da idade do funcionário*/

    System.out.println("Informe a idade do funcionário: ");
    int idade = scanner.nextInt();

    /*[2]: Caso tenha menos de 16 anos de idade*/

    if (idade < 16) {
      System.out.println(
        "A empresa não contrata funcionários com menos de 16 anos."
      );
      /*[3]: Caso tenha entre 16 e 18 anos de idade*/

    } else if (idade >= 16 && idade <= 18) {
      System.out.println("O funcionário pode ser contratado em tempo parcial.");
      /*[4]: Caso tenha entre 19 e 55 anos de idade*/

    } else if (idade >= 19 && idade <= 55) {
      System.out.println(
        "O funcionário pode ser contratado em período integral."
      );
      /*[5]: Caso tenha mais de 55 anos de idade*/

    } else {
      System.out.println(
        "A empresa não contrata funcionários com mais de 55 anos."
      );
    }

    /*[6]: Fim do Programa*/

    scanner.close();
  }
}
