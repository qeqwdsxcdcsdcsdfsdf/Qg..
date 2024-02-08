// main
package study.day5;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Movie[] m1 = new Movie[4];
        Scanner sc = new Scanner(System.in);

        m1[0] = new Movie(1,"水门桥", 38.1, 9.8);
        m1[1] = new Movie(2,"水门桥", 38.1, 9.8);
        m1[2] = new Movie(3,"水门桥", 38.1, 9.8);
        m1[3] = new Movie(4,"水门桥", 38.1, 9.8);


        MovieOperator m2 = new MovieOperator(m1);
        m2.PrintAllMovies();
        m2.XuanZe(sc.nextInt());

    }
}

// 实体类（存储对象数据）
package study.day5;

public class Movie {
    private int id;
    private String name;
    private double price;
    private double score;
    public Movie(){

    }

    public Movie(int id, String name, double price, double score) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

// 操作类
package study.day5;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    public void PrintAllMovies(){
        System.out.println("-----系统全部信息----");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId());
            System.out.println(m.getName());
            System.out.println(m.getPrice());
            System.out.println(m.getScore());
        }
    }
    public void XuanZe(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id){
                System.out.println(m.getId());
                System.out.println(m.getName());
                return;
            }
        }
        System.out.println("没有");
    }
}

