class Circle extends Shape {

    public Circle(double val1) {
        this.val1 = val1;
    }

    @Override
    double calculateArea() {
        return Math.PI * val1 * val1;
    }
}
