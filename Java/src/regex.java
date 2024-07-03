import java.util.regex.*;

public class regex {
    public static void main(String[] args) {

        String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
        String strangeString = " 1Z aaa **** *** {{{ {{ { ";

        // word that is 2 - 20 char in length
        // [A-Za-z]{2,20}
        check("[A-Za-z0-9]{2,20}", longString);

    }

    public static void check(String r , String s){
        Pattern c = Pattern.compile(r);

        Matcher rmatcher = c.matcher(s);

        while(rmatcher.find()){
            if(rmatcher.group().length() != 0){
                System.out.println(rmatcher.group());
            }
        }

    }
}

