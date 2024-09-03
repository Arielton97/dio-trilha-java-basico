package loiane_training.conditions.switch_case;

import java.util.Scanner;

public class Switch_Case
{
    public static void main(String[] args)
    {
        // Média uniasselvi
        // Declaração das variáveis
        double resultado, avaliacao1, avaliacao2, avaliacaoFinalDiscursiva, avaliacaoFinalObjetiva;

        // Objeto para ler a entrada das notas
        Scanner entrada = new Scanner(System.in);

        // Obter as notas
        System.out.print("Digite a nota da Avaliação 1: ");
        avaliacao1 = entrada.nextDouble();

        System.out.print("Digite a nota da Avaliação 2: ");
        avaliacao2 = entrada.nextDouble();

        System.out.print("Digite a nota da Avaliação Final (Discursiva): ");
        avaliacaoFinalDiscursiva = entrada.nextDouble();

        System.out.print("Digite a nota da Avaliação Final (Objetiva): ");
        avaliacaoFinalObjetiva = entrada.nextDouble();

        resultado = ((avaliacao1 * 2) + (avaliacao2 * 2) + (avaliacaoFinalDiscursiva * 2) + (avaliacaoFinalObjetiva * 4) / 10);

        System.out.print("Cálculo da média: " + resultado);
    }
}
