package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager manager = new Manager();
    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";
    String movie6 = "movie6";
    String movie7 = "movie7";
    String movie8 = "movie8";
    String movie9 = "movie9";
    String movie10 = "movie10";
    String movie11 = "movie11";


    @Test
    public void test1() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        Manager manager = new Manager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов равно лимиту (верхняя граница лимита) (лимит по умолчанию)
    public void outMovieLimitOnEquals() {


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);


        String[] expected = {"movie10","movie9","movie8","movie7","movie6","movie5","movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (верхняя граница лимита +1) (лимит по умолчанию)
    public void outputMovieLimitOnMax2() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {"movie11","movie10","movie9","movie8","movie7","movie6", "movie5", "movie4", "movie3", "movie2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница) (лимит установлен)
    public void outputMovieLimitOffMin() {
        Manager manager = new Manager(3);
        ;

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница)
    public void outputMovieLinitOnMin() {

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница + 1) (лимит по умолчанию)
    public void outputMovieLimitOnMin1() {
        manager.add("movie1");
        String[] expected = {"movie1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (лимит по умолчанию)
    public void outputMovieLimitOn() {
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");

        String[] expected = {"movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница + 1) (лимит установлен)
    public void outputMovieLimitOffMin1() {
        Manager manager = new Manager(3);
        manager.add("movie1");

        String[] expected = {"movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (верхняя граница лимита +1) (лимит установлен)
    public void outputMovieLimitOffMax2() {
        Manager manager = new Manager(4);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");

        String[] expected = {"movie5", "movie4", "movie3", "movie2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    //  вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (верхняя граница лимита - 1) (лимит по умолчанию)
    public void outputMovieLimitOnMax0() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);


        String[] expected = {"movie9","movie8","movie7","movie6","movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (лимит по умолчанию)
    public void outputMovieLimitOnMaxMax() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {"movie11","movie10","movie9","movie8","movie7","movie6","movie5","movie4", "movie3", "movie2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (лимит установлен)
    public void outputMovieLimitOff() {
        Manager manager = new Manager(10);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");

        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    //  вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (верхняя граница лимита - 1) (лимит установлен)
    public void outputMovieLimitOffMax0() {
        Manager manager = new Manager(5);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");

        String[] expected = {"movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов равно лимиту (верхняя граница лимита) (лимит установлен)
    public void outputMovieLimitOffMax1() {
        Manager manager = new Manager(5);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");

        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (лимит установлен)
    public void outputMovieLimitOffMaxMax() {
        Manager manager = new Manager(3);
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");

        String[] expected = {"movie5", "movie4", "movie3",};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}