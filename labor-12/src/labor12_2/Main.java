package labor12_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Data10 - Update10");
        long startTime1 = System.nanoTime();
        Storage storage1 = new Storage("data10.txt");
        storage1.update("update10.txt");
        long endTime1 = System.nanoTime() - startTime1;
        System.out.format("Execution time: %.4f seconds", (double)endTime1/1000000000);

        System.out.println("\n\nData1000 - Update1000");
        long startTime2 = System.nanoTime();
        Storage storage2 = new Storage("data1000.txt");
        storage2.update("update1000.txt");
        long endTime2 = System.nanoTime() - startTime2;
        System.out.format("Execution time: %.4f seconds", (double)endTime2/1000000000);

        System.out.println("\n\nData1000 - Update1000000");
        long startTime3 = System.nanoTime();
        Storage storage3 = new Storage("data1000.txt");
        storage3.update("update1000000.txt");
        long endTime3 = System.nanoTime() - startTime3;
        System.out.format("Execution time: %.4f seconds", (double)endTime3/1000000000);

        System.out.println("\n\nData1000000 - Update1000");
        long startTime4 = System.nanoTime();
        Storage storage4 = new Storage("data1000000.txt");
        storage4.update("update1000.txt");
        long endTime4 = System.nanoTime() - startTime4;
        System.out.format("Execution time: %.4f seconds", (double)endTime4/1000000000);

        System.out.println("\n\nData1000000 - Update1000000");
        long startTime5 = System.nanoTime();
        Storage storage5 = new Storage("data1000000.txt");
        storage5.update("update1000000.txt");
        long endTime5 = System.nanoTime() - startTime5;
        System.out.format("Execution time: %.4f seconds", (double)endTime5/1000000000);

        System.out.println("\n\nData1000000 - Update10000000");
        long startTime6 = System.nanoTime();
        Storage storage6 = new Storage("data1000000.txt");
        storage5.update("update10000000.txt");
        long endTime6 = System.nanoTime() - startTime6;
        System.out.format("Execution time: %.4f seconds", (double)endTime6/1000000000);
    }
}
