import java.util.*;
public class Stringer {
    public static void main(String[]args ){
        String []unit={"mm","cm","dm","m","km"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a list of radians:");
        String input=sc.nextLine();
        stringManager(input,unit);
    }
    public static void stringManager(String input,String []unit){
        ArrayList<String>a=new ArrayList<>();// split all the parts in the string
        ArrayList<String>b=new ArrayList<>();// used to collect the part of number strings
        ArrayList<String>c=new ArrayList<>();// used to collect the part of unit strings
        ArrayList<Double>d=new ArrayList<>();// used to integrate the parts of units and numbers
        int g=0;
        for(String st:input.split(",")){
            a.add(st);
            System.out.print(a.get(g));
            System.out.print("\t");
            g++;
        }

        for(String s:a){
            int i=0;
            for(String k:s.split("/")){
                if(i==0){
                    b.add(k);
                }
                i=1;
                if(i==1){
                    c.add(k);
                }
            }
        }

        for(int i=0;i<a.size();i++){


            double value2;
            double value1;
            switch(c.get(i)){
                case"mm":value2=0.1;
                         break;
                case"cm":value2=1.0;
                         break;
                case"dm":value2=10.0;
                         break;
                case"m" :value2=100.0;
                         break;
                case"km":value2=100000.0;
                         break;
                default: value2=-1;
            }
            value1=Double.parseDouble(b.get(i));
            double value3=value1*value2;
            d.add(value3);
        }

        for(double f:d){
            System.out.print(f);
            System.out.print("\t");
        }

    }

}
