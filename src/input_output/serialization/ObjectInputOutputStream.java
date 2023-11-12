package input_output.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream {
  static String filePath = "C:/Users/E-Kate/Desktop/employee.txt";

  public static void main(String[] args) throws Exception {
    serialize();
    deserialize();
  }

  static void serialize() throws Exception{
    Employee employee = new Employee(34, "Jane Green", "234");

    try(FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
      objectOutputStream.writeObject(employee);
    }
  }

  static void deserialize() throws Exception {
    try (FileInputStream fileInputStream = new FileInputStream(filePath);
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
      Employee employee = (Employee) objectInputStream.readObject();
      System.out.println("id: "+ employee.id);
      System.out.println("name: "+ employee.name);
      System.out.println("password: "+ employee.password);
    }
  }
}
