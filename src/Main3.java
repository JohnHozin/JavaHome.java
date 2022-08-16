public class Main3 {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 13, 7, 6, 4};
        int size = numbers.length;
        int maxId = 0;
        int max = numbers[maxId];
        int index = 0;
        while (index < size){
            if(numbers[index] > max) {
                maxId = index;
                max = numbers[index];
            }
            index = index + 1;
        }
        numbers[maxId] = numbers[size-1];
        numbers[size-1] = max;
        for (int n:numbers)
            System.out.print(n + " ");
    }
}
