package task3_3;

import java.util.*;

public class Tourist_Place {
        String name,workingHour;

        int entryTicketPrice,noOfRatings;

        float starRating ;
        List<String> famousFor ;

        public Tourist_Place( String name, String  workingHour, int entryTicketPrice){
            famousFor = new ArrayList<>();
            noOfRatings=0;
            starRating = 0;
        }
        void rate(int stars){
            starRating = starRating*noOfRatings + stars;
            noOfRatings++;
            starRating /= noOfRatings;
        }
        Tourist_Place addFamousFor(String s){
            famousFor.add(s);
            return this;
        }
        boolean isPlaceOpen(){
            return true;
        }
    }

