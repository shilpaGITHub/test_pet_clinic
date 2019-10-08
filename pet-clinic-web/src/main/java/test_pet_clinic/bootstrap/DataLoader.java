package test_pet_clinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sk.springframework.com.java.model.Owner;
import sk.springframework.com.java.model.Vet;
import sk.springframework.com.java.services.OwnerService;
import sk.springframework.com.java.services.VetService;
import sk.springframework.com.java.services.map.OwnerServiceMap;
import sk.springframework.com.java.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private  final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(11l);
        owner1.setFirstName("Shilpakala");
        owner1.setLastname("Chennabasappa");


        Owner owner2 = new Owner();
        owner1.setId(12l);
        owner1.setFirstName("Viji");
        owner1.setLastname("Chennabasappa");
        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId((long) 13);
        System.out.println("Loaded Vet");

    }
}
