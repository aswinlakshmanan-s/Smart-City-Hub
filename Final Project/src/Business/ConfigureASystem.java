/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Organisation.Beverage.BeverageCompany;
import Business.Organisation.Beverage.Reservation;
import Business.Organisation.Beverage.Reservations;
import Business.Organisation.Hospital.Appointment;
import Business.Organisation.Hospital.Hospital;
import Business.Organisation.HotelOrganisation.Hotel;
import Business.Organisation.HotelOrganisation.HotelOrder;
import Business.Organisation.HotelOrganisation.HotelReservation;
import Business.Organisation.Mall.Mall;
import Business.Organisation.Mall.MallEnquiry;
import Business.Organisation.Mall.MallVisitor;
import Business.Organisation.Museum.Museum;
import Business.Organisation.Museum.MuseumQuestion;
import Business.Organisation.Museum.MuseumVisitor;
import Business.Organisation.Park.Event;
import Business.Organisation.Park.Park;
import Business.Organisation.Park.ParkVisitor;
import Business.Organisation.Police.PoliceDepartment;
import Business.Organisation.Police.Report;
import Business.Organisation.Shop.Shop;
import Business.Organisation.Shop.ShoppingAppointment;
import Business.Organisation.Shop.ShoppingOrder;
import Business.Organisation.Theatre.Booking;
import Business.Organisation.Theatre.Movie;
import Business.Organisation.Theatre.Theatre;
import Business.Organisation.Vehicle.Rental;
import Business.Organisation.Vehicle.Vehicle;
import Business.Role.BeverageRep.BeverageRep;
import Business.Role.Customer.Customer;
import Business.Role.HospitalRep.HospitalRep;
import Business.Role.HotelRep.HotelRep;
import Business.Role.MallRep.MallRep;
import Business.Role.MarketAnalyst.MarketAnalyst;
import Business.Role.MuseumRep.MuseumRep;
import Business.Role.ParkRep.ParkRep;
import Business.Role.PoliceRep.PoliceRep;
import Business.Role.ShopRep.ShopRep;
import Business.Role.TheatreRep.TheatreRep;
import Business.Role.User.User;
import Business.Role.User.UserDirectory;
import Business.Role.VehicleRep.VehicleRep;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author Subbu
 */
public class ConfigureASystem {

    public static int userIndex = 0;
    public static EcoSystem configure() {
        
    
        EcoSystem system = EcoSystem.getInstance();
        
        if(system == null)
        {
            System.out.println("System is null");
        }
        
        UserDirectory userDirectory = system.getUserDirectory();
            
        List<String> cities = Arrays.asList("New York", "Los Angeles", "Chicago", 
                                    "Houston", "Phoenix", "Philadelphia", 
                                    "San Antonio", "San Diego", "Dallas", 
                                    "San Jose");
        
        // populating models
        
        // populating users
        
        ArrayList <User> users = system.getUserDirectory().getUserList();
        
        Faker faker = new Faker();
        Random ran = new Random();
        
        
        
        Set<String> uniqueNames = new HashSet<>();
        
        while (uniqueNames.size() < 700) {
            String name = faker.name().firstName(); 
            uniqueNames.add(name);
        }

        
        for (String firstName : uniqueNames) {
            int id = userIndex++;
            int age = ran.nextInt(46) + 20;
            String location = cities.get(ran.nextInt(cities.size())); 

            User user = new User(); 
            user.setId(id);
            user.setName(firstName);
            user.setUsername(firstName); 
            user.setPassword(firstName); 
            user.setAge(age);
            user.setLocation(location);

            users.add(user); 
        }
        System.out.println(users.size());
        
        
        // create 50 customers
        
        ArrayList<Customer> customers = system.getCustomerDirectory().getCustomerList();
        
            for (userIndex = 0; userIndex < 50; userIndex++) {
            User user = users.get(userIndex); 
            Customer customer = new Customer(user); 
            customers.add(customer); 
        }
            System.out.println(customers.size());
            
            
         // creating beverage organisations 
         
         ArrayList<BeverageCompany> beverageCompanies = system.getBeverageCompanyDirectory().getBeverageCompanyList();
         
        for (int i = 0; i < 40; i++) {
            BeverageCompany company = new BeverageCompany();
            company.setId(i);
            company.setName(faker.company().name() + " Beverages");
            company.setLocation(cities.get(ran.nextInt(cities.size()))); 
            company.setSpecialty(faker.food().ingredient());      
            HashMap<String, Float> beverageMenu = new HashMap<>();
            for (int j = 0; j < 5; j++) { 
                String beverageName = faker.beer().name();
                float price = Math.round((ran.nextFloat() * (10 - 3) + 3) * 100.0f) / 100.0f; // Price range from $3.00 to $10.00
                beverageMenu.put(beverageName, price);
            }
            company.setBeverageMenu(beverageMenu);

            beverageCompanies.add(company);
        }
        int id =5;
        
        
        
        // creting 10 hospitals 
        
        ArrayList<Hospital> hospitals = system.getHospitalDirectory().getHospitalList();
        List<String> specialties = Arrays.asList(
            "Cardiology", "Neurology", "Pediatrics", 
            "Oncology", "Orthopedics", "Gastroenterology", 
            "Dermatology", "Psychiatry", "Endocrinology", 
            "Emergency Medicine"
        );        
        for (int i = 0; i < 40; i++) {
            Hospital hospital = new Hospital();
            hospital.setId(i);
            hospital.setName(faker.company().name() + " Hospital");
            hospital.setLocation(cities.get(ran.nextInt(cities.size()))); // Random city
            String specialty = specialties.get(ran.nextInt(specialties.size()));
            hospital.setSpecialty(specialty);
            hospitals.add(hospital);
        }
        
        
        // add 10 hotels
        
        
        ArrayList<Hotel> hotels = system.getHotelDirectory().getHotelList();
        
        List<String> cuisines = Arrays.asList(
            "Italian", "Chinese", "Indian", 
            "Mexican", "French"
        );
        
        for (int i = 0; i < 40; i++) {
            Hotel hotel = new Hotel();
            hotel.setId(i);
            hotel.setName(faker.company().name() + " Hotel");
            hotel.setLocation(cities.get(ran.nextInt(cities.size())));
            hotel.setCuisine(cuisines.get(ran.nextInt(cuisines.size()))); 

            HashMap<String, Float> foodMenu = new HashMap<>();
            for (int j = 0; j < 5; j++) {                                   // each hotel has 5 types of dishes
                String dishName = faker.food().dish();
                float price = Math.round((ran.nextFloat() * (20 - 10) + 10) * 100.0f) / 100.0f; // Price range from $10.00 to $20.00
                foodMenu.put(dishName, price);
            }
            hotel.setFoodMenu(foodMenu);

            hotels.add(hotel);
        }
        
        
        // create 50 malls
        
        ArrayList<Mall> malls = system.getMallDirectory().getMallList();
        
        List<String> popularOutlets = Arrays.asList(
            "Clothing Store", "Electronic Store", "Book Store", 
            "Jewelry Shop", "Sporting Goods Store"
        );

        for (int i = 0; i < 50; i++) {
            Mall mall = new Mall();
            mall.setId(i);
            mall.setName(faker.company().name() + " Mall");
            mall.setLocation(cities.get(ran.nextInt(cities.size())));
            mall.setPopularfor("Featuring " + popularOutlets.get(ran.nextInt(popularOutlets.size())));

            // Create a list of outlets
            ArrayList<String> outlets = new ArrayList<>();
            for (int j = 0; j < 3; j++) { // Assuming each mall has 3 types of outlets
                String outlet = popularOutlets.get(ran.nextInt(popularOutlets.size()));
                outlets.add(outlet);
            }
            mall.setOutlets(outlets);

            malls.add(mall);
        }
        
        
        
        // create 20 museums
        
        ArrayList<Museum> museums = system.getMuseumDirectory().getMuseumList();
        
                List<String> categories = Arrays.asList(
            "Art", "History", "Science", 
            "Natural History", "Technology"
        );

        for (int i = 0; i < 20; i++) {
            Museum museum = new Museum();
            museum.setId(i);
            museum.setName(faker.company().name() + " Museum");
            museum.setLocation(cities.get(ran.nextInt(cities.size())));

            String category = categories.get(ran.nextInt(categories.size()));
            museum.setCategory(category);

            museums.add(museum);
        }
        
        
        
        ArrayList<Park> parks = system.getParkDirectory().getParkList();
        
        List<String> attractions = Arrays.asList(
            "Botanical Garden", "Lake View", "Children's Playground", 
            "Historic Monuments", "Wildlife Sanctuary"
        );

        for (int i = 0; i < 30; i++) {
            Park park = new Park();
            park.setId(i);
            park.setName(faker.lorem().word() + " Park");
            park.setLocation(cities.get(ran.nextInt(cities.size())));

            String mainAttraction = attractions.get(ran.nextInt(attractions.size()));
            park.setMainAttraction(mainAttraction);

            parks.add(park);
        }
        
        
        ArrayList<PoliceDepartment> policeDepartments = system.getPoliceDepartmentDirectory().getDepartmentList();
        
                for (int i = 0; i < 20; i++) {
            PoliceDepartment pd = new PoliceDepartment();
            pd.setId(i);
            pd.setName(faker.company().name() + " Police Department");
            pd.setLocation(cities.get(ran.nextInt(cities.size())));
            pd.setPhoneNumber(faker.number().randomNumber(10, false));
            policeDepartments.add(pd);
        }
        
        
        
        
        ArrayList<Shop> shops = system.getShopDirectory().getShopList();
        
                for (int i = 0; i < 40; i++) {
            Shop shop = new Shop();
            shop.setId(i);
            shop.setName(faker.company().name() + " Shop");
            shop.setLocation(cities.get(ran.nextInt(cities.size())));

            HashMap<String, Float> shopMenu = new HashMap<>();
            for (int j = 0; j < 5; j++) { // each shop has 5 items
                String itemName = faker.commerce().productName();
                float price = Math.round((ran.nextFloat() * (100 - 10) + 10) * 100.0f) / 100.0f; // Price range from $10.00 to $100.00
                shopMenu.put(itemName, price);
            }
            shop.setShopMenu(shopMenu);
            shops.add(shop);
        }
        
        
       
        
        
        
        ArrayList<Theatre> theatres = system.getTheatreDirectory().getTheatreList();
        
                for (int i = 0; i < 60; i++) {
            Theatre theatre = new Theatre();
            theatre.setId(i);
            theatre.setName(faker.company().name() + " Theatre");
            theatre.setLocation(cities.get(ran.nextInt(cities.size())));
            theatre.setScreenTech("IMAX"); // Example screen technology

//            // Add a list of movies
//            ArrayList<String> movies = new ArrayList<>();
//            for (int j = 0; j < 3; j++) { // Assuming each theatre has 3 movies
//                String movie = faker.book().title(); // Using book titles as movie titles for simplicity
//                movies.add(movie);
//            }
////            theatre.setMovies(movies);
            theatres.add(theatre);
        }
        
        
        
        
        
        
        ArrayList<Vehicle> vehicles = system.getVehicleCompany().getVehicleList();
        
        List<String> carModels = Arrays.asList(
    "Sedan LX1", "Sedan LX2", "Sedan LX3", "Sedan LX4", "Sedan LX5",
    "Coupe GX1", "Coupe GX2", "Coupe GX3", "Coupe GX4", "Coupe GX5",
    "Hatchback HX1", "Hatchback HX2", "Hatchback HX3", "Hatchback HX4", "Hatchback HX5",
    "SUV EX1", "SUV EX2", "SUV EX3", "SUV EX4", "SUV EX5",
    "Crossover CX1", "Crossover CX2", "Crossover CX3", "Crossover CX4", "Crossover CX5",
    "Sports SP1", "Sports SP2", "Sports SP3", "Sports SP4", "Sports SP5",
    "Convertible CV1", "Convertible CV2", "Convertible CV3", "Convertible CV4", "Convertible CV5",
    "Truck TK1", "Truck TK2", "Truck TK3", "Truck TK4", "Truck TK5",
    "EV EL1", "EV EL2", "EV EL3", "EV EL4", "EV EL5",
    "Luxury LX1", "Luxury LX2", "Luxury LX3", "Luxury LX4", "Luxury LX5"
);
        
        

    List<String> vehicleCategories = Arrays.asList("Sedan", "SUV", "EV");
    List<String> seatingOptions = Arrays.asList("4", "5", "6", "7");

        for (int i = 0; i < carModels.size(); i++) {
            Vehicle vehicle = new Vehicle();
            vehicle.setId(i);
            vehicle.setName(carModels.get(i)); 
            vehicle.setLocation(cities.get(ran.nextInt(cities.size())));
            vehicle.setCategory(vehicleCategories.get(ran.nextInt(vehicleCategories.size())));
            vehicle.setNoOfSeats(seatingOptions.get(ran.nextInt(seatingOptions.size())));
            vehicle.setHourlyPrice(ran.nextFloat() * (50 - 15) + 15); // Random price between 15 and 50

            vehicles.add(vehicle);
        }
        
     
        int beverageRepStartIndex = 50;

    ArrayList<BeverageRep> beverageReps = system.getBeverageRepDirectory().getBeverageRepList();

    for (int i = 0; i < beverageCompanies.size(); i++) {
        if (beverageRepStartIndex < users.size()) {
            User user = users.get(beverageRepStartIndex++); 
            BeverageRep rep = new BeverageRep(user);
            rep.setBeverageCompany(beverageCompanies.get(i).getId()); 
            beverageReps.add(rep); 
        } else {
            
            break;
        }
    }
    
   
    int hospitalRepStartIndex = 90; 

    ArrayList<HospitalRep> hospitalReps = system.getHospitalRepDirectory().getHospitalRepList();

    for (int i = 0; i < hospitals.size(); i++) {
        if (hospitalRepStartIndex < users.size()) {
            User user = users.get(hospitalRepStartIndex++); 
            HospitalRep rep = new HospitalRep(user);
            rep.setHospitalId(hospitals.get(i).getId()); 
            hospitalReps.add(rep); 
        } else {
            
            break;
        }
    }

    System.out.println("Number of Hospital Reps: " + hospitalReps.size());


int hotelRepStartIndex = 130; 

ArrayList<HotelRep> hotelReps = system.getHotelRepDirectory().getHotelRepList();

for (int i = 0; i < hotels.size(); i++) {
    if (hotelRepStartIndex < users.size()) {
        User user = users.get(hotelRepStartIndex++); 
        HotelRep rep = new HotelRep(user);
        rep.setHotelId(hotels.get(i).getId()); 
        hotelReps.add(rep); 
    } else {
        break;
    }
}



int mallRepStartIndex = 170; 

ArrayList<MallRep> mallReps = system.getMallRepDirectory().getMallRepList();

for (int i = 0; i < malls.size(); i++) {
    
    if (mallRepStartIndex < users.size()) {
        User user = users.get(mallRepStartIndex++); 
        MallRep rep = new MallRep(user);
        rep.setMallId(malls.get(i).getId()); 
        mallReps.add(rep); 
    } else {
        break;
    }
}


int museumRepStartIndex = 220; 

ArrayList<MuseumRep> museumReps = system.getMuseumRepDirectory().getMuseumRepList();

for (int i = 0; i < museums.size(); i++) {
    if (museumRepStartIndex < users.size()) {
        User user = users.get(museumRepStartIndex++);
        MuseumRep rep = new MuseumRep(user);
        rep.setMuseumId(museums.get(i).getId());
        museumReps.add(rep);
    } else {
        break;
    }
}


int parkRepStartIndex = 240;

ArrayList<ParkRep> parkReps = system.getParkRepDirectory().getParkRepList();

for (int i = 0; i < parks.size(); i++) {
    if (parkRepStartIndex < users.size()) {
        User user = users.get(parkRepStartIndex++);
        ParkRep rep = new ParkRep(user);
        rep.setParkId(parks.get(i).getId());
        parkReps.add(rep);
    } else {
        break;
    }
}

int policeRepStartIndex = 270;

ArrayList<PoliceRep> policeReps = system.getPoliceRepDirectory().getPoliceRepList();

for (int i = 0; i < policeDepartments.size(); i++) {
    if (policeRepStartIndex < users.size()) {
        User user = users.get(policeRepStartIndex++);
        PoliceRep rep = new PoliceRep(user);
        rep.setDepartmentId(policeDepartments.get(i).getId());
        policeReps.add(rep);
    } else {
        break;
    }
}

// Start index for ShopRep assignment
int shopRepStartIndex = 290;

ArrayList<ShopRep> shopReps = system.getShopRepDirectory().getShopRepList();

for (int i = 0; i < shops.size(); i++) {
    if (shopRepStartIndex < users.size()) {
        User user = users.get(shopRepStartIndex++);
        ShopRep rep = new ShopRep(user);
        rep.setShopId(shops.get(i).getId());
        shopReps.add(rep);
    } else {
        break;
    }
}


int theatreRepStartIndex = 330; 

ArrayList<TheatreRep> theatreReps = system.getTheatreRepDirectory().getTheatreRepList();

for (int i = 0; i < theatres.size(); i++) {
    if (theatreRepStartIndex < users.size()) {
        User user = users.get(theatreRepStartIndex++);
        TheatreRep rep = new TheatreRep(user);
        rep.setTheatreId(theatres.get(i).getId());
        theatreReps.add(rep);
    } else {
        break;
    }
}


int vehicleRepStartIndex = 390; 

ArrayList<VehicleRep> vehicleReps = system.getVehicleRepDirectory().getVehicleRepList();

for (int i = 0; i < vehicles.size(); i++) {
    if (vehicleRepStartIndex < users.size()) {
        User user = users.get(vehicleRepStartIndex++);
        VehicleRep rep = new VehicleRep(user);
        rep.setCompanyId(vehicles.get(i).getId());
        vehicleReps.add(rep);
    } else {
        break;
    }
}



ArrayList<Reservation> reservations = system.getReservations().getReservationList();
        Random random = new Random();

        for (int i = 0; i < 150; i++) {
            Reservation reservation = new Reservation();

            Customer customer = customers.get(random.nextInt(customers.size()));
            BeverageCompany beverageCompany = beverageCompanies.get(random.nextInt(beverageCompanies.size()));

            reservation.setCustomerId(customer.getId());
            reservation.setBeverageCompanyId(beverageCompany.getId());
            reservation.setNoOfGuests(random.nextInt(10) + 1); // 1 to 10 guests

            String time = "2023-05-" + (random.nextInt(30) + 1) + " " + 
                           (random.nextInt(24)) + ":" + (random.nextInt(60));
            reservation.setTime(time);

            reservations.add(reservation);

        }

        

        
        
        ArrayList<Appointment> appointments = system.getAppointments().getAppointmentList();
        List<String> commonSymptoms = Arrays.asList("Cough", "Fever", "Headache", "Fatigue", "Nausea");

for (int i = 0; i < 150; i++) {
    Appointment appointment = new Appointment();

    Customer customer = customers.get(random.nextInt(customers.size()));
    Hospital hospital = hospitals.get(random.nextInt(hospitals.size()));

    appointment.setCustomerId(customer.getId());
    appointment.setHospitalId(hospital.getId());
    appointment.setSymptom(commonSymptoms.get(random.nextInt(commonSymptoms.size()))); 
    appointment.setPatientAge(20 + random.nextInt(45)); // patient age range is 20-65

    appointments.add(appointment);
    

}

        
ArrayList<HotelReservation> hotelReservations = system.getHotelReservations().getReservationList();

for (int i = 0; i < 100; i++) {
    HotelReservation reservation = new HotelReservation();

    Customer customer = customers.get(random.nextInt(customers.size()));
    Hotel hotel = hotels.get(random.nextInt(hotels.size()));

    reservation.setCustomerId(customer.getId());
    reservation.setRestaurantId(hotel.getId());
    reservation.setNoOfGuests(random.nextInt(10) + 1); // 1 to 10 guests

    String time = "2023-05-" + (random.nextInt(30) + 1) + " " + 
                   (random.nextInt(24)) + ":" + (random.nextInt(60));
    reservation.setTime(time);

    hotelReservations.add(reservation);


}

ArrayList<HotelOrder> hotelOrders = system.getHotelOrders().getOrderList();

for (int i = 0; i < 100; i++) {
    HotelOrder order = new HotelOrder();

    Customer customer = customers.get(random.nextInt(customers.size()));
    Hotel hotel = hotels.get(random.nextInt(hotels.size()));

    order.setCustomerId(customer.getId());
    order.setRestaurantId(hotel.getId());

    HashMap<String, Integer> cart = new HashMap<>();
    List<String> menuItems = new ArrayList<>(hotel.getFoodMenu().keySet());
    for (int j = 0; j < random.nextInt(5) + 1; j++) { // Random number of items, up to 5
        String item = menuItems.get(random.nextInt(menuItems.size()));
        int quantity = random.nextInt(5) + 1;
        cart.put(item, quantity);
    }
    order.setCart(cart);

    // Calculate the order total
    float orderTotal = 0;
    for (Map.Entry<String, Integer> entry : cart.entrySet()) {
        float price = hotel.getFoodMenu().get(entry.getKey());
        orderTotal += price * entry.getValue();
    }
    order.setOrderTotal(orderTotal);

    hotelOrders.add(order);


}



//Create some enquiries for mall
    

        for (int i = 0; i < 100; i++) {
            // Create visitor
            MallVisitor visitor = new MallVisitor();
            Customer customer = customers.get(random.nextInt(customers.size()));
            Mall mall = malls.get(random.nextInt(malls.size()));
            visitor.setCustomerId(customer.getId());
            visitor.setMallId(mall.getId());
            visitor.setTime("2023-05-" + (random.nextInt(30) + 1) + " " + 
                            (random.nextInt(24)) + ":" + (random.nextInt(60)));
            system.getMallVisitors().getVisitorList().add(visitor);

            // Print Visitor Details


            // Create enquiry
            MallEnquiry enquiry = new MallEnquiry();
            enquiry.setCustomerId(customer.getId());
            enquiry.setMallId(mall.getId());
            enquiry.setProducts("Product " + (random.nextInt(5) + 1)); // Example product
            system.getMallEnquiries().getEnquiryList().add(enquiry);


        }
        
        
ArrayList<MuseumVisitor> museumVisitors = system.getMuseumVisitors().getMuseumVisitorList();
for (int i = 0; i < 100; i++) {
    MuseumVisitor visitor = new MuseumVisitor();
    Customer customer = customers.get(random.nextInt(customers.size()));
    Museum museum = museums.get(random.nextInt(museums.size()));

    visitor.setCustomerId(customer.getId());
    visitor.setMuseumId(museum.getId());
    visitor.setTime("2023-05-" + (random.nextInt(30) + 1) + " " +
                    (random.nextInt(24)) + ":" + (random.nextInt(60)));

    museumVisitors.add(visitor);


}

// Creating museum questions
ArrayList<MuseumQuestion> museumQuestions = system.getMuseumQuestions().getMuseumQuestions();
for (int i = 0; i < 100; i++) {
    MuseumQuestion question = new MuseumQuestion();
    Customer customer = customers.get(random.nextInt(customers.size()));
    Museum museum = museums.get(random.nextInt(museums.size()));

    question.setCustomerId(customer.getId());
    question.setMuseumId(museum.getId());
    question.setQuestion("Question " + (i + 1) + ": " + faker.lorem().sentence());

    museumQuestions.add(question);


}        
        




ArrayList<Event> events = system.getEvents().getEventList();
        for (int i = 0; i < 100; i++) {
            Event event = new Event();
            event.setParkId(random.nextInt(30)); 
            event.setName("Event " + faker.rockBand().name());
            event.setDate("2023-" + (random.nextInt(12) + 1) + "-" + (random.nextInt(28) + 1));
            events.add(event);
        }

        ArrayList<ParkVisitor> parkVisitors = system.getParkVisitors().getVisitorList();
        for (int i = 0; i < 100; i++) {
            ParkVisitor visitor = new ParkVisitor();
            visitor.setCustomerId(random.nextInt(50)); 
            visitor.setParkId(random.nextInt(30)); 
            visitor.setTime(faker.date().birthday().toString());
            parkVisitors.add(visitor);
        }

        
    

        ArrayList<Report> reports = system.getReports().getReportList();
        for (int i = 0; i < 100; i++) {
            Report report = new Report();
            report.setCustomerId(random.nextInt(50)); 
            String city = cities.get(random.nextInt(cities.size()));
            report.setLocation(city);
            report.setLandmark("Landmark " + (i + 1));
            report.setDepartmentId(random.nextInt(20)); 
            reports.add(report);

        }


        
        ArrayList<Movie> movies = system.getMovies().getMovieList();
        for (int i = 0; i < 100; i++) {
            Movie movie = new Movie();
            movie.setTheatreId(random.nextInt(60)); 
            movie.setName("Movie " + faker.book().title());
            movie.setDuration(random.nextInt(180) + 60); 
            movie.setCategory("Category " + (i % 5 + 1)); 
            movie.setPrice(random.nextFloat() * (20 - 5) + 5); 
            movie.setTiming("2023-" + (random.nextInt(12) + 1) + "-" + (random.nextInt(28) + 1) + " " +
                            (random.nextInt(24)) + ":" + (random.nextInt(60)));
            movies.add(movie);


        }

        // Create 100 bookings
        ArrayList<Booking> bookings = system.getBookings().getBookingList();
        for (int i = 0; i < 100; i++) {
            Booking booking = new Booking();
            booking.setCustomerId(customers.get(random.nextInt(customers.size())).getId());
            booking.setTheatreId(random.nextInt(60)); // Assuming 60 theaters
            booking.setMovieName(movies.get(random.nextInt(movies.size())).getName());
            booking.setNoOfTickets(random.nextInt(5) + 1); // 1 to 5 tickets
            booking.setTotalPrice(booking.getNoOfTickets() * (int)movies.get(booking.getTheatreId()).getPrice());

            bookings.add(booking);


        }
        
        
        ArrayList<ShoppingAppointment> shoppingAppointments = system.getShoppingAppointments().getAppointmentList();
        for (int i = 0; i < 100; i++) {
            ShoppingAppointment appointment = new ShoppingAppointment();
            Customer customer = customers.get(random.nextInt(customers.size()));
            appointment.setCustomerId(customer.getId());
            appointment.setShopId(random.nextInt(shops.size())); // Assuming the total number of shops is within the size of the shops list
            appointment.setTime("2023-05-" + (random.nextInt(30) + 1) + " " + 
                                (random.nextInt(24)) + ":" + (random.nextInt(60)));
            shoppingAppointments.add(appointment);


        }

        // Creating 100 Shopping Orders
        ArrayList<ShoppingOrder> shoppingOrders = system.getShoppingOrders().getOrderList();
        for (int i = 0; i < 100; i++) {
            ShoppingOrder order = new ShoppingOrder();
            Customer customer = customers.get(random.nextInt(customers.size()));
            Shop shop = shops.get(random.nextInt(shops.size())); // Assuming the shops list is already populated

            order.setCustomerId(customer.getId());
            order.setShopId(shop.getId());

            // Generate a random cart
            HashMap<String, Integer> cart = new HashMap<>();
            List<String> shopItems = new ArrayList<>(shop.getShopMenu().keySet());
            for (int j = 0; j < random.nextInt(5) + 1; j++) {
                String item = shopItems.get(random.nextInt(shopItems.size()));
                int quantity = random.nextInt(5) + 1;
                cart.put(item, quantity);
            }
            order.setCart(cart);

            // Calculate the order total
            float orderTotal = 0f;
            for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                float price = shop.getShopMenu().get(entry.getKey());
                orderTotal += price * entry.getValue();
            }
            order.setOrderTotal(orderTotal);

            shoppingOrders.add(order);

;
        }

        
        ArrayList<Rental> rentals = system.getRentals().getRentalList();

        for (int i = 0; i < 100; i++) {
            Rental rental = new Rental();
            Customer customer = customers.get(random.nextInt(customers.size()));
            Vehicle vehicle = vehicles.get(random.nextInt(vehicles.size())); 

            rental.setCustomerId(customer.getId());
            rental.setVehicleName(vehicle.getName());
            rental.setHourlyPrice(vehicle.getHourlyPrice());
            int noOfDays = random.nextInt(10) + 1; 
            rental.setNoOfDays(noOfDays);
            rental.setTotalPrice(vehicle.getHourlyPrice() * noOfDays * 24);

            rentals.add(rental);

 
        }

//        system.getRentalEnterpise().analyzeAndPlotHighestRentedCategory(system, "New York");


    User user1 = new User();
    user1.setId(650);
    user1.setName("MarketAnalyst");
    user1.setUsername("analyst");
    user1.setPassword("analyst");
        MarketAnalyst analyst = new MarketAnalyst(user1);
        system.getAnalystDirectory().getAnalystList().add(analyst);
    
        
        return system;
    }
    
}
