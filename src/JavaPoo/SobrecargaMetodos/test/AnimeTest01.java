package JavaPoo.SobrecargaMetodos.test;

import JavaPoo.SobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    static void main() {
        Anime anime = new Anime();
        anime.init("Akurama Higoko", "Manga", 2026, 10);
        anime.imprimir();
    }
}
