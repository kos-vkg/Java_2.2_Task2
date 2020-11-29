public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massBodi = 80;  // масса тела в кГ
        int height = 164; // рост в см
        float bmi = service.calculate(massBodi, height);
        String mess;
        if (bmi < 16.4) mess = " Выраженный дефицит массы";
        else if (bmi < 18.49) mess = " Недостаточная масса тела";
        else if (bmi < 24.99) mess = " Норма";
        else if (bmi < 29.99) mess = " Избыточная масса тела";
        else if (bmi < 34.99) mess = " ожирение 1 степени";
        else if (bmi < 39.99) mess = " ожирение 2 степени";
        else mess = "ожирение 3 степени";
        System.out.println("BMI = " + bmi + mess);
    }
}
