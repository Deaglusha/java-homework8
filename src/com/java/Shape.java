package com.java;

abstract class Shape {
    private String name = "неизвестная";
    private String color = "неизвестный";

    abstract public void printShape();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Фигура: " + name + ", цвет: " + color;
    }
}

class Square extends Shape {
    @Override
    public void printShape() {
        System.out.println("Квадрат");
    }
}

class Circle extends Shape {
    @Override
    public void printShape() {
        System.out.println("Круг");
    }
}

class Triangle extends Shape {
    @Override
    public void printShape() {
        System.out.println("Треугольник");
    }
}

class Rectangle extends Shape {
    @Override
    public void printShape() {
        System.out.println("Прямоугольник");
    }
}

class Diamond extends Shape {
    @Override
    public void printShape() {
        System.out.println("Ромб");
    }
}
