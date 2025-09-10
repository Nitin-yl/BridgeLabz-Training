package ElementPractice.Level1;


public class Q_7 {
	public static void main(String...args) {
		double r = 6371; 
        double pi = 3.141592653589793;
                
        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);
        
        double volumeMIles = volume * 0.239913;
       
        System.out.println("The volume of earth in cubic kilometers is " + volume + "and cubic miles is " + volumeMIles   );
        
	}
}
