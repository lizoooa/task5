import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            klient.dodajRezerwacje(wydarzenie);
            System.out.println("Rezerwacja dokonana dla klienta: " + klient.getImie() + " " + klient.getNazwisko());
        } else {
            System.out.println("Brak dostępnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
        }
    }


    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient kl : klienci) {
            if (kl.getNazwisko().equals(nazwisko)) {
                return kl;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);  // Ищем событие
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);  // Меняем цену
            System.out.println("Cena wydarzenia " + nazwa + " została zmieniona na: " + nowaCena);
        } else {
            System.out.println("Nie znaleziono wydarzenia o nazwie: " + nazwa);
        }
    }
}