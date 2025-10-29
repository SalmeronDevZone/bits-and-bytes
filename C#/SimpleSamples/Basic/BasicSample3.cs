using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2   // Ejercicios arrays online.
{
    class Program
    {
        static void Main(string[] args)
        {

            

        }

        static void ejercicio1()
        {
            // Crea un array de 10 posiciones, con valores puestos por ti y muestra el array.

            //int[] arreglo = new int[10] { 3, 4, 5, 6, 7, 34, 654, 32, 14, 67 } ;

            int[] arreglo = new int[10];
            arreglo[0] = 10;
            arreglo[1] = 20;
            arreglo[2] = 30;
            arreglo[3] = 40;
            arreglo[4] = 50;
            arreglo[5] = 60;
            arreglo[6] = 70;
            arreglo[7] = 80;
            arreglo[8] = 90;
            arreglo[9] = 100;

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine($"Valor en la posicion {i} es {arreglo[i]}");
            }




        }

        static void ejercicio2()
        {
            // Crea un array de 10 posiciones, pide los valores por consola y muestra el array.


            int[] array = new int[10];

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("El valor número " + (i + 1) + " es: ");
                array[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine($"En la posición {i}, el valor es {array[i]}");
            }


        }

        static void ejercicio3()
        {
            //  Sumar los valores de un array y mostrar el resultado.

            int[] array = new int[5] { 2, 6, 7, 5, 34 };

            int resultado = 0;

            for (int i = 0; i < 5; i++)
            {
                resultado += array[i];
            }

            Console.WriteLine($"El resultado de la suma del array es {resultado}");


        }

        static void ejercicio4()
        {
            // Hacer la media de los valores de un array y mostrar el resultado.

            int[] array = new int[] { 2, 6, 10 };

            int contador = 0;

            int suma = 0;

            for (int j = 0; j < 3; j++)
            { 
                suma += array[j];

                contador++;
            }

            Console.WriteLine("El resultado es: " + (suma/contador));

            // Sin 'contador' se podría haber resuelto con array.lenght.
        }

        static void ejercicio5()
        {
            // Dado un array de numeros con el metodo Sort,
            // ordenalos y muestra su contenido.

            int[] arreglo = new int[] { 3, 34, 665, 32, 1, 98 };

            Array.Sort(arreglo);

            for ( int j = 0; j < arreglo.Length; j++)
            {
                Console.WriteLine(arreglo[j]);
            }


        }

        static void ejercicio6()
        {
            //Dado un array de números, muestra el mayor y el menor.

            int[] arreglo = new int[5];

            arreglo[0] = 100;
            arreglo[1] = 200;
            arreglo[2] = 150;
            arreglo[3] = 20;
            arreglo[4] = 30;

            int variable = arreglo[0];
            int variable2 = arreglo[0];

            for (int j = 0;j < 5; j++)
            {
               
                if (variable < arreglo[j])
                {
                    variable = arreglo[j];
                }
            }

            for ( int i = 0; i < 5; i++)
            {
                if (arreglo[i] < variable2)
                {
                    variable2 = arreglo[i];
                }
            }


            Console.WriteLine($"El número mayor es {variable} y el menor es {variable2}");

        }
    }
}
