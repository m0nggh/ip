import java.util.List;
import java.util.Scanner;

public class Ui {
    private final String line = "----------------------";
    private final String logo = " ____        _        \n"
                                + "|  _ \\ _   _| | _____ \n"
                                + "| | | | | | | |/ / _ \\\n"
                                + "| |_| | |_| |   <  __/\n"
                                + "|____/ \\__,_|_|\\_\\___|\n";
    private Scanner sc = new Scanner(System.in);

    public String getInput() {
        return sc.nextLine();
    }

    public void format(String input) {
        System.out.println(line + "\n" + input + "\n" + line);
    }

    public void greet() {
        format("Hello! I'm\n" + logo + "\n" +
                "What can I do for you?");
    }

    public void throwDukeException(DukeException ex) {
        format(ex.getMessage());
    }

    public void addTask(Task task, int size) {
        format("Got it. I've added this task:\n" + task +  "\n"
            + "Now you have " + size + " tasks in the list.");
    }

    public void displayCompletedTask(Task task) {
        format("Nice! I've marked this task as done:\n" + task);
    }

    public void displayDeletedTask(Task task, int size) {
        format("Noted. I've removed this task:\n" + task + "\n"
            + "Now you have " + size + " tasks in the list.");
    }

    public void displayTasksWithKeyword(List<Task> tasks) {
        StringBuilder sb = new StringBuilder();
        int len = tasks.size();
        if (len == 0) {
            sb.append("No tasks!");
            format(sb.toString());
            return;
        }
        sb.append("Here are the matching tasks in your list:\n");
        for (int i = 0; i < len; i++) {
            sb.append(i + 1 + "." + tasks.get(i) + "\n");
        }
        format(sb.toString());
    }

    public Scanner getScanner() {
        return this.sc;
    }
}
