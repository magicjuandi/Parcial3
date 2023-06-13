package com.EjerciciosCrud.Car.RepositoryCar;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.EjerciciosCrud.Car.ModelCar.Car;

public class MainCar {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opt = "1";
        CarRep rep = new CarRepImp();
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1.Add \n 2.List \n 3.Edit" + "\n 4.Delete \n 5.List One \n 6.Exit \n =>");
            opt = s.next();
            switch (opt) {
                case "1": {
                    System.out.println("Id of the car: ");
                    Integer id = s.nextInt();
                    System.out.println("Plate of the car: ");
                    String plate = s.next();
                    System.out.println("Owner of the car: ");
                    String owner = s.next();
                    System.out.println("Date of entry: ");
                    String date = s.next();
                    System.out.println("Phone of the owner: ");
                    String phone = s.next();
                    rep.save(new Car(id, plate, owner, date, phone));
                    break;
                }
                case "2": {
                    List<Car> cars = rep.findAll();
                    cars.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("~~~~~Edit~~~~~");
                    System.out.println("Plate: ");
                    Integer idC = s.nextInt();
                    System.out.println("Plate: ");
                    String plate = s.next();
                    System.out.println("Owner: ");
                    String owner = s.next();
                    System.out.println("Date of entry: ");
                    String date = s.next();
                    System.out.println("Phone: ");
                    String phone = s.next();
                    Car update = new Car(idC, plate, owner, date, phone);
                    rep.update(update);
                    break;
                }
                case "4": {
                    System.out.println("~~~~~Delete~~~~~");
                    System.out.println("Insert Id of the car: ");
                    Integer id = s.nextInt();
                    rep.delete(rep.findbyId(id));
                    rep.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    System.out.println("~~~~~Just One~~~~~");
                    System.out.println("Insert Id of the car: ");
                    Integer id = s.nextInt();
                    System.out.println(rep.findbyId(id));

                    break;
                }
                case "6": {
                    opt = "6";
                    break;
                }
            }
        }while (opt != "6");
    }
}
