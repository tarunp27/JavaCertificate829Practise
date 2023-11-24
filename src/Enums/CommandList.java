package Enums;
interface Command{
    void execute();
}
public enum CommandList implements Command {
    RUN{
        @Override
        public void execute(){
            System.out.println("Rummy");
        }
    },
    Jump{
        @Override
        public void execute() {
            System.out.println("Jumpy");
        }
    };
}
