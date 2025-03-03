package practice1;

import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String[] args) {

        ArrayList<String> first_list = new ArrayList<>(){
            {
                add("Monday");
                add("Tuesday");
                add("Wednesday");
                add("Thursday");

            }
        };

        ArrayList<String> second_list = new ArrayList<>(){
            {
                add("Friday");
                add("Saturday");
                add("Sunday");

            }
        };

        ArrayList<String> third_list = new ArrayList<>(){
            {
                add("Ram");
                add("Raj");
                add("Rahim");

            }
        };

        ArrayList<String> joined_list = new ArrayList<>();
        joined_list.addAll(first_list);
        joined_list.addAll(second_list);
        joined_list.addAll(third_list);
        System.out.println("Joined Array List: "+joined_list);

    }
}
