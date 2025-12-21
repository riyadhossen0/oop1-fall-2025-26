class Rectangle extends Shape {

    public Rectangle(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    double calculateArea() {
        return val1 * val2;
    }
}