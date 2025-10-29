using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arreglo = new int[] { 1, 2, 3, 4, 5, 60, 7, 8, 9 };
        }

        public static void ejercicio1(String nombre)
        {
            Console.WriteLine($"Encantado de saludarte {nombre}. ");
            //  Crea un método que nos salude, pasándole un nombre por parámetro.
        }

        public static string ejercicio1B(String nombre)
        {
            return "Buenas tardes " + nombre;

            /*Este código iria en el Main:
             * 
             * Console.WriteLine("Introduce el nombre: ");

            String nomb = Console.ReadLine();

            String saludo = ejercicio1B(nomb);

            Console.WriteLine(saludo); */
        }

        public static int ejercicio2(int num1, int num2)
        {
            // Crea una función que sume dos números pasados por parámetros,
            // devolverá el resultado.

            return  num1 + num2;
            /* Codigo Main:
             * int resultado = ejercicio2(2, 3);
            Console.WriteLine(resultado);
            */
        }

        public static void ejercicio3(int[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);

                /* Codigo MAIN:
                 * 
                 * int[] arrayA = new int[] { 1, 2, 3, 435, 56, 87, 32 };
            ejercicio3(arrayA);

                */

            }
        }

        public static int ejercicio4(int[] arr)
        {
            // Crea una función que devuelva la suma de un array.

            int suma = 0;

            for(int i = 0;i < arr.Length; i++)
            {
                suma += arr[i];
            }
            return suma;

            // Main:
            /*
            int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int resultado = ejercicio4(arreglo);
            Console.WriteLine($"El resultado de la suma del array es: {resultado}");*/

        }

        public static float ejercicio5(int[] arr)
        {
            //  Crea una función que devuelva la media de un array.
            int suma = 0;

            for (int i = 0; i < arr.Length; i++){
                suma += arr[i];
            }
            return suma/arr.Length;

            /* Codigo Main:
             * int[] arreglo = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            float media = ejercicio5(arreglo);
            Console.WriteLine($"La media es {media}");*/
        }

        public static int ejercicio6(int[] arr)
        {
            //Crea una función que devuelva el número mayor de un array.

            int max = arr[0];

            for (int i = 1; i < arr.Length; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
            }
            return max;
            /* main:
             * int result = ejercicio6(arreglo);
            Console.WriteLine("El numero maximo es " + result);*/

        }

        public static int ejercicio7(int[] arr)
        {
            //Crea una función que devuelva la posición del número menor de un array.

            int posicion = 0;

            for (int i = 1; i < arr.Length; i++)
            {
                if (arr[i] < posicion)
                {
                    posicion = i;
                }
            }
            return posicion;

            /*Main:
             * int restul = ejercicio7(arreglo);

            Console.WriteLine($"El menor es la posicion -> {restul}");*/
        }
    }
}
