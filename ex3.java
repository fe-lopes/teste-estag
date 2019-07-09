import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String texto = input.nextLine();
        
        String textoInvertido = inverterTexto(texto);
        System.out.println(textoInvertido);
    }
    
    //Função para inverter o texto
    public static String inverterTexto(String texto) {
        if (texto.length() <= 1)
            return texto;
        else
            return inverterTexto(texto.substring(1)) + texto.charAt(0);
    }
}
