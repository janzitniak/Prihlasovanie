package sk.tmconsulting.model;

import java.util.Base64;

public class Pouzivatel {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    /**
     * Nastaví heslo zašifrované prostredníctvom stavaného algoritmu Base64 z balíčka (package) java.util
     * Viac o šifre sa môžete dozvedieť na adrese <a href="https://cs.wikipedia.org/wiki/Base64">Base64 na Wikipédii</a>.
     * Argumentom je heslo (typu String), ktoré sa zašifruje.
     * <p>
     * Metóda nevracia žiadnu hodnotu
     *
     * @param password je text, ktorý sa bude šifrovať
     * @return nevracia nič
     */
    public void setPassword(String password) {
        // logika, ktora zasifruje heslo
        Base64.Encoder enc = Base64.getEncoder(); // na zasifrovanie pouzijeme sifru Base64
        String encodedPassword = enc.encodeToString(password.getBytes()); // a jej metodu encodeToString
        this.password = encodedPassword; // zasifrovane heslo ulozime do premennej password tejto triedy (teda triedy Prihlasenie)
    }


}
