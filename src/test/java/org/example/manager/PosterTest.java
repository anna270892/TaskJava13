package org.example.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterTest {

    Poster manager = new Poster();

    private MoviesPoster one = new MoviesPoster("Бладшот");
    private MoviesPoster two = new MoviesPoster("Вперёд");
    private MoviesPoster three = new MoviesPoster("Отель Белград");
    private MoviesPoster four = new MoviesPoster("Джентельмены");
    private MoviesPoster five = new MoviesPoster("Человек-невидимка");
    private MoviesPoster six = new MoviesPoster("Тролии. Мировой тур");
    private MoviesPoster seven = new MoviesPoster("Номер один");
    private MoviesPoster eight = new MoviesPoster("Номер два"); //новый фильм


    //добавить фильм
    @Test
    void addAAddMovie() {
        Poster manager = new Poster(5);
        manager.addNewMovie(one);
        manager.addNewMovie(two);
        manager.addNewMovie(three);
        manager.addNewMovie(four);
        manager.addNewMovie(five);
        manager.addNewMovie(six);
        manager.addNewMovie(seven);
        manager.addNewMovie(eight); //новый фильм
        MoviesPoster[] actual = manager.getLastAdd();
        MoviesPoster[] expected = {eight, seven, six, five, four};
        Assertions.assertArrayEquals(expected, actual);
    }

    //вывести все фильмы в порядке добавления первого фильма, восемь
    @Test
    void findAll() {
        Poster manager = new Poster(8);
        manager.addNewMovie(one);
        manager.addNewMovie(two);
        manager.addNewMovie(three);
        manager.addNewMovie(four);
        manager.addNewMovie(five);
        manager.addNewMovie(six);
        manager.addNewMovie(seven);
        manager.addNewMovie(eight); //новый фильм
        MoviesPoster[] actual = manager.findAll();
        MoviesPoster[] expected = {one, two, three, four, five, six, seven, eight};
        Assertions.assertArrayEquals(expected, actual);
    }

    //вывести все фильмы в обратном порядке от добавления последнего фильма, восемь
    @Test
    void findAllInReverseOrder() {
        Poster manager = new Poster(8);
        manager.addNewMovie(one);
        manager.addNewMovie(two);
        manager.addNewMovie(three);
        manager.addNewMovie(four);
        manager.addNewMovie(five);
        manager.addNewMovie(six);
        manager.addNewMovie(seven);
        manager.addNewMovie(eight); //новый фильм
        MoviesPoster[] actual = manager.getLastAdd();
        MoviesPoster[] expected = {eight, seven, six, five, four, three, two, one};
        Assertions.assertArrayEquals(expected, actual);
    }

    //проверим максимальное значение фильмов, если ноль
    @Test
    void maximumZero() {
        Poster manager = new Poster(0);
        MoviesPoster[] actual = manager.getLastAdd();
        MoviesPoster[] expected = new MoviesPoster[0];
        Assertions.assertArrayEquals(expected, actual);
    }

    //проверим максимальное значение фильмов по умолчанию
    @Test
    void defaultMaximum() {
        Poster manager = new Poster();
        manager.addNewMovie(one);
        manager.addNewMovie(two);
        manager.addNewMovie(three);
        manager.addNewMovie(four);
        manager.addNewMovie(five);
        manager.addNewMovie(six);
        manager.addNewMovie(seven);
        manager.addNewMovie(eight); //новый фильм
        MoviesPoster[] actual = manager.getLastAdd();
        MoviesPoster[] expected = {eight, seven, six, five, four};
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывести по умолчанию последние 3 добавленных фильма
    @Test
    void findLast() {
        Poster manager = new Poster(3);
        manager.addNewMovie(one);
        manager.addNewMovie(two);
        manager.addNewMovie(three);
        manager.addNewMovie(four);
        manager.addNewMovie(five);
        manager.addNewMovie(six);
        manager.addNewMovie(seven);
        manager.addNewMovie(eight); //новый фильм
        MoviesPoster[] actual = manager.getLastAdd();
        MoviesPoster[] expected = {eight, seven, six};
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывести по умолчанию последние 7 добавленных фильма
    @Test
    void findLast7() {
        Poster manager = new Poster(7);
        manager.addNewMovie(one);
        manager.addNewMovie(two);
        manager.addNewMovie(three);
        manager.addNewMovie(four);
        manager.addNewMovie(five);
        manager.addNewMovie(six);
        manager.addNewMovie(seven);
        manager.addNewMovie(eight); //новый фильм
        MoviesPoster[] actual = manager.getLastAdd();
        MoviesPoster[] expected = {eight, seven, six, five, four, three, two};
        Assertions.assertArrayEquals(expected, actual);
    }
}
