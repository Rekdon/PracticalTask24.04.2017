public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane("Боєнг Б251-В", 400, 50000, 40, 4, 2);
        Airlaner airlaner = new Airlaner("Боєнг Б251-В", 400, 50000, 40, 4, 2, 2);
        TransportAirplane transportAirplane = new TransportAirplane("Боєнг Б251-В", 400, 50000, 40, 4, 2,500000,20000);
        System.out.println("******************************************");
        System.out.println(plane.toString());
        System.out.println("------------------------------------------");
        System.out.println(airlaner.toString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(transportAirplane.toString());
    }
}
