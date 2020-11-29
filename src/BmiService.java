public class BmiService {
    public float calculate(int massKg, int heightSm) {
        float bmi = (float) (massKg * 1000000 / heightSm / heightSm) / 100;
        return bmi;
    }
}
