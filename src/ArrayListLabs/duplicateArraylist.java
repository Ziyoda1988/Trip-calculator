package ArrayListLabs;
import java.util.ArrayList;
public class duplicateArraylist {
    public static void main(String[] args){
        ArrayList<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);

        duplicate(list);

        System.out.println(list); // [true,false,true,true,false,true]

    }


    public static void duplicate(ArrayList<Boolean> bools) {
        bools.addAll( bools);

        }
            }



/*As a Super_Admin

I want to add new “hosting plan” and delete hosting plan in Services tab

So that I can see output on the same page or success message

Scenario: Super_Admin has to manage hosting plans.



Given that I’m in the role of Super_Admin user.

I logged in as Super_Admin user.

Then the system shows me the list of all tabs on the top.

I chose the Services tab

Then  It automatically showed the options belonging to the Services tab.

I chose Hosting Plans and click it.

When I click Hosting Plans section , it displayed summary window.*/





