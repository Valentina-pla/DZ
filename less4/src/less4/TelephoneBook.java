package less4;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {

     HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();



    public void  addRecord (String name,String phone) {

        //phoneBook.put("ivanov petr",new ArrayList<>(Arrays.asList("494564646546", "984949849849", "515151511")));

        ArrayList<String> value=phoneBook.get(name);

        if (value==null){
            value=new ArrayList<>();
            phoneBook.put(name,value);
        }
        value.add(phone);


    }

    public ArrayList<String> searchBySurname(String name) {


        return phoneBook.get(name);
    }



}
