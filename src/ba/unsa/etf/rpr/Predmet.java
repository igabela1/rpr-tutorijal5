package ba.unsa.etf.rpr.tutorijal5;

import java.util.List;

public class Predmet {
    String ime;
    int brojECTS;
    boolean obavezni;
    Student[] studenti;
    int brojStudenata;
    int brojSemestra;
    public Predmet(String ime,int brojECTS,boolean obavezni,int brojSemestra){
        this.ime=ime;
        this.brojECTS=brojECTS;
        this.obavezni=obavezni;
        this.brojSemestra=brojSemestra;
    }
    public int dajBrojECTS(){
        return brojECTS;
    }
    public String dajIme(){
        return ime;
    }
    public boolean dajObavezni(){
        return obavezni;
    }
    public int dajBrojSemestra(){
        return brojSemestra;
    }
    public boolean upisiStudentaNaIzborniPredmet(Student neko){
        if(neko.dajBrojECTS()<30 || neko.dajTrenutniSemestar()!=brojSemestra)return false;
        studenti[brojStudenata]=new Student(neko.dajIme(),neko.dajPrezime(),neko.dajTrenutniSemestar());
        brojStudenata++;
        return true;
    }
    public boolean upisiStudentaNaPredmet(Student neko){
        if(brojSemestra==neko.dajTrenutniSemestar()) {
            studenti[brojStudenata] = new Student(neko.dajIme(), neko.dajPrezime(),neko.dajTrenutniSemestar());
            brojStudenata++;
            return true;
        }
        return false;
    }
    public boolean ispisiStudentaSaPredmeta(Student neko){
        boolean ima=false;
        for(int i=0;i<brojStudenata;i++){
            if(studenti[i].dajIme().equals(neko.dajIme()) && studenti[i].dajPrezime().equals(neko.dajPrezime())){
                ima=true;break;
            }
        }
        if(ima==false)return false;
        for(int i=0;i<brojStudenata;i++){
            if(studenti[i].dajIme().equals(neko.dajIme()) && studenti[i].dajPrezime().equals(neko.dajPrezime())){
                for(int j=i;j<brojStudenata-1;j++)
                    studenti[j]=studenti[j+1];
            }
        }
        brojStudenata--;
        return true;
    }
    public Student[] dajStudente(){
        return studenti;
    }


}