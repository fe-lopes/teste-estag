/*
### ALGORITMO ###

INICIO
	Criar vetor de inteiros A
	Ler (A)
	Criar int TAMANHO = tamanho do vetor A
	Criar vetor de inteiros B
	Criar int INDEX = 0

	Criar int I = 0;
	Enquanto (INDEX < TAMANHO)
		I = INDEX;
		Enquanto (I >= 0)
			B[INDEX] = B[INDEX] + A[I]
			I = I - 1
		Fim-enquanto
		INDEX = INDEX + 1
	Fim-enquanto

	Escrever(B)
FIM
*/

import java.util.Arrays;

public class ex2
{
    public static void main(String[] args)
    {
        //Declaração do array de exemplo
        int[] array = new int[]{2, 4, 1, 6, 10};
        
        //Declara um novo array com o mesmo tamanho
        int[] novoArray = new int[array.length];
        
        //Realiza o cálculo para atribuir os valores ao novo array
        int index = 0;
        while (index < novoArray.length)
        {
            for (int i = index; i >= 0; i--)
                novoArray[index] += array[i];
            index++;
        }
        
        //Imprime o novo array
        System.out.println(Arrays.toString(novoArray));
    }
}
