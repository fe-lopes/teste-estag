/*
### ALGORITMO ###

INICIO
	Criar vetor de inteiros ARR com 5 elementos
	Ler (ARR)
	Criar int TAMANHO = tamanho do vetor ARR
	Criar int SOMA = ARR[0]
	Criar int MIN = ARR[0]
	Criar int MAX = ARR[0]
	
	Criar int I = 1
	Enquanto (I < TAMANHO)
		SOMA = SOMA + ARR[I]
		SE (ARR[I] > MAX)
			ENTÃO MAX = ARR[I]
		SE (ARR[I] < MIN)
			ENTÃO MIN = ARR[I]
		I = I + 1
	Fim-enquanto

	Escrever("Valor mínimo de soma com 4 elementos = ", SOMA - MAX)
	Escrever("Valor máximo de soma com 4 elementos = ", SOMA - MIN)
FIM
*/

import java.util.Arrays;

public class ex5
{
    public static void main(String[] args)
    {
        //Declaração do array de exemplo
        int[] array = new int[]{1, 3, 5, 7, 9};
        int min = 0;
        int max = 0;
        
        //Ordena os elementos do array em ordem crescente
        Arrays.sort(array);

        //Soma os 4 primeiros elementos para obter o valor mínimo
        //E soma os 4 últimos para obter o valor máximo
        min = array[0] + array[1] + array[2] + array[3];
        max = array[1] + array[2] + array[3] + array[4];
        
        System.out.printf("Valor minimo de soma com 4 elementos: %d\n", min);
        System.out.printf("Valor maximo de soma com 4 elementos: %d\n", max);
    }
}
