package sk.springframework.com.java.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sk.springframework.com.java.model.Owner;
import sk.springframework.com.java.model.Vet;
import sk.springframework.com.java.services.OwnerService;
import sk.springframework.com.java.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {

        Owner owner1 = new Owner();
        owner1.setId(11L);
        owner1.setFirstName("Shilpakala");
        owner1.setLastname("Chennabasappa");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(12L);
        owner2.setFirstName("Viji");
        owner2.setLastname("Chennabasappa");
        ownerService.save(owner2);

        System.out.println("Ownership has been loadded with data");

        Vet vet1 = new Vet();
        vet1.setId(13L);
        vet1.setFirstName("Shilpa");
        vet1.setLastname("Kala");

        vetService.save(vet1);
        System.out.println("VetService has been loadded with data");
    }
}
