package homework_17.Anush_Ananyan.DeepClone;

import java.nio.MappedByteBuffer;

public class Demo {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Tumanyan", 11);
        City Vanadzor = new City(apartment);
        Province Lori = new Province(Vanadzor);
        Country Armenia = new Country(Lori);
        Region ArmenianHighland = new Region(Armenia);
        Continent Asia = new Continent(ArmenianHighland);
        Mainland Eurasia = new Mainland(Asia);
        Planet Earth = new Planet(Eurasia);
        SunSystem SolarSystem = new SunSystem(Earth);
        Galactic MilkyWay = new Galactic(SolarSystem);
        Space space = new Space(MilkyWay);

        try {
            Apartment apartmentClone = (Apartment) apartment.clone();
            City cityClone = (City) Vanadzor.clone();
            Province provinceClone = (Province) Lori.clone();
            Country countryClone = (Country) Armenia.clone();
            Region regionClone = (Region) ArmenianHighland.clone();
            Continent continentClone = (Continent) Asia.clone();
            Mainland mainlandClone = (Mainland) Eurasia.clone();
            Planet planetClone = (Planet) Earth.clone();
            SunSystem systemClone = (SunSystem) SolarSystem.clone();
            Galactic galacticClone = (Galactic) MilkyWay.clone();
            Space spaceClone = (Space) space.clone();

            System.out.println(space == spaceClone);
            System.out.println(apartment == apartmentClone);
            System.out.println(space.equals(spaceClone));
            System.out.println(apartment.equals(apartmentClone));

            apartmentClone.setStreet("Charents");
            apartmentClone.setNumber(15);
            System.out.print(apartmentClone.getStreet());
            System.out.println(" " + apartmentClone.getNumber() );


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.print(apartment.getStreet());
        System.out.println(" "+apartment.getNumber());

    }
}
