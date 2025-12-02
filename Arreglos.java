import java.util.Arrays;
public class Arreglos
{
    public static void main(String[]args)
    {
        int numeros[]={15,167,89,45};
        int numeros2[]={1,2,3};

        System.out.println("Array Numeros de forma ascendente");
        for(int i=0;i<numeros.length;i++)
        {
            Arrays.sort(numeros);
            System.out.println("Elemento "+(i+1)+": "+numeros[i]);
        }
        System.out.println("Array Numeros2 de forma ascendente");
        for(int i=0;i<numeros2.length;i++)
        {
            Arrays.sort(numeros2);
            System.out.println("Elemento "+(i+1)+": "+numeros2[i]);
        }
    }
}