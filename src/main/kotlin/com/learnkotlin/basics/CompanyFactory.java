package com.learnkotlin.basics;

public class CompanyFactory {
    public static void main(String[] args) {
        Company company = new Company(1, "Microsoft", "Amsterdam");

        System.out.println("Company Id is : " + company.getId());
        System.out.println("Company Name is : " + company.getName());
        System.out.println("Company Location is : " + company.getLocation());
    }
}
