package week3assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollection {
    public static void main(String[] args) {
       
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

       
        List<String> companyList = new ArrayList<>();
        Collections.addAll(companyList, companies);

       
        Collections.reverse(companyList);

      
        System.out.println("Reversed collection:");
        for (String company : companyList) {
            System.out.print(company);
           
            if (!company.equals(companyList.get(companyList.size() - 1))) {
                System.out.print(", ");
            }
        }
    }
}
