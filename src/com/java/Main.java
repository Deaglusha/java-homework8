package com.java;

/*Ты делаешь графический редактор.
Продумай иерархию классов. Здесь должны быть как минимум:
базовый класс для фигуры Shape. Этот класс должен иметь метод для вывода имени фигуры.
классы-наследники - Circle, Quad и т.д. - не меньше 5 вариантов;
должен быть класс, который принимает фигуру, и выводит ее название. Класс должен работать именно с базовым классов
Shape.
Обрати внимание на использование интерфейсов, абстрактных классов, модификаторов доступа.
Нет единого правильного способа решения этой задачи. Попытайся спроектировать гибкую архитектуру, задавая себе вопросы
вида "А что будет, если этот класс нужно будет менять? Что еще поменяется, если здесь нужно будет расширить?".*/

public class Main {
    public static void main(String[] args) {
        Shape shape = new Square();
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();

        shape.printShape();

        System.out.println(shape.getColor());
        shape1.setColor("Зеленый");
        System.out.println(shape1.getColor());
        shape1.printShape();

        System.out.println(shape.toString());
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}
