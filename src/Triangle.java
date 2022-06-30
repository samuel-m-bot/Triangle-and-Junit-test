public class Triangle {
    //default side value is 0
    //if the value of sides are 0 (after constructor call) then given sides do not form a triangle
    int sideA = 0, sideB = 0, sideC = 0;

    public Triangle(int sideA, int sideB, int sideC) {
        //check given sides if positive and form a triangle
        if (checkPositiveInteger(sideA,sideB,sideC) && checkTriangle(sideA,sideB,sideC)) {
            //set local variables if given sides are positive and form a triangle
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }
    //Method checks if given sides are positive number
    private boolean checkPositiveInteger(int sideA, int sideB, int sideC){
        return (sideA > 0 && sideB > 0 && sideC > 0);
    }
    //Method checks if given sides form a triangle
    private boolean checkTriangle(int sideA, int sideB, int sideC){
        //check if given sides obey inequality rule
        return (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideB);
    }
    //Method returns the type of triangle as String
    public String getType() {
        if (sideA == 0) { //if given sides do not form a triangle (or was negative)
            return "Not a triangle";
        } else if (sideA == sideB && sideB == sideC) { //if any two sides are equal
            return "Equilateral";
        } else if (sideA == sideB || sideB == sideC || sideC == sideA) { //if all sides are equal
            return "Isosceles";
        } else //if none of the sides are equal
            return "Scalene";
    }
}
