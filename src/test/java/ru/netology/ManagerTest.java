package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void test1() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        Manager manager = new Manager();
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
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        ;

        Manager manager = new Manager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);

        String[] expected = {"movie4", "movie3", "movie2", "movie1" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (верхняя граница лимита +1) (лимит по умолчанию)
    public void outputMovieLimitOnMax2() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";

        Manager manager = new Manager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] expected = {"movie6", "movie5", "movie4", "movie3", "movie2", "movie1" };
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
}