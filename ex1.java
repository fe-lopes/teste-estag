import java.util.Scanner;

public class ex1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String texto = input.nextLine();
        
        //Remoção dos espaços em branco do texto
        texto = texto.replaceAll("\\s+", "");
        
        //Checa se o texto possui ao menos 2 caracteres para evitar erros
        if (texto.length() <= 1)
            System.out.println("O texto deve possuir pelo menos 2 caracteres.");
        else
            //Chama a função
            palindromo(texto);
    }
    
    //Função recursiva para determinar o palindromo
    public static void palindromo(String texto) {
        //Tamanho da string apenas para facilitar
        int tamanho = texto.length();
        
        //Verifica se o primeiro e o último caractere são iguais
        if (texto.charAt(0) == texto.charAt(tamanho - 1))
        {
            //Sendo iguais, remove esses carácteres das pontas
            texto = texto.substring(1, tamanho - 1);
            
            //Verifica se eram os dois últimos caracteres (string par)
            //Ou se sobrou apenas um (string ímpar)
            if (texto.length() <= 1)
            {
                System.out.println("O texto eh um palindromo.");
            }
            else
            {
                //Chama a função novamente
                palindromo(texto);
            }
        }
        else
            System.out.println("O texto nao eh um palindromo.");
    }
}
