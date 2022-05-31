package ru.job4j.oop;

public class Error {

   private boolean active;
   private int status;
   private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

   public void printInfoError() {
       System.out.println("Ошибка активна: " + active);
       System.out.println("Статус ошибки: " + status);
       System.out.println("Сообщение об ошибке: " + message);
   }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Страница не найдена.");
        error.printInfoError();
        Error error1 = new Error(true, 410, "Страницы не существует.");
        error1.printInfoError();
        Error error2 = new Error(false, 500, "Ошибка сервера.");
        error2.printInfoError();
        Error four = new Error();
        four.printInfoError();
    }
}
