using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

            List<string> list = new List<string> { "Enero", "febrero", "marzo", "abril","mayo", "junio", "julio"
            , "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

            int result1 = ejercicio1(array);

            int result2 = ejercicio2(array);

            List<string> result3 = Ejercicio3(list);



            // Console.WriteLine($"La suma del array es {result1}");
            // Console.WriteLine($"El numero mayor en el array es {result2}" );
           /* Console.WriteLine("Los nombres con mas de 5 caracteres son:");

            foreach( string j in result3)
            {
                Console.WriteLine(j);
            }*/ 

        }

        /* Suma de Elementos: Escribe un programa que tome una matriz de números enteros
         * como entrada y calcule la suma de todos los elementos utilizando un bucle foreach.*/

        public static int ejercicio1(int[] arr) {

            int suma = 0;

            foreach ( int j in arr )
            {
                suma += j;
            }

            return suma;
        }

        /*
         Búsqueda de Elemento Máximo: Escribe un programa que encuentre el elemento máximo en una lista de 
        números enteros utilizando un bucle foreach
        */

        static int ejercicio2(int[] arr) 
        {
            int max = int.MinValue;

            foreach ( int j in arr)
            {
                if ( j > max ) max = j;
            }

            return max;
        }


        /*
         Filtrado de Elementos: Escribe un programa que tome una lista de cadenas como entrada y filtre solo las
        cadenas que tengan una longitud mayor que 5 caracteres utilizando un bucle foreach. Luego,
        muestra las cadenas filtradas en la consola.*/

        static List<string> Ejercicio3(List<string> list)
        {
            List<string> filtro = new List<string>();

            foreach (string j in list)
            {
                if (j.Length > 5)
                {
                    filtro.Add(j);
                }
            }
            return filtro;
        }
    }


}
