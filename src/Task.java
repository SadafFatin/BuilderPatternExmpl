
public class Task {


    private final long id;
    private String summary;
    private String description;
    private boolean done;

    public Task(long id) {
        this.id = id;
    }

    public Task(TaskBuilder taskBuilder) {
        this.id = taskBuilder.id;
        this.summary = taskBuilder.summary;
        this.description = taskBuilder.description;
        this.done = taskBuilder.done;
    }

    @Override
    public String toString() {
        return "task_id: "+this.id+", task_description: "+this.description+", is_done: "+this.done;
    }


    public static class TaskBuilder {

        private long id;
        private String summary = "";
        private String description = "";
        private boolean done = false;


        public TaskBuilder(long id, String summary){
            this.id = id;
            this.summary = summary;
        }

        public TaskBuilder setSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public TaskBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder setDone(boolean done) {
            this.done = done;
            return this;
        }


        public Task build() {
            return new Task(this);
        }

 }



}
