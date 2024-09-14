package org._14_09_24;

public class Task {
    private int id;
    private int time;
    private String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Task(int id, int time, String department, double v) {
        this.id = id;
        this.time = time;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getTime() {
        return time;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", time=" + time +
                ", department='" + department + '\'' +
                '}';
    }
}
// 1 уровень сложности: 1. Начало недели, у разработчика в бэклоге есть список задач от разных отделов,
//каждая из которых требует определённого времени для выполнения.
//Разработчик может в неделю работать определенное количество времени maxTime.
//Мы хотим выбрать максимальное количество задач, которые можно выполнить,
//учитывая ограничение по времени.
//Используйте подход жадного алгоритма по критерию: время выполнения задачи.