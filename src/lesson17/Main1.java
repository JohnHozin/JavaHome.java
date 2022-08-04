package lesson17;

public class Main1 {
    public static void main(String[] args) {

        TeamRed klass5 = new TeamRed("Пятиклашки");
        TeamRed klass = new TeamRed("Пятиклашки2");
        TeamBlue klass11 = new TeamBlue("Взрослые");

        People p1= new People("Вова",14);
        People p2= new People("Саня",14);
        People p3= new People("Сёма",18);
        People p4= new People("Лина",18);
        klass5.setPeople(p1);
        klass5.setPeople(p2);
        klass11.setPeople(p3);
        klass11.setPeople(p4);

        Game.getWinnerRed(klass5,klass);
    }
}
