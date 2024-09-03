package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = leitor.nextInt();

        try
        {
            retornaNumero(numero1, numero2);
        }
        catch (Exception exception)
        {
            retornaNumero(numero1, numero2);
        }
    }

    static void retornaNumero(int numero1, int numero2) throws Exception
    {
        // validar se numero1 é maior que numero2 e fazer lançar a exceção
        if (numero2 < numero1)
        {
            System.out.print("O segundo número deve ser maior que o primero número.");
        }

        for (int i = numero1; i <= numero2; i++)
        {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
