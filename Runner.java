package ki_302.Bihun.lab3;


//Підклас, що описує спортсмена-бігуна
public class Runner extends Human implements Athlete {

public Runner() {
   super(); // Викликаємо конструктор суперкласу
}

@Override
public void LeftLegStep() {
   allSteps++;
   updateDistance();
   System.out.println("Left leg step (running)");
}

@Override
public void RightLegStep() {
   allSteps++;
   updateDistance();
   System.out.println("Right leg step (running)");
}

// Реалізація методу тренування
@Override
public void train() {
   System.out.println("Starting training...");
   for (int i = 0; i < 100; i++) { // Тренування: 100 кроків
       if (i % 2 == 0) {
           LeftLegStep();
       } else {
           RightLegStep();
       }
   }
}

// Реалізація методу змагань
@Override
public void compete() {
   System.out.println("Competing in a race...");
   for (int i = 0; i < 200; i++) { // Участь у змаганнях: 200 кроків
       if (i % 2 == 0) {
           LeftLegStep();
       } else {
           RightLegStep();
       }
   }
}
}
