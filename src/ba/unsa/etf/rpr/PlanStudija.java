package  ba.unsa.etf.rpr.tutorijal5;
import java.util.List;


public class PlanStudija {
    ba.unsa.etf.rpr.tutorijal5.Student pojedinac;
    ba.unsa.etf.rpr.tutorijal5.Predmet[] predmeti;
    int brojPredmeta;
    public void upisiObavezne(Student pojedinac){
        for(int i=0;i<brojPredmeta;i++){
            if(predmeti[i].dajObavezni()==true && predmeti[i].dajBrojSemestra()==pojedinac.dajTrenutniSemestar()){
                predmeti[i].upisiStudentaNaPredmet(pojedinac);
            }
        }

    }
    public void upisiIzborne(Student pojedinac){
        if(pojedinac.dajBrojECTS()<30){
            for(int i=0;i<brojPredmeta;i++){
                if(predmeti[i].dajObavezni()==false && predmeti[i].dajBrojSemestra()==pojedinac.dajTrenutniSemestar()){
                    predmeti[i].upisiStudentaNaIzborniPredmet(pojedinac);
                }
            }
        }
    }
}

