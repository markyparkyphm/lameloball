import java.util.*;
import java .io.*;
public class Ball {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("judgein.txt"));
        long num = sc.nextLong();
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i = 0; i <num; i++)
            arr.add((sc.nextLong()));
        Collections.sort(arr);
        long sum =  arr.indexOf(0) * arr.size();
        long highest=0;
        long index = 0;
        for(int i=0; i<num;i++){
           highest = arr.get(i) * (arr.size() - i);
           if(highest> sum) {
              index= arr.get(i);
              sum = highest; 
           }
        }
        System.out.print(sum+" "+index);
    }
}