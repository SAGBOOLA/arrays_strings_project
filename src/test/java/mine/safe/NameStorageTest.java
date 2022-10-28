package mine.safe;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class NameStorageTest {
    @Before
    public void start(){
        String[] namesArray = {"Arnold Welsh", "Michael Peters", "Erik Svensson", "Erik Henriksson", "John Welsh"};
        NameStorage.setNames(namesArray);
    }
    @Test
    public void test_getSize(){
        int expectedNumber = 5;
        int actualNumber = NameStorage.getSize();
        Assert.assertEquals(expectedNumber,actualNumber);
    }
    @Test
    public void test_clear(){
        NameStorage.clear();
    }
    @Test
    public void test_findAll(){
        String [] expected = {"Arnold Welsh", "Michael Peters", "Erik Svensson", "Erik Henriksson", "John Welsh"};
        String [] actual = NameStorage.findAll();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_find(){
        String expected = "Michael Peters";
        String actual = NameStorage.find("Michael Peters");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_findFullName(){
        String expected = "NULL";
        String actual = NameStorage.find("Erik Mayland");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_add(){
        boolean expected = true;
        boolean actual = NameStorage.add("Tracy Shaw");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_addName(){
        boolean expected = false;
        boolean actual = NameStorage.add("arnold welsh");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_findByFirstName(){
        String [] expectedNames = {"Erik Svensson","Erik Henriksson"};
        String [] actualNames = NameStorage.findByFirstName("erik");
        Assert.assertEquals(expectedNames,actualNames);
    }
    @Test
    public void test_findByLastName(){
        String [] expectedNames = {"Arnold Welsh", "John Welsh"};
        String [] actualNames = NameStorage.findByLastName("welsh");
        Assert.assertEquals(expectedNames,actualNames);
    }
    @Test
    public void test_update(){
        boolean expected = true;
        boolean actual = NameStorage.update("Michael Peters", "Michael Jordan");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_remove(){
        boolean expected = false;
        boolean actual = NameStorage.remove("Kate Hope");
        Assert.assertEquals(expected,actual);
    }
}
