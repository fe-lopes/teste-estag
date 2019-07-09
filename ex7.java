/*
### ALGORITMO ###

INICIO
	Criar Int INTERV1
	Criar Int INTERV2
	Ler (INT1)
	Ler (INT2)
	
	Criar int I = INVERV1
	Enquanto (I <= INTERV2)
		SE ((I % 2) != 0)
			ENTÃO escrever(I)
		I = I + 1
	Fim-enquanto
FIM
*/

public class ex7
{
    public static void main(String[] args)
    {
        int min = 2;
        int max = 8;
        
        //Variável de apoio para controlar as vírgulas de maneira bem simples
        boolean flag = true;
        
        System.out.printf("[");
        for (int i = min; i <= max; i++)
        {
			//Se o resto da divisão por 2 não for 0, então é ímpar
            if ((i % 2) != 0)
            {
                if (flag)
                {
                    System.out.printf("%d", i);
                    flag = false;
                }
                else
                    System.out.printf(", %d", i);
            }
        }
        System.out.printf("]\n");
    }
}
