package ki_302.Bihun.lab3;

// Абстрактний клас для людей
public abstract class Human {
    protected int allSteps; // Загальна кількість кроків або вправ
    protected double doneDistance; // Пройдена відстань або інша метрика (наприклад, стрибки)
    
    public Human() {
        this.allSteps = 0;
        this.doneDistance = 0;
    }

    // Абстрактні методи для виконання вправ
    public abstract void LeftLegStep(); // Для бігу, вправи на ноги
    public abstract void RightLegStep(); // Для бігу, вправи на ноги
    
    // Геттери
    public int getAllSteps() {
        return allSteps;
    }

    public double getDoneDistance() {
        return doneDistance;
    }

    // Методи для розрахунку відстані
    protected void updateDistance() {
        doneDistance = allSteps * 0.8; // Наприклад, кожен крок — 0.8 метра
    }
}






