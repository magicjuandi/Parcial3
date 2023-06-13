package com.EjerciciosCrud.Car.RepositoryCar;

import java.io.IOException;
import java.util.List;

import com.EjerciciosCrud.Car.ModelCar.Car;

public interface CarRep {
    Car findbyId(int id);
    List<Car> findAll()throws IOException, ClassNotFoundException;
    void save(Car car)throws IOException;
    void update(Car car)throws IOException;
    void delete(Car car)throws IOException;
}
