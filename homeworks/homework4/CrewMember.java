//package homeworks.homework4;

//package com.gradescope.lab_four;

public class CrewMember {
    // Parameters
    private int crewId; 
    private String lastName; 
    private String firstName;
    private String position;
    private int [] ratings;
    private int ratingCount = 0;


    public CrewMember(int crewId, String firstName, String lastName, String position, int numRatings){
        this.crewId = crewId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.ratings = new int [numRatings];
        //this.ratingCount = 0;
    }

    public CrewMember(){

    }

    //crew setter
    public void setCrewId(int crewId){
        this.crewId = crewId;
    }
    //crew getter
    public int getCrewId(){
        return crewId;
    }

    //lastName setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    public int [] getRatings(){
        return ratings;
    }

    public void addRating (int rate ){

       if (rate >= 0 && rate <= 100 && ratingCount < ratings.length) {
      ratings[ratingCount] = rate;
        ratingCount++;
       }
    }

    public int avgRatings(){
       

        int sum = 0;
        for (int i = 0; i < ratings.length; i++){
            sum += ratings[i];
        }
        return sum / ratings.length;
    }

    public int maxRating(){
       

        int max = ratings [0];
        for (int i = 0; i < ratings.length; i++){
            if (ratings [i] > max){
                max = ratings [i];
            }
        }
        return max;
    }

    public int minRating (){
       

        int min = ratings [0];
        for (int i = 0; i < ratings.length; i++){
            if (ratings[i] < min){
                min = ratings[i];
            }
        }
        return min;
    }

    public int numRatings(){
        return ratings.length;
    }

    public String toString(){
        String ratingsString = "[";
        for (int i = 0; i < ratings.length; i++) {
            ratingsString += ratings[i];
            if (i < ratings.length - 1) {
                ratingsString += ", ";
            }
        }
        ratingsString += "]";
        return  "Crew Member: " + crewId + ", " + firstName + " " + lastName + ", " + position + ", " + ratingsString + ", " + avgRatings();
    }

    /*public static void main(String[] args) {

        //instance
        CrewMember crew = new CrewMember(1000, " Shana ", " Watter ", " pilot ", 3);

        //test adding ratings
        crew.addRating(100);
        crew.addRating(90);
        crew.addRating(80);
        crew.addRating(70);

        System.out.println(" Max Rating: " + crew.maxRating());
        System.out.println(" Min Rating: " + crew.minRating());
        System.out.println(" Number of Rating: " + crew.numRatings());
        System.out.println(" Average Rating: " + crew.avgRatings());

        //test invalid ratings
        /*crew.addRating(200);
        crew.addRating(-1000);
        


        //test beyond aray size
        crew.addRating(85);
        crew.addRating(95);
        crew.addRating(75);

        System.out.println(crew.toString());

    }*/
    
}
