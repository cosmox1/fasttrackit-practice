package fasttrackit.vetclinicapplication.service;


import fasttrackit.vetclinicapplication.model.dto.Pet;
import fasttrackit.vetclinicapplication.aditionals.PetEnums;
import fasttrackit.vetclinicapplication.model.entity.PetEntity;
import fasttrackit.vetclinicapplication.repos.PetRepos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PetServiceTest {
    @InjectMocks
    private PetService service;
    //the mock will create a object of type PetRepos wich will not do anything
    //if we want any method call from the  "repos" to be done we must manualy define it with mockitho.when
    @Mock
    private PetRepos repos;
@Test
    public void createNewPet_expectedRepositorySaveMethodCall(){

    Pet petRequest= new Pet();//test setup
    Mockito.when(this.repos.save(ArgumentMatchers.any(PetEntity.class))).thenReturn(new PetEntity());
    this.service.createNewPet(petRequest);//when the service method calls the createPet method
    Mockito.verify(repos).save(ArgumentMatchers.any(PetEntity.class));//then the repos saved method is called
};


@Test
    public void testExpected_expectedActualsValuesFromRepository(){
    //test setup
    PetEntity expectedEntity=new PetEntity();
    expectedEntity.setId(2L);
    expectedEntity.setName("Pisiq");
    expectedEntity.setPets(PetEnums.CAT);
    Mockito.when(repos.save(ArgumentMatchers.any())).thenReturn(expectedEntity);
    //when(action to test)
    Pet actual=service.createNewPet(new Pet());
    //then (assertions)
    Assertions.assertNotNull(actual);
    Assertions.assertEquals("Pisiq",actual.getName());
    Assertions.assertEquals(PetEnums.CAT, actual.getPets());
    Assertions.assertNotNull(actual.getId());
}
}