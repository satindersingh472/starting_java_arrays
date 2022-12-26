import java.util.Arrays;

public class Newsfeed{
    String[] topics = {"hello","satinder","how are you?"};


    public Newsfeed(){

    }
    public int getLength(){
        return topics.length;
    }
    public static void main(String[] args){
        Newsfeed sampleString = new Newsfeed();
        System.out.println("The length of string is " + sampleString.getLength());
    }
}