package classroom;

import java.util.Scanner;

/*if two files with code written down, have nothing to do with eachother
 *put them in different packages*/

// 
class Student extends Person {
    
  private int [] testScores;

     Student(String firstName, String lastName, int identification, int[] testScores) 
    {
        super(firstName, lastName, identification);
        
        this.testScores = testScores;
    }
    
//calculate the average
     char calculate(){
        int total = 0;
                
        for (int i : testScores) total += i;

        int ave = (total/testScores.length);
        
        if(ave <=100 && ave >= 90) return 'O';
        if(ave < 90 && ave >= 80) return 'E';
        if(ave < 80 && ave >= 70) return 'A';
        if(ave < 70 && ave >= 55) return 'P';
        if(ave < 55 && ave >= 40) return 'D';
        return 'T';//i learnt that the computer will count this as a return statement if there are no conditionals involved in its execution.
        
    }
    
       public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
 
}
