import java.util.*;
import java.io.*;
public class airtravel {
    public static void main(String[] args) throws IOException {
        String n;
        int sumof1958 =0,sumof1959=0,sumof1960=0;
        int i=0;
        String path = "C:/Users/naman sharma/Downloads/airtravel.csv";
        String[] arry;
        BufferedReader bf = new BufferedReader(new FileReader(path));
        while((n=bf.readLine())!=null){
            arry = n.split(",");
            if(i==0){
                i++;
            }
            else{
                if(i>12){
                    break;
                }  
                i++; 
            sumof1958 = sumof1958 +Integer.parseInt(arry[1].trim());
            sumof1959 = sumof1959 +Integer.parseInt(arry[2].trim());
            sumof1960 = sumof1960 +Integer.parseInt(arry[3].trim());  
                   
        }
            
        }
        System.out.println(sumof1958/12);
        System.out.println(sumof1959/12);
        System.out.println(sumof1960/12);
        bf.close();
    }
}