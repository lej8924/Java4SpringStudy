public class Main {
    public static void main(String[] args) {
        Student eunjae = new Student("이은재");
        eunjae.goBus();
        eunjae.goSubway();
        eunjae.goTaxi();
    }
}

class Student{
    String name;

    Student(String name){
        this.name= name;
    }

    void goBus(){
        System.out.println("버스를 탄다.");
    }
    void goTaxi(){
        System.out.println("택시를 탄다.");
    }
    void goSubway(){
        System.out.println("지하철을 탄다.");
    }

}

class Bus{
    int BusNum;
    int people;
    int income;

    public Bus(int busNum, int people, int income) {
        this.BusNum = busNum;
        this.people = people;
        this.income = income;
    }
}
class Taxi {
    int TaxiNum;
    int people;
    int income;

    public Taxi(int taxiNum, int people, int income) {
        this.TaxiNum = taxiNum;
        this.people = people;
        this.income = income;
    }
}

class Subway{
    int SubwayNum;
    int people;
    int income;

    public Subway(int subwayNum, int people, int income) {
        this.SubwayNum = subwayNum;
        this.people = people;
        this.income = income;
    }
}