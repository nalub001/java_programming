package chapter16;

public class DataTypesConverter {

    public static void main(String[] args){

        //Convert a String to an Integer
        String a = "+9";
        stringToInt(a);

        //reverse string
        reverseString("Please Work");

        //reverse words in a string
        reverseWordsInString("Joy To The World. We Will Sing Joy");
    }

    public static void stringToInt(String s){
        boolean isNegative = false;
        int number = 0;
        if(s.charAt(0) == '-'){
            //System.out.println(s.charAt(0));
            isNegative = true;
        }
        else if(s.charAt(0) == '+'){

        }
        else{
           number = number*10+(s.charAt(0) - '0');
        }
      for(int i=1; i < s.length(); i++) {
          number = number*10+(s.charAt(i) - '0');
      }

      if(isNegative)
          number = 0-number;

        System.out.println(number);
    }

    public static void reverseString(String s){
        for(int i= s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void reverseWordsInString(String s){
        String[] splitS = s.split(" ");

        String result ="";
        for(int i=splitS.length-1; i>=0; i--)
            result=result+splitS[i]+" ";

        System.out.println(result);
    }

}
