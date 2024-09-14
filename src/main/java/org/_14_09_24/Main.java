package org._14_09_24;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int maxTime = 21;
        Task task = new Task(1, 4, "Easy", 1000.0);
        Task task2 = new Task(2, 4, "Med", 2000.0);
        Task task3 = new Task(3, 12, "Hard", 3000.0);
        Task task4 = new Task(4, 12, "Hard", 3000.0);
        Task task5 = new Task(5, 5, "Other", 2400.0);
        List<Task> tasks = List.of(task, task2, task3, task4, task5);
        System.out.println(countMaxNumberOfTasks(maxTime, tasks));
    }

    public static int countMaxNumberOfTasks(int maxTime, List<Task> tasks) {
        List<Task> sortedTasks = tasks.stream().sorted(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getTime() - o2.getTime();
            }
        }).collect(Collectors.toList());

        int allTime = 0;
        int totalTasks = 0;

        for (Task task : sortedTasks) {
            if (allTime + task.getTime() <= maxTime) {
                allTime += task.getTime();
            } else {
                break;
            }
            totalTasks++;
        }
        return totalTasks;
    }
}

// 1 уровень сложности: 1. Начало недели, у разработчика в бэклоге есть список задач от разных отделов,
// Каждая из которых требует определённого времени для выполнения.
// Разработчик может в неделю работать определенное количество времени maxTime.
// Мы хотим выбрать максимальное количество задач, которые можно выполнить,
// учитывая ограничение по времени.
// Используйте подход жадного алгоритма по критерию: время выполнения задачи.