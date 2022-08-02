public class Start {
    public static void main(String[] args) {
        String job = "dancer";
        int salary = 0;
        switch (job) {
            case "layer":
                salary = 500;
                break;
            case "developer":
                salary = 1000;
                break;
            case "chef":
                salary = 450;
                break;
            default:
                salary = 300;
        }
        System.out.println("Your job is " + job + " and you earn " + salary);
    }
}
