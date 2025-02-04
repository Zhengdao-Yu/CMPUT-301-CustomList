import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        City city = new City("Halifax","NS");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(listSize,list.getCount());
    }

    @Test
    public void hasCityTest(){
        int listSize = list.getCount();
        City city = new City("Halifax","NS");
        list.addCity(city);

        assertEquals(listSize+1,list.getCount());
        assertTrue(list.hasCity(city));
    }

    @Test
    public void countCityTest(){
        int listSize = list.getCount();
        City city1 = new City("Halifax","NS");
        City city2 = new City("Edmonton","AB");
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(listSize+2,list.countCity());
    }
}
