package gicu;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class HashSetDateTest {
	
	@Test
    public void hashSetCanFailToFindTheSameElementPreviouslyAdded() {
        Set<Date> hashSet = new HashSet<>();
        Date date = new Date();
        hashSet.add(date);
        Assert.assertTrue((hashSet).contains(date)); //should fail
    }
	
	@Test
    public void hashSetCanFailToFindTheSameElementPreviouslyAdded1() {
        Set<Date> hashSet = new HashSet<>();
        Date date = new Date();
        hashSet.add(date);
        date.setTime(123L);
        Assert.assertTrue((! hashSet.contains(date)));
    }
}
