package SerializationAndObjectStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Mercedes","C180");
        /*
        // Dosyaya obje yazma
        try {
            FileOutputStream outputFile = new FileOutputStream("src/SerializationAndObjectStream/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            outputFile.close();
            output.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        */
        // Dosyadan obje alma
        try {
            FileInputStream inputFile = new FileInputStream("src/SerializationAndObjectStream/araba.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);
            Car newCar = (Car) input.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            inputFile.close();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
