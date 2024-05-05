
public class MainLibro_02 {
    public static void main(String[] args) {
        VettoreLibro_02[] vettlibro = new VettoreLibro_02[10];

        // Initializing the array with new book instances
        vettlibro[0] = new VettoreLibro_02("Libro Uno", 300, "Thomas", 12);
        vettlibro[1] = new VettoreLibro_02("Libro Due", 150, "John", 5);
        vettlibro[2] = new VettoreLibro_02("Libro Tre", 230, "Anna", 9);
        vettlibro[3] = new VettoreLibro_02("Libro Quattro", 500, "Maria", 20);
        vettlibro[4] = new VettoreLibro_02("Libro Cinque", 123, "Luigi", 6);
        vettlibro[5] = new VettoreLibro_02("Libro Sei", 343, "Giorgio", 14);
        vettlibro[6] = new VettoreLibro_02("Libro Sette", 50, "Elisa", 10);
        vettlibro[7] = new VettoreLibro_02("Libro Otto", 198, "Sergio", 8);
        vettlibro[8] = new VettoreLibro_02("Libro Nove", 111, "Chiara", 4);
        vettlibro[9] = new VettoreLibro_02("Libro Dieci", 444, "Marco", 22);

        for (int i = 0; i < vettlibro.length; i++) {
            if (vettlibro[i].getPagine() < 100) {
                vettlibro[i].stampaInfo();
            }
        }
    }
}
