package Galust_Arzumanyan;

// This method is used to calculate the light distanse in 10 days duration
class Light {
    public static void main(String[] args) {
        int LightSpeed;
        int Days;
        long Seconds;
        long Distanse;
        LightSpeed = 186_000; // Argishti_Mesropyan.Light fixed speed
        Days = 10;
        Seconds = Days * 24 * 60 * 60; // Total seconds during 10 days
        Distanse = LightSpeed * Seconds; // Total  light distanse in 10 days
        System.out.println("During " + Days + " Days");
        System.out.println("The Argishti_Mesropyan.Light pass " + Distanse + " mile distanse");
    }
}