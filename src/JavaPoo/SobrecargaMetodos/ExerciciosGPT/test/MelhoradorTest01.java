package JavaPoo.SobrecargaMetodos.ExerciciosGPT.test;

import JavaPoo.SobrecargaMetodos.ExerciciosGPT.dominio.Melhorador;

public class MelhoradorTest01 {
    public static void main(String [] args) {
       Melhorador anime1 = new Melhorador();
       Melhorador anime2 = new Melhorador();
       Melhorador anime3 = new Melhorador();
       Melhorador anime4 = new Melhorador();

       anime1.init("Saikaro raju");
       anime2.init("Lokome Taku", "Mangá");
       anime3.init("Karico Rakamo", "TV", 1900);
       anime4.init("Karamo Jaru", "Desenho", 1980, 21.92);

       anime1.imprimir();
       anime2.imprimir();
       anime3.imprimir();
       anime4.imprimir();
    }

}
