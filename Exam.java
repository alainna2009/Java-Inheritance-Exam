/**
 * the exam class calculates student's exam scores. 
 * it inherits from the assessment class
 *
 */

public  class Exam extends Assessment {
    //stores the number of points on each question
    private int pointsEach;
    //stores the number of questions answered inccorectly 
    private int numMissed; 

    public Exam(int questions, int missed){
        numMissed = missed;


        //calculate points per person
            pointsEach = 100 / questions;


        //calculate the final score 
            setScore (100 -(missed * pointsEach));
            
        //stores the score using the inherited setScore() method 
    }
    public int getPointsEach(){
        return pointsEach;
        // send the sotred value back to caller 
    }
// returns the number of questions missed. 
    public int getNumMissed(){
        return numMissed; 
    }
    
}
