class Satellite {
    static int satelliteID;
    static String satelliteName;
    static String satelliteType ;
    static String countryoforigin ;
    static String launchDate ;
    static String launchVehicle ;
    static String launchSite ;
    static double masskg;
    static String manufacturer ;
    static String operator ;
    static String orbitType ;
    static double orbitAltitudekm ;
    static double orbitInclinationdeg ;
    static int missionDurationyears ;
    static String powerSource ;
    static String communicationBand ;
    static boolean isFunctional ;
    static String controlCenter;
    static String purpose ;
    static String remarks ;

    public static void main(String args[]) {
        System.out.println("Satellite ID: " + satelliteID);
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Satellite Type: " + satelliteType);
        System.out.println("Country of Origin: " + countryoforigin);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Mass (kg): " + masskg);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Operator: " + operator);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Orbit Altitude (km): " + orbitAltitudekm);
        System.out.println("Orbit Inclination (deg): " + orbitInclinationdeg);
        System.out.println("Mission Duration (years): " + missionDurationyears);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Communication Band: " + communicationBand);
        System.out.println("Is Functional: " + isFunctional);
        System.out.println("Control Center: " + controlCenter);
        System.out.println("Purpose: " + purpose);
        System.out.println("Remarks: " + remarks);
		
	 int satelliteID = 501;
     String satelliteName = "INSAT-3D";
     String satelliteType = "Weather";
     String countryoforigin = "India";
     String launchDate = "2013-07-26";
     String launchVehicle = "Ariane 5";
     String launchSite = "Kourou, French Guiana";
     double masskg = 2060.0;
     String manufacturer = "ISRO";
     String operator = "ISRO";
     String orbitType = "Geostationary";
     double orbitAltitudekm = 36000.0;
     double orbitInclinationdeg = 0.0;
     int missionDurationyears = 10;
     String powerSource = "Solar Panels";
     String communicationBand = "C-band, Ku-band";
     boolean isFunctional = true;
     String controlCenter = "ISRO Telemetry Center";
     String purpose = "Meteorological observation";
     String remarks = "Still operational as of 2025";



		System.out.println("Satellite ID: " + satelliteID);
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Satellite Type: " + satelliteType);
        System.out.println("Country of Origin: " + countryoforigin);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Mass (kg): " + masskg);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Operator: " + operator);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Orbit Altitude (km): " + orbitAltitudekm);
        System.out.println("Orbit Inclination (deg): " + orbitInclinationdeg);
        System.out.println("Mission Duration (years): " + missionDurationyears);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Communication Band: " + communicationBand);
        System.out.println("Is Functional: " + isFunctional);
        System.out.println("Control Center: " + controlCenter);
        System.out.println("Purpose: " + purpose);
        System.out.println("Remarks: " + remarks);
		
    }
}
