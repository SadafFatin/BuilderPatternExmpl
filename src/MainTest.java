public class MainTest {

    public static void main(String[] args) {
        Task task1 = new Task.TaskBuilder(0,"Sms").setDone(true).build();
        Task task2 = new Task.TaskBuilder(1,"Email").setDescription("Hello this is email").build();

        System.out.println(task1);
        System.out.println(task2);

    }

}