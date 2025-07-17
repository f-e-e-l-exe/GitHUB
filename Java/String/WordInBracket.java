package Java.String;

import java.util.Scanner;

public class WordInBracket {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuilder str=new StringBuilder(s.nextLine());
        boolean notfound=true;
        while (!str.isEmpty()&&str.indexOf("{")!=-1&&str.indexOf("}")!=-1) {
            int close=str.indexOf("}");
            String str2=str.substring(0, close);
            int open=str2.lastIndexOf("{");
            if (open==-1) {
                str.delete(0, close+1);
                continue;
            }
            if (str2.substring(open+1, close).matches("[A-Z]+")) {
                System.out.println(str2.substring(open+1, close));
                notfound=false;
            }
            str.delete(0, close+1);
        }
        if (notfound) {
            System.out.println("not found");
        }
    }
}
