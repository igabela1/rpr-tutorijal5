package  ba.unsa.etf.rpr.tutorijal5;

import java.util.List;

public class Semestar {
    Student[] studenti;
    Predmet[] predmeti;
    int brojStudenata,brojPredmeta,brojSemestra;
    public Semestar(){}
    public int dajBrojStudenata(){
        return brojStudenata;
    }
    public int dajBrojPredmeta(){
        return brojPredmeta;
    }
    public int dajBrojSemestra(){
        return brojSemestra;
    }
    public void upisiStudenta(String ime,String prezime,int brojSemestra){
        studenti[brojStudenata]=new Student(ime,prezime,brojSemestra);
        brojStudenata++;
    }
    public void dodajPredmet(String ime,int brojECTS,boolean status,int brojSemestra){
        predmeti[brojPredmeta]=new Predmet(ime,brojECTS,status,brojSemestra);
        brojPredmeta++;
    }
    public void ispisiStudenta(String ime,String prezime){
        for(int i=0;i<brojStudenata;i++){
            if(studenti[i].dajIme().equals(ime) && studenti[i].dajPrezime().equals(prezime)){
                for(int j=i;j<brojStudenata-1;j++){
                    studenti[j]=studenti[j+1];
                }
            }
        }
        brojStudenata--;
    }

}
