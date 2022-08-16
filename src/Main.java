public class Main {
    public static void main(String[] args) {
        int numbers[] = {2, 8, 14, -34, -9, 7, 7, 4};
        int size = numbers.length;
        int count = 0;
        int index = 0;
        while (index < size){
            if(numbers[index] > 0)
                count = count + 1;
            index = index + 1;
        }
        System.out.println(count);
    }
}
