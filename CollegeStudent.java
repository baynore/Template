
public abstract class CollegeStudent {

    protected String description;
    protected String wakeUpTime;
    protected double sleepHours;

    public CollegeStudent(String description, String wakeUpTime, double sleepHours) {
        
        this.description = description;
        this.wakeUpTime = wakeUpTime;
        this.sleepHours = sleepHours;
    }
    
    public final void dailyRoutine() {
        
        System.out.println(description); 
        getUp();
        eatBreakfast();
        travelToApp();
        attendClasses();
        returnHome();
        work();
        relax();
        sleep();
    
    }
    
    public final void getUp() {
    
        System.out.println("Rise and shine at " + wakeUpTime + "...");
    
    }

    public void eatBreakfast() {
    
        System.out.println("Eats breakfast");
    
    }

    public void travelToApp() {
    
        System.out.println("Travel to App");
    
    }
    
    public abstract void attendClasses();
    
    public void returnHome() {
    
        System.out.println("Returns home");
    
    }
    
    public void work() {
    
        System.out.println("Goes to work");
    
    }
    
    public void relax() {
    
        System.out.println("Relaxes");
    
    }
    
    public final void sleep() {
    
        System.out.println("Goes into a deep slumber for " + sleepHours + " hours..");
    
    }

}
