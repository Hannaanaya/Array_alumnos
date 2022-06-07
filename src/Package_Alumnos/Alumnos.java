package Package_Alumnos;

public class Alumnos {
    public String nombre;
    public int edad;
    public String sexo;
    public int alumnoN;
    public int alumnoN1;

    public Alumnos(int alumnoN, String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.alumnoN= alumnoN;
        this.alumnoN1=alumnoN+1;
    }

    public String getInfo()
    {
        String cadena = "\nAlumno " + this.alumnoN1+ " en el índice " + this.alumnoN + " del arreglo"
        + "\nNombre: " + this.nombre
        + "\nEdad: " + this.edad
        + "\nEdad: " + this.sexo;
        return  cadena;
    }
}
