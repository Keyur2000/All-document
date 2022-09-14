import StatUtils.*;
public class d1{
public static void main(String[] args) {
    double[] arr = new double[]{900.68, 900.63, 900.74, 900.59, 900.49, 900.65, 900.81, 900.82, 901.03, 900.74, 900.66, 900.49, 900.52, 900.63, 900.45};
    double normArr[] = StatUtils.normalize(arr);
    for (int i = 0; i < normArr.length; i++) {
        System.out.print(normArr[i] + ", ");
    }
}
}