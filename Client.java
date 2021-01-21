
public class Client {

    public static void main(String[] args) {
        

        MarketingMajor mm = new MarketingMajor("Marketing Major", "12:00PM", 10);
        CSMajor csm = new CSMajor("CS Major", "9:00AM", 4);
        ExerciseScienceMajor esm = new ExerciseScienceMajor("Exercise Science Major", "7:00AM", 8);  
        
        mm.dailyRoutine();
        System.out.println();

        csm.dailyRoutine();
        System.out.println();

        esm.dailyRoutine();
        System.out.println();
         
    }

}
