package app;

import List.LinkedLista;

public class Main {

    public static LinkedLista<Integer> list1;
    public static LinkedLista<Integer> list2;


    public static void main(String[] args) {
        EjerciciosExtra ej = new EjerciciosExtra();
        list1 = new LinkedLista<>();
        list2 = new LinkedLista<>();

        for (int i = 0; i < 100; i++) {
            list1.Add(i);
            list2.Add(i);
        }

        if (ej.SonIguales(list1, list2)) {
            System.out.println("Son iguales al chile");
        } else {
            System.out.println("No son iguales la neta");
        }

        System.out.println("El elemento existe en la posición: " + ej.ExisteElemento(99, list1));

        System.out.println("Las ocurrencias son: " + ej.Ocurrencia(99, list1));

        System.out.println("La suma es: " + ej.Suma(list1));

        System.out.println("El máximo es: " + ej.Maximo(list1));
    }
}
