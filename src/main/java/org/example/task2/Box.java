package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public static void main(String[] args)
    {
        try
        {
            Box box = new Box(3, 4, 5);

            System.out.println("Surface area: " + box.getSurfaceArea());
            System.out.println("Lateral surface area: " + box.getLateralSurfaceArea());
            System.out.println("Volume: " + box.getVolume());
        } catch (IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public Box(double length, double width, double height)
    {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }


    private void setLength(double length)
    {
        if (length <= 0)
        {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    private void setWidth(double width)
    {
        if (width <= 0)
        {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    private void setHeight(double height)
    {
        if (height <= 0)
        {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        this.height = height;
    }

    // Методы для вычислений
    public double getSurfaceArea()
    {
        // Площадь поверхности: 2*(lw + lh + wh)
        return 2 * (length * width + length * height + width * height);
    }

    public double getLateralSurfaceArea()
    {
        // Площадь боковой поверхности: 2*height*(length + width)
        return 2 * height * (length + width);
    }

    public double getVolume()
    {
        // Объем: l * w * h
        return length * width * height;
    }
}
