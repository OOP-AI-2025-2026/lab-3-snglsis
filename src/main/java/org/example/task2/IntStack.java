package org.example.task2;

import java.util.EmptyStackException;

public class IntStack {
    // Internal storage
    private int[] data; // скрытый массив для хранения элементов
    private int top; // указывает на следующий свободный индекс


    public IntStack()
    {
        this.data = new int[10]; // initial capacity
        this.top = 0;
    }


    public void push(int value)
    {
        if (this.top == this.data.length) {
            this.grow(); // increase capacity if full
        }
        this.data[this.top] = value;
        this.top++;
    }


    public int pop()
    {
        if (this.isEmpty())
        {
            throw new EmptyStackException();
        }
        this.top--;
        return this.data[this.top];
    }


    public int peek()
    {
        if (this.isEmpty())
        {
            throw new EmptyStackException();
        }
        return this.data[this.top - 1];
    }


    public int size()
    {
        return this.top;
    }

    public boolean isEmpty()
    {
        return this.top == 0;
    }


    public void clear()
    {
        this.top = 0;
    }

    private void grow()
    {
        int newCapacity = this.data.length * 2;
        int[] newData = new int[newCapacity];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;
    }
}
