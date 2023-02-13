package packet;
//@author Domingo 2013_02_13

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
// Write File *******
        Person personToFile = new Person("Arnold", "Los Angeles", 72);
        FileOutputStream file = null;

        try {
            file = new FileOutputStream("data.dat");
            ObjectOutputStream tube = new ObjectOutputStream(file);
            tube.writeObject(personToFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
// Read File *******
        FileInputStream fileIn = null;
        Person p;

        try {
            fileIn = new FileInputStream("data.dat");
            ObjectInputStream tubeIn = new ObjectInputStream(fileIn);
            p = (Person) tubeIn.readObject();
            p.showPerson();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
