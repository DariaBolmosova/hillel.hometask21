package task15;

public class Godzilla {
  int eatPeople;

    public void setEatPeople(int eatPeople) {
        this.eatPeople = eatPeople;
    }

    public  void volumeStomach(){
        if (eatPeople<250){
            System.out.println("СЛИШКОМ ГОЛОДЕН !!!");
        }
         else if (eatPeople>=400){
            System.out.println("СЕЙЧАС ЛОПНУ");
        }
         else {
            System.out.println("ЕЩЕ КОГО-ТО БЫ СЪЕЛ");
        }

    }
}
