package TestPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTesting {
    public static void main(String[] args) {
        // List of String arrays
        List<String[]> list = new ArrayList<String[]>();

        List<String> arr1 = Arrays.asList( "a", "b", "c","d" );
        List<String> arr2 = Arrays.asList( "1", "2", "3", "4");
        List<List<String>> arr3 = new ArrayList<>();
//        List<String> tmp_array = new ArrayList<String>();

        System.out.println(arr1);
        System.out.println(arr2);
        for(int i = 0 ; i <arr1.size();i++) {
            List<String> tmp_array = new ArrayList<String>();
            System.out.println(arr1.get(i));
            System.out.println(arr2.get(i));
            tmp_array.add(arr1.get(i));
            tmp_array.add(arr2.get(i));
            System.out.println("tmp_array now = " +tmp_array);
            arr3.add(tmp_array);
            System.out.println(arr3);
        }
        List<ChangedFields> listOfChangedFields = new ArrayList<>();
        for (List<String> strArr : arr3){
            System.out.println("inside =>  " + strArr);
            String fieldName=strArr.get(0);
            String fieldValue=strArr.get(1);
            listOfChangedFields.add(new ChangedFields(fieldName,fieldValue));
        }
        for (ChangedFields myList : listOfChangedFields) {
            System.out.println(myList.toString());
        }

        Gson gson = new Gson();
        String restaurantJson = gson.toJson(listOfChangedFields);
        System.out.println(restaurantJson);

    }
}