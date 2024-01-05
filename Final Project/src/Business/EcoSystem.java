/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

//import Business.FoodandBev.Menu.FBItemDirectory;

import Business.Enterprise.EmergencyService.MedicalEnterprise;
import Business.Enterprise.EmergencyService.PoliceEnterprise;
import Business.Enterprise.FoodBeverages.BeverageEnterprise;
import Business.Enterprise.FoodBeverages.FoodEnterprise;
import Business.Enterprise.Recreation.MuseumEnterprise;
import Business.Enterprise.Recreation.ParksEnterprise;
import Business.Enterprise.Recreation.TheatreEnterprise;
import Business.Enterprise.Shopping.MallEnterprise;
import Business.Enterprise.Shopping.ShopEnterprise;
import Business.Enterprise.Transport.RentalEnterpise;
import Business.Organisation.Beverage.BeverageCompanyDirectory;
import Business.Organisation.Beverage.Reservations;
import Business.Organisation.Hospital.Appointments;
import Business.Organisation.Hospital.HospitalDirectory;
import Business.Organisation.HotelOrganisation.HotelDirectory;
import Business.Organisation.HotelOrganisation.HotelOrders;
import Business.Organisation.HotelOrganisation.HotelReservations;
import Business.Organisation.Mall.MallDirectory;
import Business.Organisation.Mall.MallEnquiries;
import Business.Organisation.Mall.MallVisitors;
import Business.Organisation.Museum.MuseumDirectory;
import Business.Organisation.Museum.MuseumQuestion;
import Business.Organisation.Museum.MuseumQuestions;
import Business.Organisation.Museum.MuseumVisitors;
import Business.Organisation.Park.Events;
import Business.Organisation.Park.ParkDirectory;
import Business.Organisation.Park.ParkVisitors;
import Business.Organisation.Police.PoliceDepartmentDirectory;
import Business.Organisation.Police.Reports;
import Business.Organisation.Shop.ShopDirectory;
import Business.Organisation.Shop.ShoppingAppointments;
import Business.Organisation.Shop.ShoppingOrders;
import Business.Organisation.Theatre.Bookings;
import Business.Organisation.Theatre.Movies;
import Business.Organisation.Theatre.TheatreDirectory;
import Business.Organisation.Vehicle.Rentals;
import Business.Organisation.Vehicle.VehicleCompany;
import Business.Role.BeverageRep.BeverageRepDirectory;
import Business.Role.Customer.CustomerDirectory;
import Business.Role.HospitalRep.HospitalRepDirectory;
import Business.Role.HotelRep.HotelRepDirectory;
import Business.Role.MallRep.MallRepDirectory;
import Business.Role.MarketAnalyst.MarketAnalyst;
import Business.Role.MarketAnalyst.MarketAnalystDirectory;
import Business.Role.MuseumRep.MuseumRep;
import Business.Role.MuseumRep.MuseumRepDirectory;
import Business.Role.ParkRep.ParkRepDirectory;
import Business.Role.PoliceRep.PoliceRepDirectory;
import Business.Role.ShopRep.ShopRepDirectory;
import Business.Role.TheatreRep.TheatreRepDirectory;
import Business.Role.User.UserDirectory;
import Business.Role.VehicleRep.VehicleRepDirectory;


public class EcoSystem {

    private static EcoSystem ecoSystem;
    
    BeverageCompanyDirectory beverageCompanyDirectory;
    HospitalDirectory hospitalDirectory;
    HotelDirectory hotelDirectory;
    MallDirectory mallDirectory;
    MuseumDirectory museumDirectory;
    ParkDirectory parkDirectory;
    PoliceDepartmentDirectory policeDepartmentDirectory; 
    ShopDirectory shopDirectory;
    TheatreDirectory theatreDirectory;
    VehicleCompany vehicleCompany;
    BeverageRepDirectory beverageRepDirectory;
    HospitalRepDirectory hospitalRepDirectory;
    HotelRepDirectory hotelRepDirectory;
    MallRepDirectory mallRepDirectory;
    MuseumRepDirectory museumRepDirectory;
    ParkRepDirectory parkRepDirectory;
    PoliceRepDirectory policeRepDirectory;
    ShopRepDirectory shopRepDirectory;
    TheatreRepDirectory theatreRepDirectory;
    UserDirectory userDirectory;
    VehicleRepDirectory vehicleRepDirectory;
    CustomerDirectory customerDirectory;
    Reservations reservations;
    Appointments appointments;
    HotelReservations hotelReservations;
    HotelOrders hotelOrders;
    FoodEnterprise foodEnterprise;
    MedicalEnterprise medicalEnterprise;
    MallVisitors mallVisitors;
    MallEnquiries mallEnquiries;
    MallEnterprise mallEnterprise;
    BeverageEnterprise beverageEnterprise;
    MuseumVisitors museumVisitors;
    MuseumQuestions museumQuestions;
    MuseumEnterprise museumEnterprise;
    ParkVisitors parkVisitors;
    Events events;
    ParksEnterprise parksEnterprise;
    PoliceEnterprise policeEnterprise;
    Movies movies;
    Reports reports;
    Bookings bookings;
    ShoppingAppointments shoppingAppointments;
    ShoppingOrders shoppingOrders;
    ShopEnterprise shopEnterprise;
    Rentals rentals;
    RentalEnterpise rentalEnterpise;
    MarketAnalystDirectory analystDirectory;

    public MarketAnalystDirectory getAnalystDirectory() {
        return analystDirectory;
    }

    public void setAnalystDirectory(MarketAnalystDirectory analystDirectory) {
        this.analystDirectory = analystDirectory;
    }
    
    
    
    
    

    public ShopEnterprise getShopEnterprise() {
        return shopEnterprise;
    }

    public Rentals getRentals() {
        return rentals;
    }

    public void setRentals(Rentals rentals) {
        this.rentals = rentals;
    }

    public RentalEnterpise getRentalEnterpise() {
        return rentalEnterpise;
    }

    public void setRentalEnterpise(RentalEnterpise rentalEnterpise) {
        this.rentalEnterpise = rentalEnterpise;
    }

    public void setShopEnterprise(ShopEnterprise shopEnterprise) {
        this.shopEnterprise = shopEnterprise;
    }
    
    

    public ShoppingAppointments getShoppingAppointments() {
        return shoppingAppointments;
    }

    public void setShoppingAppointments(ShoppingAppointments shoppingAppointments) {
        this.shoppingAppointments = shoppingAppointments;
    }

    public ShoppingOrders getShoppingOrders() {
        return shoppingOrders;
    }

    public void setShoppingOrders(ShoppingOrders shoppingOrders) {
        this.shoppingOrders = shoppingOrders;
    }
    
    
    
    TheatreEnterprise theatreEnterprise;

    public TheatreEnterprise getTheatreEnterprise() {
        return theatreEnterprise;
    }

    public void setTheatreEnterprise(TheatreEnterprise theatreEnterprise) {
        this.theatreEnterprise = theatreEnterprise;
    }
    
    
    
    
    

    public Movies getMovies() {
        return movies;
    }

    public Bookings getBookings() {
        return bookings;
    }

    public void setBookings(Bookings bookings) {
        this.bookings = bookings;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    
    
    
    public PoliceEnterprise getPoliceEnterprise() {
        return policeEnterprise;
    }

    public void setPoliceEnterprise(PoliceEnterprise policeEnterprise) {
        this.policeEnterprise = policeEnterprise;
    }

    public Reports getReports() {
        return reports;
    }

    public void setReports(Reports reports) {
        this.reports = reports;
    }
    
    

    public ParkVisitors getParkVisitors() {
        return parkVisitors;
    }

    public void setParkVisitors(ParkVisitors parkVisitors) {
        this.parkVisitors = parkVisitors;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public ParksEnterprise getParksEnterprise() {
        return parksEnterprise;
    }

    public void setParksEnterprise(ParksEnterprise parksEnterprise) {
        this.parksEnterprise = parksEnterprise;
    }
    
    
    

    public MuseumEnterprise getMuseumEnterprise() {
        return museumEnterprise;
    }

    public void setMuseumEnterprise(MuseumEnterprise museumEnterprise) {
        this.museumEnterprise = museumEnterprise;
    }
    
    

    public MuseumQuestions getMuseumQuestions() {
        return museumQuestions;
    }

    public void setMuseumQuestions(MuseumQuestions museumQuestions) {
        this.museumQuestions = museumQuestions;
    }
    
    

    public MuseumVisitors getMuseumVisitors() {
        return museumVisitors;
    }

    public void setMuseumVisitors(MuseumVisitors museumVisitors) {
        this.museumVisitors = museumVisitors;
    }
    
    
    
    

    public MallEnterprise getMallEnterprise() {
        return mallEnterprise;
    }

    public BeverageEnterprise getBeverageEnterprise() {
        return beverageEnterprise;
    }

    public void setBeverageEnterprise(BeverageEnterprise beverageEnterprise) {
        this.beverageEnterprise = beverageEnterprise;
    }

    public void setMallEnterprise(MallEnterprise mallEnterprise) {
        this.mallEnterprise = mallEnterprise;
    }
    
    

    public MallEnquiries getMallEnquiries() {
        return mallEnquiries;
    }

    public void setMallEnquiries(MallEnquiries mallEnquiries) {
        this.mallEnquiries = mallEnquiries;
    }
    
    

    public MallVisitors getMallVisitors() {
        return mallVisitors;
    }

    public void setMallVisitors(MallVisitors mallVisitors) {
        this.mallVisitors = mallVisitors;
    }
    
    

    public MedicalEnterprise getMedicalEnterprise() {
        return medicalEnterprise;
    }

    public void setMedicalEnterprise(MedicalEnterprise medicalEnterprise) {
        this.medicalEnterprise = medicalEnterprise;
    }
    
    
    public FoodEnterprise getFoodEnterprise() {
        return foodEnterprise;
    }

    public void setFoodEnterprise(FoodEnterprise foodEnterprise) {
        this.foodEnterprise = foodEnterprise;
    }
    
    

    public HotelOrders getHotelOrders() {
        return hotelOrders;
    }

    public void setHotelOrders(HotelOrders hotelOrders) {
        this.hotelOrders = hotelOrders;
    }
    
    

    public HotelReservations getHotelReservations() {
        return hotelReservations;
    }

    public void setHotelReservations(HotelReservations hotelReservations) {
        this.hotelReservations = hotelReservations;
    }
    
    

    public Appointments getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointments appointments) {
        this.appointments = appointments;
    }
    
    

    public Reservations getReservations() {
        return reservations;
    }

    public void setReservations(Reservations reservations) {
        this.reservations = reservations;
    }
    
    

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
    

    public BeverageRepDirectory getBeverageRepDirectory() {
        return beverageRepDirectory;
    }

    public void setBeverageRepDirectory(BeverageRepDirectory beverageRepDirectory) {
        this.beverageRepDirectory = beverageRepDirectory;
    }

    public HospitalRepDirectory getHospitalRepDirectory() {
        return hospitalRepDirectory;
    }

    public void setHospitalRepDirectory(HospitalRepDirectory hospitalRepDirectory) {
        this.hospitalRepDirectory = hospitalRepDirectory;
    }

    public HotelRepDirectory getHotelRepDirectory() {
        return hotelRepDirectory;
    }

    public void setHotelRepDirectory(HotelRepDirectory hotelRepDirectory) {
        this.hotelRepDirectory = hotelRepDirectory;
    }

    public MallRepDirectory getMallRepDirectory() {
        return mallRepDirectory;
    }

    public void setMallRepDirectory(MallRepDirectory mallRepDirectory) {
        this.mallRepDirectory = mallRepDirectory;
    }

    public MuseumRepDirectory getMuseumRepDirectory() {
        return museumRepDirectory;
    }

    public void setMuseumRepDirectory(MuseumRepDirectory museumRepDirectory) {
        this.museumRepDirectory = museumRepDirectory;
    }

    public ParkRepDirectory getParkRepDirectory() {
        return parkRepDirectory;
    }

    public void setParkRepDirectory(ParkRepDirectory parkRepDirectory) {
        this.parkRepDirectory = parkRepDirectory;
    }

    public PoliceRepDirectory getPoliceRepDirectory() {
        return policeRepDirectory;
    }

    public void setPoliceRepDirectory(PoliceRepDirectory policeRepDirectory) {
        this.policeRepDirectory = policeRepDirectory;
    }

    public ShopRepDirectory getShopRepDirectory() {
        return shopRepDirectory;
    }

    public void setShopRepDirectory(ShopRepDirectory shopRepDirectory) {
        this.shopRepDirectory = shopRepDirectory;
    }

    public TheatreRepDirectory getTheatreRepDirectory() {
        return theatreRepDirectory;
    }

    public void setTheatreRepDirectory(TheatreRepDirectory theatreRepDirectory) {
        this.theatreRepDirectory = theatreRepDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public VehicleRepDirectory getVehicleRepDirectory() {
        return vehicleRepDirectory;
    }

    public void setVehicleRepDirectory(VehicleRepDirectory vehicleRepDirectory) {
        this.vehicleRepDirectory = vehicleRepDirectory;
    }
    
    

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public BeverageCompanyDirectory getBeverageCompanyDirectory() {
        return beverageCompanyDirectory;
    }

    public void setBeverageCompanyDirectory(BeverageCompanyDirectory beverageCompanyDirectory) {
        this.beverageCompanyDirectory = beverageCompanyDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public HotelDirectory getHotelDirectory() {
        return hotelDirectory;
    }

    public void setHotelDirectory(HotelDirectory hotelDirectory) {
        this.hotelDirectory = hotelDirectory;
    }

    public MallDirectory getMallDirectory() {
        return mallDirectory;
    }

    public void setMallDirectory(MallDirectory mallDirectory) {
        this.mallDirectory = mallDirectory;
    }

    public MuseumDirectory getMuseumDirectory() {
        return museumDirectory;
    }

    public void setMuseumDirectory(MuseumDirectory museumDirectory) {
        this.museumDirectory = museumDirectory;
    }

    public ParkDirectory getParkDirectory() {
        return parkDirectory;
    }

    public void setParkDirectory(ParkDirectory parkDirectory) {
        this.parkDirectory = parkDirectory;
    }

    public PoliceDepartmentDirectory getPoliceDepartmentDirectory() {
        return policeDepartmentDirectory;
    }

    public void setPoliceDepartmentDirectory(PoliceDepartmentDirectory policeDepartmentDirectory) {
        this.policeDepartmentDirectory = policeDepartmentDirectory;
    }

    public ShopDirectory getShopDirectory() {
        return shopDirectory;
    }

    public void setShopDirectory(ShopDirectory shopDirectory) {
        this.shopDirectory = shopDirectory;
    }

    public TheatreDirectory getTheatreDirectory() {
        return theatreDirectory;
    }

    public void setTheatreDirectory(TheatreDirectory theatreDirectory) {
        this.theatreDirectory = theatreDirectory;
    }

    public VehicleCompany getVehicleCompany() {
        return vehicleCompany;
    }

    public void setVehicleCompany(VehicleCompany vehicleCompany) {
        this.vehicleCompany = vehicleCompany;
    }
    
    


    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {
        
        beverageCompanyDirectory = new BeverageCompanyDirectory();
        hospitalDirectory = new HospitalDirectory();
        hotelDirectory = new HotelDirectory();
        mallDirectory = new MallDirectory();
        museumDirectory = new MuseumDirectory();
        parkDirectory = new ParkDirectory();
        policeDepartmentDirectory = new PoliceDepartmentDirectory();
        shopDirectory = new ShopDirectory();
        theatreDirectory = new TheatreDirectory();
        vehicleCompany = new VehicleCompany();
        beverageRepDirectory = new BeverageRepDirectory();
        hospitalRepDirectory = new HospitalRepDirectory();
        hotelRepDirectory = new HotelRepDirectory();
        mallRepDirectory = new MallRepDirectory();
        museumRepDirectory = new MuseumRepDirectory();
        parkRepDirectory = new ParkRepDirectory();
        policeRepDirectory = new PoliceRepDirectory();
        shopRepDirectory = new ShopRepDirectory();
        theatreRepDirectory = new TheatreRepDirectory();
        userDirectory = new UserDirectory();
        vehicleRepDirectory = new VehicleRepDirectory();
        customerDirectory = new CustomerDirectory();
        reservations = new Reservations();
        appointments = new Appointments();
        hotelReservations = new HotelReservations();
        hotelOrders = new HotelOrders();
        foodEnterprise = new FoodEnterprise();
        medicalEnterprise = new MedicalEnterprise();
        mallVisitors = new MallVisitors();
        mallEnquiries = new MallEnquiries();
        mallEnterprise = new MallEnterprise();
        beverageEnterprise = new BeverageEnterprise();
        museumVisitors = new MuseumVisitors();
        museumQuestions = new MuseumQuestions();
        museumEnterprise = new MuseumEnterprise();
        parkVisitors = new ParkVisitors();
        events = new Events();
        parksEnterprise = new ParksEnterprise();
        policeEnterprise = new PoliceEnterprise();
        reports = new Reports();
        movies = new Movies();
        bookings = new Bookings();
        theatreEnterprise = new TheatreEnterprise();
        shoppingAppointments = new ShoppingAppointments();
        shoppingOrders = new ShoppingOrders();
        shopEnterprise = new ShopEnterprise();
        rentals = new Rentals();
        analystDirectory = new MarketAnalystDirectory();
    }
}
