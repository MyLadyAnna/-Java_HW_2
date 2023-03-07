//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации (после перемещения числа) запишите в лог-файл.
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class task001 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task001.class.getName());
        FileHandler fh = new FileHandler("logtask001.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] array = {1,5,9,-3,0};
        logger.info("Сортировка массива: " + Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        int[] array2 = sortMassive(array);
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(array2)); 
        logger.info("Отсортированный массив: " + Arrays.toString(array2));
    }

    public static int[] sortMassive(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    
}