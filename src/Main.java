public class Main {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();

        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);

        Klient klient1 = new Klient("Ela", "Kinnya", "ela@example.com");
        Klient klient2 = new Klient("Julia", "Nowak", "julka@example.com");
        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);

        system.dokonajRezerwacji(klient1, koncert);
        system.dokonajRezerwacji(klient1, teatr);
        system.dokonajRezerwacji(klient2, koncert);

        System.out.println("Rezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + ":");
        klient1.wyswietlRezerwacje();

        system.zmienCeneWydarzenia("Koncert Symphony", 150.0);

        System.out.println("Rezerwacje klienta " + klient1.getImie() + " " + klient1.getNazwisko() + " po zmianie ceny:");
        klient1.wyswietlRezerwacje();
        System.out.println("Rezerwacje klienta " + klient2.getImie() + " " + klient2.getNazwisko() + " po zmianie ceny:");
        klient2.wyswietlRezerwacje();
    }
}