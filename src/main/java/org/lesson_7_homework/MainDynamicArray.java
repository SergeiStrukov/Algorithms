package org.lesson_7_homework;

public class MainDynamicArray {
    public static void main(String[] args) {
        DynamicIntArray array = new DynamicIntArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println("count = "+array.getCount()+" ---- size = "+ array.getSize());
        array.printArray();

        array.add(6);
        System.out.println("count = "+array.getCount()+" ---- size = "+ array.getSize());
        array.printArray();

        // используем пользовательский коэффициент приращения массива
        DynamicIntArray array1 = new DynamicIntArray(5, 1.4F);
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        System.out.println("count = "+array1.getCount()+" ---- size = "+ array1.getSize());
        array1.printArray();

        array1.add(6);
        System.out.println("count = "+array1.getCount()+" ---- size = "+ array1.getSize());
        array1.printArray();
        System.out.println(array1.contains(6));
        System.out.println(array1.contains(7));

        DynamicIntArray array2 = new DynamicIntArray();
        array2.add(1);
        array2.add(2);

        System.out.println("count = "+array2.getCount()+" ---- size = "+ array2.getSize());
        array2.printArray();
        System.out.println(array2.isEmpty());
        array2.deleteAllElements();

        System.out.println("count = "+array2.getCount()+" ---- size = "+ array2.getSize());
        array2.printArray();
        System.out.println(array2.isEmpty());

        DynamicIntArray array3 = new DynamicIntArray();
        array3.add(1);
        array3.add(2);
        array3.add(2);

        System.out.println("count = "+array3.getCount()+" ---- size = "+ array3.getSize());
        array3.printArray();
        array3.addArray(array);
        System.out.println("count = "+array3.getCount()+" ---- size = "+ array3.getSize());
        array3.printArray();
        System.out.println(array3.removeValue(2));
        array3.printArray();


    }
}