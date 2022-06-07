//Nombre: Hanna Ximena Anaya Martínez
//Matrícula: 010341153
//Fecha: 01/06/2022

package Package_Alumnos;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        //Declaramos los arreglos definiendo el tipo de dato de cada uno con un tamaño de 4
        String[] nombreAlumno = new String[4];
        int[] edadAlumno = new int[4];
        String[] sexoAlumno = new String[4];

        //Asignamos valores a los elementos
        nombreAlumno[0] = "Luis Juan Rodríguez Mena";
        nombreAlumno[1] = "Erika Vianey López Mendez";
        nombreAlumno[2] = "Juan Luis Guerra Liceo";
        nombreAlumno[3] = "Luisa María Baez Del Muro";

        edadAlumno[0] = 35;
        edadAlumno[1] = 35;
        edadAlumno[2] = 56;
        edadAlumno[3] = 43;

        sexoAlumno[0] = "M";
        sexoAlumno[1] = "F";
        sexoAlumno[2] = "M";
        sexoAlumno[3] = "F";

        //Imprimimos los valores de los arreglos
        System.out.println("Alumno 1: ");
        System.out.println("Nombre: " + nombreAlumno[0]);
        System.out.println("Edad: " + edadAlumno[0]);
        System.out.println("Sexo: " + sexoAlumno[0]);

        System.out.println("Alumno 2: ");
        System.out.println("Nombre: " + nombreAlumno[1]);
        System.out.println("Edad: " + edadAlumno[1]);
        System.out.println("Sexo: " + sexoAlumno[1]);

        System.out.println("Alumno 3: ");
        System.out.println("Nombre: " + nombreAlumno[2]);
        System.out.println("Edad: " + edadAlumno[2]);
        System.out.println("Sexo: " + sexoAlumno[2]);

        System.out.println("Alumno 4: ");
        System.out.println("Nombre: " + nombreAlumno[3]);
        System.out.println("Edad: " + edadAlumno[3]);
        System.out.println("Sexo: " + sexoAlumno[3]);


        //Ingreso de datos de los alumnos a través del teclado.

        System.out.println("¿Cuántos alumnos vas a ingresar?");

        Scanner arreglo = new Scanner(System.in);
        int numAlumnos = arreglo.nextInt();

        Alumnos[] alumnosIngresados = new Alumnos[numAlumnos];

        for(int i = 0; i < numAlumnos; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingresa el nombre del alumno " + i);
            String nombre = sc.next();

            System.out.println("Ingresa la edad del alumno " + i);
            int edad = sc.nextInt();

            System.out.println("Ingresa el sexo del alumno " + i);
            String sexo = sc.next();

            alumnosIngresados[i] = new Alumnos(i, nombre, edad, sexo);
            }

        //Impresión de alumnos ingresados
        System.out.println("Los alumnos que ingresaste por teclado son los siguientes: ");
        for(int i = 0; i < alumnosIngresados.length; i++)
        {
            System.out.println(alumnosIngresados[i].getInfo());
        }
    }
}