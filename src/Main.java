public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(2,4,5);
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }

public static int suma (int a, int b, int c)
{
   return a + b + c;

}

static class coche {
    public int puertas = 0;

    public void AgregarPuerta()
    {
        this.puertas++;
    }

}



}