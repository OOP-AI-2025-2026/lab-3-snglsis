package org.example.task2;

public class Item {
    private long id;
    private String name;
    private double price;

    public Item(long id, String name, double price)
    {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public long getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return this.price;
    }

    private void setId(long id)
    {
        this.id = id;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    private void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Item{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                "}\n";
    }
}