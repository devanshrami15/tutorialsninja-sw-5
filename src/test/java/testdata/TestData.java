package testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data =new Object[][]{
                {"Pinks", "Shah", "Prim9223323@gmail.com","02085673453", "Prime1234", "Prime1234"},
        };
        return data;
    }


    @DataProvider(name = "details")
    public Object[][] getData1(){
        Object[][] data =new Object[][]{
                {"Prim98473@gmail.com", "Prime1234"},
        };
        return data;
    }
}
