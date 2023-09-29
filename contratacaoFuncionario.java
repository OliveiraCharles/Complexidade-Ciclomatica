import java.util.Scanner;

public class ContratacaoFuncionario {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

/*------[1]------*/

    System.out.println("Informe a idade do funcionário: ");
    int idade = scanner.nextInt();

/*------[2]------*/

    if (idade < 16) {
      System.out.println(
        "A empresa não contrata funcionários com menos de 16 anos."
      );

/*------[3]------*/

    } else if (idade >= 16 && idade <= 18) {
      System.out.println("O funcionário pode ser contratado em tempo parcial.");

/*------[4]------*/

    } else if (idade >= 19 && idade <= 55) {
      System.out.println(
        "O funcionário pode ser contratado em período integral."
      );

/*------[5]------*/

    } else {
      System.out.println(
        "A empresa não contrata funcionários com mais de 55 anos."
      );
    }

/*------[6]------*/

    scanner.close();
  }
}
