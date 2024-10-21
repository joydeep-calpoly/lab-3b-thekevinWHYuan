package lab_3c;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ServiceTest {
    private static final int MOCKDATABASEID = 42;
    @Test
    public void TestDatabaseID(){
        Database mockDatabase = Mockito.mock(Database.class);
        Assert.assertNotNull(mockDatabase);
        Mockito.when(mockDatabase.getUniqueId()).thenReturn(MOCKDATABASEID);
        Service testService = new Service(mockDatabase);

        Assert.assertEquals("Using database with id: 42", testService.getDatabaseID());
    }

}
