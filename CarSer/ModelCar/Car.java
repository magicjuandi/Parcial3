package com.EjerciciosCrud.Car.ModelCar;

import java.io.Serializable;

public class Car implements Serializable {
    public Integer Id;
    private String Plate;
    private String owner;
    private String date;
    private String phone;

    public Car(Integer id, String plate, String owner, String date, String phone) {
        Id = id;
        this.Plate = plate;
        this.owner = owner;
        this.date = date;
        this.phone = phone;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String plate) {
        Plate = plate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", Plate='" + Plate + '\'' +
                ", owner='" + owner + '\'' +
                ", date='" + date + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
