package utilName;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilNameTest {

    @Test
   public void creatorJeMartinDobos(){
       assertTrue("Martin Dobos".equals(UtilName.CREATOR));
   }

}