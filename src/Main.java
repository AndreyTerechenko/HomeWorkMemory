import java.util.Arrays;

public class Main {
    public static void changeValue(int value) {
        value = 22;
    }

    public static void changeValue1(Integer value1) {
        value1 = 22;
    }

    public static void changeValue2(Integer[] value2) {
        value2 = new Integer[]{1, 2};
    }

    public static void changeValue3(Integer[] value3) {
        value3 = new Integer[]{99, 2};
    }

    public static void changePerson(Person person) {
        Person person1 = new Person("Ilya", "Lagutenko");
    }

    public static void changePerson1(Person pers) {
        Person person1 = new Person("Ilya", "Lagutenko");
    }

    public static void main(String[] args) {
        // Task5
        int value = 33;
        changeValue(value);
        System.out.println(value);
        // Выдает значение value 33,всё в Java передается по значению.При попадании в метод сущность копирует то,
        // что хранится в ней, свое значение. Так как метод changeValue void (не возвращающий) Если бы метод был возвращающим значение,
        // То значение переменной, было бы равно значению в методе. Если я ничего не перепутал.
// Task6
        Integer value1 = 33;
        changeValue1(value1);
        System.out.println(value1);
        // Выдает значение value 33,всё в Java передается по значению. При попадании в метод сущность копирует то,
        // что хранится в ней, свое значение. Так как метод changeValue void (не возвращающий) Если бы метод был возвращающим значение,
        // То значение переменной, было бы равно значению в методе. Если я ничего не перепутал. По поводу сравнения, на сколько я понимаю int и Integer одно и тоже,
        // Лишь с небольшой разницей. int примитив а Integer это объект на подобие String`a  и ему вроде как выделяется больше памяти
// Task7
        Integer value2[] = new Integer[]{3, 4};
        changeValue2(value2);
        System.out.println(Arrays.toString(value2));  // Третья задача ответ 3,4 .
        // Опять же метод void принимает данные, а не передает их и передавая в метод примитивы и
        // массивы как параметры, мы не меняем их первоисточни, которых находится вне метода.
        // Task8
        Integer value3[] = new Integer[]{3, 4};
        changeValue3(value3);
        System.out.println(Arrays.toString(value3));  // Третья задача ответ 3,4 .
        // Опять же метод void принимает данные, а не передает их и передавая в метод примитивы и
        // массивы как параметры, мы не меняем их первоисточни, которых находится вне метода.
        // задача 7 и 8 одинаковая, с разницей в одном числе, и никак не влияет на результат
        // по приведенным ввыше причинам.
        // Task9
        Person person;
        Person person2 = new Person("Lyapis", "Trubetskoy");
        changePerson(person2);
        System.out.println(person2);  // Ответ получился Ляпис Трубетской. На сколько я понимаю, мы создали метод ,
        //void который принимает данные и устанавливает значения в классе Person.
        // последнюю(10) задачу не написал, она полностью копирует предпоследнюю(9). в них нет никакой разницы
        //Task 10
        Person pers;
        Person person3 = new Person("Lyapis", "Trubetskoy");
        changePerson(person3);
        System.out.println(person3); // Метод полностью изменил значение объекта, так как объект является ссылочным.
        // Разницы между 9м и 10м заданием я не увидел. Если смотреть описание задач, они идентичны как близнецы, без доп условий.
    }
}
