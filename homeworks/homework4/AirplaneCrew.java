//package homeworks.homework4;



//import com.gradescope.lab_four.CrewMember;

public class AirplaneCrew {
    private int airplaneID;
    private CrewMember [] crew;
    private int currentCrewCount;


public AirplaneCrew(int airplaneID){
    this.airplaneID = airplaneID;
    this.crew = new CrewMember[3];
    this.currentCrewCount = 0;
}

public void addCrewMember(CrewMember member){
    if (currentCrewCount < 3){
        crew[currentCrewCount] = member;
        currentCrewCount++;
    } 
}

public int totalAvgRatings(){

    double totalRating = 0;
    int totalpeople = 0;
    if (currentCrewCount == 0){
        return 0;
    }

    for(int i = 0; i < crew.length; i++){
       int [] ratings = crew[i].getRatings(); //get the rating array

       for (int j = 0; j < ratings.length; j++){ //loop going through each rating
        totalRating += ratings[j];
        totalpeople++;
       }
    }

    return  (int)(totalRating / totalpeople);
}

public int getAirplaneID(){
    return airplaneID;
}



/*public static void main(String[] args){

    AirplaneCrew airplaneCrew = new AirplaneCrew(101);

    CrewMember crew1 = new CrewMember(" Bob", 85);
    CrewMember crew2 = new CrewMember(" Alice", 90);
    CrewMember crew3 = new CrewMember(" Alex", 80);

    int avergaeRating = airplaneCrew.totalAvgRatings();

    
    System.out.println("Total Average Rating: " + avergaeRating);
}*/

}
