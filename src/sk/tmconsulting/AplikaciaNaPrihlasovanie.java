package sk.tmconsulting;

// Aplikacia bude sluzit na registraciu pouzivatelov, cize bude vyzadovat zadanie login-u a hesla

import sk.tmconsulting.model.Pouzivatel;

public class AplikaciaNaPrihlasovanie {
    public static void main(String[] args) {
        String login = "admin";
        String heslo = "Ahoj"; // sifrujeme obsah premennej heslo

        Pouzivatel existujuciPouzivatel = new Pouzivatel(); // vytvoreny prazdny objekt pouzivatel
        existujuciPouzivatel.setLogin(login);
        existujuciPouzivatel.setPassword(heslo); // heslo zasifrujeme prostrednictvom setPassword

        System.out.println(existujuciPouzivatel.getPassword());


        // Pouzivatel sa ide prihlasit
        String prihlasovaciLogin = "admin";
        String prihlasovacieHeslo = "Ahoj";

        Pouzivatel prihlasenyPouzivatel = new Pouzivatel();
        prihlasenyPouzivatel.setLogin(prihlasovaciLogin);
        prihlasenyPouzivatel.setPassword(prihlasovacieHeslo);


        if (existujuciPouzivatel.getLogin().equals(prihlasenyPouzivatel.getLogin()) &&  existujuciPouzivatel.getPassword().equals(prihlasenyPouzivatel.getPassword())) {
            System.out.println("Je prihlásený!");
        } else {
            System.out.println("Prihlásenie ZLYHALO!");
        }

        // System.out.println(pouzivatel.password); // nepojde, neda sa pristupovat privatnym premennym triedy

    }
}
