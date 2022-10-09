import java.util.Objects;
import static java.lang.Math.sqrt;
public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Длина вектора. Корень из суммы квадратов
    double length(){ return sqrt(x*x + y*y + z*z); }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){ return x * vector.x + y * vector.y + z * vector.z; }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        double X = y * vector.z - z * vector.y;
        double Y = -(x * vector.z - z * vector.x);
        double Z = z * vector.y - y * vector.x;
        return new Vector(X, Y, Z);
    }

    // Косинус между двумя векторами
    double cos(Vector vector) { return scalarProduct(vector) / vector.length() / this.length(); }

    // Сумма двух векторов
    Vector add(Vector vector){
        double X = this.x + vector.x;
        double Y = this.y + vector.y;
        double Z = this.z + vector.z;

        return new Vector(X, Y, Z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        this.x -= vector.x;
        this.y -= vector.y;
        this.z -= vector.z;
        return this;
    }

//        @Override
        public int hashCode() {
            int hash = 0;
            char[]  x = Double.toString(this.x).toCharArray(),
                    y = Double.toString(this.x).toCharArray(),
                    z = Double.toString(this.x).toCharArray();
            int prime = 27, mod = (int)1e7 + 7;
            for (int i = 0; i < x.length; i++) {
                hash = (hash * prime + (int)(x[i])) % mod;
            }
            for (int i = 0; i < y.length; i++) {
                hash = (hash * prime + (int)(y[i])) % mod;
            }
            for (int i = 0; i < z.length; i++) {
                hash = (hash * prime + (int)(z[i])) % mod;
            }
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            Vector other = (Vector) obj;
            if (this == other)
                return true;
            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            if (z != other.z)
                return false;
            return true;
        }

    public static void main(String[] args) {
        Vector vector1 = new Vector(3.6, 9, 12);
        Vector vector2 = new Vector(-2, 4, -1);
        System.out.println("Длина первого вектора: " + vector1.length());
        System.out.println("Длина второго вектора: " + vector2.length());
        System.out.println("Скалярное произведение: " + vector1.scalarProduct(vector2));
        Vector cross = vector1.crossProduct(vector2);
        System.out.println("Векторное произведение: " + cross.x + " " + cross.y + " " + cross.z);
        System.out.println("Косинус угла между векторами: " + vector1.cos(vector2));
        Vector sum = vector1.add(vector2), delta = vector1.subtract(vector2);
        System.out.println("Сумма: " + sum.x + " " + sum.y + " " + sum.z);
        System.out.println("Разность V1 - V2: " + delta.x + " " + delta.y + " " + delta.z);
        System.out.println("Равенство хэшей: " + vector1.hashCode() + " != " + vector2.hashCode());
        System.out.println("Равны?: " + vector1.equals(vector2));
        System.out.println("Равны?: " + vector1.equals(vector1));

    }
}
