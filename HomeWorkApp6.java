package lesson1;
class Animal {
    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
}

class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть такое расстояние.");
        }
    }
}

class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
}

public class HomeWorkApp6 {
    private static int catsCount = 0;
    private static int dogsCount = 0;

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.run(150);
        cat1.swim(5);
        catsCount++;

        Dog dog1 = new Dog();
        dog1.run(500);
        dog1.swim(2);
        dogsCount++;

        Cat cat2 = new Cat();
        cat2.run(178);
        cat2.swim(3);
        catsCount++;

        System.out.println("Количество котов: " + catsCount);
        System.out.println("Количество собак: " + dogsCount);
        System.out.println("Общее количество животных: " + (catsCount + dogsCount));
    }
}
