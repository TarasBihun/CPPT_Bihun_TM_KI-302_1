package ki_302.Bihun.lab3;
import static java.lang.System.out;

public class HumanApp {
    public static void main(String[] args) {
        // Створюємо спортсменів
        Runner Nazar = new Runner();
        Nazar.train(); // Тренування Назаря

        Runner Andriy = new Runner();
        Andriy.compete(); // Змагання Андрія

        // Виведення інформації
        System.out.println("\nNazar Info (Training):");
        System.out.println("All Steps: " + Nazar.getAllSteps());
        System.out.println("Distance: " + Nazar.getDoneDistance());

        System.out.println("\nAndriy Info (Competition):");
        System.out.println("All Steps: " + Andriy.getAllSteps());
        System.out.println("Distance: " + Andriy.getDoneDistance());
    }
}
