package task3_3;

public class Main {
public static void main(String[]args){
    Tourist_Place india=new Tourist_Place("Manali","10:00AM to 5:00PM",500  );
    india.addFamousFor("Mountains").addFamousFor("Skewing").addFamousFor("Snowfall").addFamousFor("Trekking");

    india.rate(5);
    india.rate(5);
    india.rate(3);


    System.out.println("Rating is: "+india.starRating);
}
}

//Rating is: 4.3333335