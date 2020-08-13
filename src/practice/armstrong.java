package practice;

public class armstrong {
    public static void main(String[] args) {
        int num = 370, number, temp, total = 0;
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
            System.out.println("temp="+temp);
            System.out.println("total="+total);
            System.out.println("number="+number);
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}