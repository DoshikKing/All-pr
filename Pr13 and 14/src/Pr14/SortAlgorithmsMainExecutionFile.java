package Pr14;
import com.company.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}

class BinarySearch {
    int deep = 0;

    public static int binSearch_r (int[] data, int value, int from, int to) {
        if (from <= to) {
            int middle = (from+to)/2;

            if (data[middle] > value) {
                return binSearch_r(data, value, from, middle - 1);
            } else if (data[middle] < value) {
                return binSearch_r(data, value, middle+1, to);
            }
            return middle;
        }
        return -1;
    }

    // бинарный поиск итеративный
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;// для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }

    public static int linear(int[] array, int item, int i) {
        if (array[i] == item) {
            return i;
        } else {
            if (i < array.length) {
                return linear(array, item, i + 1);
            } else {
                return 0;
            }
        }
    }
}

public class SortAlgorithmsMainExecutionFile {
    public static void main(String[] args) {

        int[] d = new int[5];
        ArrayList<Student> students = new ArrayList();
        ArrayList<Integer> iDNumber = new ArrayList();
        Student student1 = new Student(123456,"Petya",4);
        Student student2 = new Student(234567,"Kirill",3.4);
        Student student3 = new Student(100000,"Oleg",3.1);
        Student student4 = new Student(555555,"Umar",1);
        Student student5 = new Student(890678,"Gregory",2.4);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.forEach(student -> iDNumber.add(student.getID()));

        int[] newId = new int[iDNumber.size()];
        for (int i = 0; i < iDNumber.size(); i++) {
           newId [i] = iDNumber.get(i);
        }

        System.out.println("Choose type of sort or search(1-quick, 2-merge, 3-binary recursive, 4-binary)");

        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();

        int m;
        Scanner scn1 = new Scanner(System.in);
        m = scn1.nextInt();

        BinarySearch fst = new BinarySearch();

        switch(n)
        {
            case 1:{
                QuickSort.quickSort(newId, 0 , newId.length-1);

                for (int i = 0; i < iDNumber.size(); i++) {
                    System.out.println(newId[i]);
                }
            }
            break;
            case 2:{
                QuickSort.mergesort(newId);
                for (int i = 0; i < iDNumber.size(); i++) {
                    System.out.println(newId[i]);
                }
            }
            break;
            case 3:{
                System.out.println(m +" является " + fst.binSearch_r(newId, m, -1, newId.length-1) + " элементом в массиве");
            }
            break;
            case 4:{
                fst.binarySearch(newId,-1, newId.length-1, m);
            }
            break;
            case 5:{
                System.out.println(m +" является " +fst.linear(newId, m, 0) + " элементом в массиве");
            }
            break;
            case 6:{
                for(int i = 0; i < newId.length; i++){
                    if(newId [i] == m)
                        System.out.println(m +" является " +i + " элементом в массиве");
                }
            }
            break;
        }











    }
}
