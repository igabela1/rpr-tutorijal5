package  ba.unsa.etf.rpr.tutorijal5;

import java.util.ArrayList;
import java.util.List;
public class Student {
    String ime,prezime;
    ba.unsa.etf.rpr.tutorijal5.Predmet[] predmeti;
    int brojECTS;
    int trenutniSemestar;
    public Student(String ime,String prezime,int trenutniSemestar){
        this.ime=ime;
        this.prezime=prezime;
        brojECTS=0;
        this.trenutniSemestar=trenutniSemestar;
    }

    public int dajBrojECTS(){return brojECTS;}
    public String dajIme(){
        return ime;
    }
    public String dajPrezime(){
        return prezime;
    }
    public int dajTrenutniSemestar(){
        return trenutniSemestar;
    }


}
