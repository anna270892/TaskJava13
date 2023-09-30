package org.example.manager;

public class Poster {
    private MoviesPoster[] movies = new MoviesPoster[0]; //создаем массив с инициализацией ноль
    private int maxMovieLength = 5; //переменная с максимальным количеством фильмов


    //конструктор возьмет значение по умолчанию, если не указать максималное количество фильмов в менеджере
    public Poster() {
        maxMovieLength = maxMovieLength;
    }

    //конструктор устанавливает максимальное кол-во фильмов
    public Poster(int maximumNumberOfFilms) {
        if (maximumNumberOfFilms > 0) {
            maxMovieLength = maximumNumberOfFilms;
        } else {
            maxMovieLength = maxMovieLength; //если новое максимальное значение равно 0 или меньше оставь занчение 5
        }
    }


    public void addNewMovie(MoviesPoster movieTitle) { //movieTitle параметр
        int length = getMovies().length + 1; //переменная текущая длинна массива + 1
        MoviesPoster[] tmp = new MoviesPoster[length]; //создаем массив с длинной из переменной length
        for (int i = 0; i < getMovies().length; i++) { //копируем элементы в новый массив
            tmp[i] = movies[i];
        }
        int lastMovie = tmp.length - 1; //индекс последнего массива
        tmp[lastMovie] = movieTitle;
        movies = tmp; //новый массив присваиваем массиву movies
    }

    //метод получения последних фильмов в порядке добавления
    public MoviesPoster[] getLastAdd() {
        int moviesLength = getMovies().length; //текущую длинну массива сохраняем в moviesLength
        if (moviesLength < maxMovieLength) { //сравнваем с максимальным значением
            maxMovieLength = moviesLength;
        }
        MoviesPoster[] customFilm = new MoviesPoster[maxMovieLength]; //создаем массив с максимальной длинной
        for (int i = 0; i < customFilm.length; i++) {
            int result = moviesLength - i - 1; //добавление в обратном порядке относительно добавления фильма
            customFilm[i] = getMovies()[result];
        }
        return customFilm;
    }

    //метод вывода всех фильмов в порядке добавления
    public MoviesPoster[] findAll() {
        MoviesPoster[] outputOfAllMovies = getMovies();
        for (MoviesPoster movie : outputOfAllMovies) {
        }
        return outputOfAllMovies;
    }

    public MoviesPoster[] getMovies() {
        return movies;
    }

    public void setMovies(MoviesPoster[] movies) {
        this.movies = movies;
    }
}
