package com.syntax;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SolarSystem FactorX = new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="10000";

        // Adding features to our sun

        FeatureSun xFact= new FeatureSun();
        xFact.color="Green";
        xFact.radius="1000000000000km";
        xFact.heat="309876554440j";


        //adding features of the planet2
        Planet2 p2= new Planet2();
        p2.name="ozhan";
        p2.size="537463295";
        p2.color="pink";
        

        //adding features for planet one
        Planet1Feature Gulk= new Planet1Feature();
        Gulk.color="Blue";
        Gulk.size="383838383756649km";
        Gulk.name="preacheX";
        


    }
}
