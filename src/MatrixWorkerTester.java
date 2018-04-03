import org.junit.*;
import org.junit.internal.ArrayComparisonFailure;

public class MatrixWorkerTester {

    private MatrixWorker mw;

    @Before
    public void init() { mw = new MatrixWorker(); }
    @After
    public void tearDown() { mw = null; }

    @AfterClass
    public static void afterClass(){
        System.out.println("Тесты окончены!");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Тесты начаты!");
    }

    @Test
    public void getMatrixFromString(){

        String stringArray1 = "4";
        String stringArray2 = "1 1" + System.lineSeparator() + "0 0";
        String stringArray3 = "5 5 5" + System.lineSeparator() +
                        "6 6 6" + System.lineSeparator() +
                        "7 7 7";
        int[][] array1 = new int[][] {{4}};
        int[][] array2 = new int[][] {{1,1},
                                      {0,0}};
        int[][] array3 = new int[][] {{5,5,5},
                                      {6,6,6},
                                      {7,7,7}};
        try{
            Assert.assertArrayEquals(array1, mw.getMatrixFromString(stringArray1));
            Assert.assertArrayEquals(array2, mw.getMatrixFromString(stringArray2));
            Assert.assertArrayEquals(array3, mw.getMatrixFromString(stringArray3));
        }
        catch (ArrayComparisonFailure e){
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
}