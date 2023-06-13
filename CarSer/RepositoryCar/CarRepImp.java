package com.EjerciciosCrud.Car.RepositoryCar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.EjerciciosCrud.Car.ModelCar.Car;

public class CarRepImp implements CarRep{
    
    private List<Car> cars;
    
    public CarRepImp()throws IOException, ClassNotFoundException{
        cars = new ArrayList<>();
    }

    @Override
    public void update(Car car)throws IOException{
        Car oldCar = findbyId(car.getId());
        if(oldCar != null){
            cars.remove(oldCar);
            cars.add(car);
        }
        CarSer.writer(this.cars,"car.ax");
    }
    
    @Override
    public void delete(Car car)throws IOException {
        this.cars.remove(car);
        CarSer.writer(this.cars, "car.ax");
    }

    @Override
    public List<Car> findAll()throws IOException, ClassNotFoundException {
        cars = (List<Car>) CarSer.reader("car.ax");
        return cars;
    }

    @Override
    public Car findbyId(int id) {
        return cars.stream()
            .filter(car -> car.getId() == id)
            .findFirst()
            .orElse(null);
    }

    @Override
    public void save(Car car)throws IOException {
        this.cars.add(car);
        CarSer.writer(this.cars, "car.ax");
    }

    
    


}
