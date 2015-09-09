/**
 *
 * @author aji sudarmawan
 */
public class StatementIfElseElseIf {
public static void main(String[] args){    
    double grade = 70.0;
    if( grade >= 90 ){
        System.out.println( "A" );
    }
    else if( (grade < 90) && (grade >= 80)){
        System.out.println("B" );
    }
    else if( (grade < 80) && (grade >= 60)){
        System.out.println("C" );
    }
    else{
        System.out.println("D");
    }
 }     
}
