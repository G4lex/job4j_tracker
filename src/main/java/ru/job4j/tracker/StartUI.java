package ru.job4j.tracker;

public class StartUI {

    public static void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select : ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
            }
        }

    private static void showMenu(UserAction[] actions) {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new ShowItems(), new EditAction(),
                new DeleteItem(), new FindIdItem(), new FindByName(), new ExitAction()};
        new StartUI().init(input, tracker, actions);
    }
}