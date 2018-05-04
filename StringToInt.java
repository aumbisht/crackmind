package puzzleSolving;

public class StringToInteger {
public static void main(String...s){
 String st="-998";
 int i=0;
 double number=0;
 boolean isNegative=false;
      int len =st.length();//length of String
      if(st.charAt(0)=='-'){
    	  isNegative=true;
      i=1;//if it is negative then '-'symbol placed at zero index and increase its index by one
      
 
}
      //otherwise it is positive number so it starts from zero index
      while(i<len){
    	  number=number*10;//0*10=0 for decimal place
    	  number=number+(st.charAt(i++)-'0');//original number(numeric value)=ascii representation of char-base ascii char for numeric is 0(0 having ascii value is 48) 
    	  
      }if(isNegative)
    	  number=-number;//if it is negative in last add - symbol in starting
      
     
	}

}
