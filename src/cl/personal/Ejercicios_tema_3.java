package cl.personal;

public class Main {

    public static void main(String[] args) {
	    System.out.println(sumarNumeros(2, 5, 8));
        Coche miCoche = new Coche();
        miCoche.aumentarNroPuertas(1);
        System.out.println(miCoche.nroPuertas);
    }

    public static int sumarNumeros(int a, int b, int c){
        return a + b + c;
    }
}

class Coche
{
    public int nroPuertas = 0;

    public void aumentarNroPuertas(int a){
        this.nroPuertas += a;
    }
}
