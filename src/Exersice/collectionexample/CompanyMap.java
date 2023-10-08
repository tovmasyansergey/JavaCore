package Exersice.collectionexample;

import java.util.HashMap;
import java.util.Map;

public class CompanyMap {
    public static void main(String[] args) {
        Map<Company,Integer> companySizeMap = new HashMap<>();
        Person person = new Person("poxos","poxos","poxosyan");
        Person petros = new Person("petros","petros","petrosyan");
        Company company = new Company(person,"a0001","Company 1");
        Company company2 = new Company(petros,"a0002","Company 2");
        companySizeMap.put(company,20);
        companySizeMap.put(company2,4);
        System.out.println(companySizeMap.get(company));
        System.out.println(companySizeMap.get(company));
        System.out.println(10 + 20 + " text");
        System.out.println("text" + 10 + 20);
    }
}
