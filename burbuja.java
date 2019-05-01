import java.io.*;
/**
 *<p>Clase que permite introducir una lista de parámetros y ordenarlos de mayor a menor</p>
 *<p>La clase contiene los métodos necesarios para:
 *<ul>
 * <li>Elegir la cantidad de números que se van a introducir</li>
 * <li>Introducir los números deseados</li>
 * <li>Ordenar los números de mayor a menor</li>
 *</ul>
 *</p>
 *
 *@author Daniel Villasenín Martínez
 *@since 29/04/2019
 *@version 1.0
 */
public class burbuja{
/**
 * Clase principal del programa
 * @param arg
 * @throws IOException 
 */
    
public static void main(String arg[]) throws IOException {
    
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.print("\n Ingrese Numero de Datos a Ingresar : ");
int tam = Integer.parseInt(in.readLine());
int arr[] = new int[tam];

System.out.println();
/**Mediante o uso de parseInt convertimos a cadea introducida por teclado
 * nun número enteiro,que representará a cantidade de números que introduciremos.
*/
int j = 0;
for (int i = 0 ; i < arr.length;i++)
{
j+=1;
System.out.print("Elemento " + j + " : ");
arr[i] = Integer.parseInt(in.readLine());
}
burbuja(arr);
}
//Bucle que guía al usuario a la hora de introducir los números.
static void burbuja(int arreglo[])
{
for(int i = 0; i < arreglo.length - 1; i++)
{
for(int j = 0; j < arreglo.length - 1; j++)
{
if (arreglo[j] < arreglo[j + 1])
{
int tmp = arreglo[j+1];
arreglo[j+1] = arreglo[j];
arreglo[j] = tmp;
}
}
}
for(int i = 0;i < arreglo.length; i++)
{
System.out.print(arreglo[i]+"\n");
}
}
}
//Método que reordena los números introducidos de mayor a menor