using Microsoft.SqlServer.Server;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjerciciosPrincipiante
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Execute Here.
        }

        static void ejercicio1()
        {
            /*
              Crear 3 variables numéricas con el valor que tu quieras y en otra variable
            numérica guardar el valor de la suma de las 3 anteriores. Mostrar por consola.*/

            int num1 = 34;
            int num2 = 75;
            int num3 = 88;

            int suma = num1 + num2 + num3;

            Console.WriteLine($"La suma de las tres variables es {suma}");
        }

        static void ejercicio2()
        {
            /*
             *  Pedir por consola un nombre de persona y el nombre de una ciudad (no hace falta que sean reales o comprobarlos)
             *  y mostrar por pantalla, el siguiente mensaje «Hola » <nombre> » bienvenido a » <ciudad> */

            Console.WriteLine("Hola, cual es tu nombre?");

            string name = Console.ReadLine();

            Console.WriteLine("Dime una ciudad");

            String city = Console.ReadLine();

            Console.WriteLine($"Bienvenido a {city}, {name}");



        }

        static void ejercicio3()
        {
            /*
             * Pedir por consola tu nombre y tu edad y mostrar el siguiente mensaje: «Te llamas » <nombre> » y tienes » <años> » años»
             */

            Console.WriteLine("Como te llamas?");
            String name = Console.ReadLine();

            Console.WriteLine("Cuantos años tienes");
            int edad = int.Parse(Console.ReadLine());

            Console.WriteLine($"Tu llamas {name} y tienes {edad} años.");

            Console.WriteLine($"Te llamas {name} , y el año que viene tendrás " + (edad + 1) + " años.");
        }

        static void ejercicio4()
        {
            // Pedir dos números al usuario por teclado y decir que número es el mayor.

            Console.WriteLine("Introduce el primer número");

            int num1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Introduce el segundo número");

            int num2 = int.Parse(Console.ReadLine());

            if (num1 > num2) Console.WriteLine("El primer número es mayor.");
            if (num1 < num2) Console.WriteLine("El segundo número es mayor");
            else Console.WriteLine("Los números son iguales.");
        }

        static void ejercicio5()
        {
            Console.WriteLine("¿Qué día de la semana es?");
            System.String dia = Console.ReadLine().ToLower();

            switch (dia)
            {
                case "lunes":
                case "martes":
                case "miércoles":
                case "jueves":
                case "viernes":
                    Console.WriteLine("No es fin de semana.");
                    break;

                case "sábado":
                case "domingo":
                    Console.WriteLine("Es fin de semana.");
                    break;

                default:
                    Console.WriteLine("No has introducido un día válido de la semana.");
                    break;
            }

            Console.WriteLine("Fin del programa.");
        }
    
        static void ejercicio6()
        {
            /* Pedir al usuario el precio de un producto(valor positivo) y la forma de pagar(efectivo o tarjeta)
             * si la forma de pago es mediante tarjeta, pedir el numero de cuenta(inventado) */

            Console.WriteLine("Bienvenido.");
            double precio = 0;
            string pin = "";

            do
            {
                Console.WriteLine("Introduce el precio de un producto. No puede ser negativo ni gratis.");
                precio = double.Parse(Console.ReadLine());
            } while (precio  < 0);

            Console.WriteLine("Va a pagar con tarjeta o efectivo");
            string pago = Console.ReadLine().ToLower();

            switch (pago)
            {
                case "tarjeta":
                    Console.WriteLine("Introduzca el número de tarjeta.");
                    pin = Console.ReadLine();
                    break;

                case "efectivo":
                    Console.WriteLine($"El total es {pago}");
                    break;

                default:
                    Console.WriteLine("No ha introducido una forma de pago favorable.");
                    break;
            }

            Console.WriteLine($"El pin de la tarjeta es -> {pin}");
        }

        static void ejercicio7()
        {
            //  Recorre los números del 1 al 100. Usa un bucle for.

            for(int i = 1; i < 101; i++) { Console.WriteLine("Número -> {0}" ,i); }
        }

        static void ejercicio8()
        {
            // bucle for hasta el 100 de números pares.

            for( int i = 2; i <101; i += 2)
            {
                Console.WriteLine($"El numero es {i} .");
            }
        }
        
        static void ejercicio9()
        {
            //Recorre los números del 1 al 100.
            //Muestra los números pares. Usar el tipo de bucle que quieras.

            for (int i = 1; i < 101; i++)
            {
                if (i % 2 == 0 || i % 3 == 0) Console.WriteLine(i);
            }
        }
    }


}
